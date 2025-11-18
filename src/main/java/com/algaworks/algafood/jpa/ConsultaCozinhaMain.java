package com.algaworks.algafood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.model.Cozinha;

public class ConsultaCozinhaMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CadastroCozinha cadastroCozinha = applicationContext.getBean(CadastroCozinha.class);
		
		Cozinha cozinha1 = new Cozinha();
		cozinha1.setNome("Brasileira");
		
		Cozinha cozinha2 = new Cozinha();
		cozinha2.setNome("Chinesa");
		
		cozinha1 = cadastroCozinha.cadastrar(cozinha1);
		cozinha2 = cadastroCozinha.cadastrar(cozinha2);
		
		List<Cozinha> lista = cadastroCozinha.listar();
		for(Cozinha cozinha : lista) {
			System.out.println(cozinha.getNome());
		}
		
		System.out.println(cadastroCozinha.existeCozinha(4).toString());
		cadastroCozinha.remover(4);
		
		cadastroCozinha.atualizar(1, "Japonesa");
		
		lista = cadastroCozinha.listar();
		for(Cozinha cozinha : lista) {
			System.out.println(cozinha.toString());
		}
	}

}
