package com.algaworks.algafood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.model.Cliente;
import com.algaworks.algafood.di.notificacao.NivelUrgencia;
import com.algaworks.algafood.di.notificacao.Notificador;
import com.algaworks.algafood.di.notificacao.TipoDoIdentificador;

@Component
public class AtivacaoClienteService {

	@Autowired(required = false)
	@TipoDoIdentificador(NivelUrgencia.SEM_URGENCIA)
	private Notificador notificador;
	
//	@PostConstruct
	private void init() {
		System.out.println("INIT");
	}
	
//	@PreDestroy
	private void destroy() {
		System.out.println("DESTROY");
	}
	
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
	
	
//Resolvendo ambiguidade de varios beans com uma lista
//	@Autowired(required = false)
//	private List<Notificador> notificadores;
//	
//	
//	public void ativar(Cliente cliente) {
//		cliente.ativar();
//		for (Notificador notificador : notificadores) {
//			notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
//		}
//	}
}
