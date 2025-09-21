package com.algaworks.algafood.di.notificacao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.model.Cliente;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
@Profile("prod")

//Permite definir a prioridade da injeção do bean com essa anotação
//@Primary

@TipoDoIdentificador(NivelUrgencia.SEM_URGENCIA)
public class NotificadorEmail implements Notificador {
	
	@Value("${notificador.email.host-servidor}")
	private String host;
	@Value("${notificador.email.porta-servidor}")
	private Integer porta;
	
	public NotificadorEmail() {
		System.out.println("Notificador e-mail prod");
	}

	private boolean caixaAlta;
	
	public void notificar(Cliente cliente, String mensagem) {
		mensagem = caixaAlta ? mensagem.toUpperCase() : mensagem;
		System.out.println("Host: " + host);
		System.out.println("Porta: " + porta);
		System.out.printf("Notificando %s através do e-mail %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}

	public boolean isCaixaAlta() {
		return caixaAlta;
	}

	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}
}
