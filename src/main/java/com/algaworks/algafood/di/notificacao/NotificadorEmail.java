package com.algaworks.algafood.di.notificacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.model.Cliente;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
@Profile("production")

//Permite definir a prioridade da injeção do bean com essa anotação
//@Primary

@TipoDoIdentificador(NivelUrgencia.SEM_URGENCIA)
public class NotificadorEmail implements Notificador {
	
	@Autowired
	private NotificadorProperties notificadorProperties;
	
	public NotificadorEmail() {
		System.out.println("Notificador e-mail prod");
	}

	private boolean caixaAlta;
	
	public void notificar(Cliente cliente, String mensagem) {
		mensagem = caixaAlta ? mensagem.toUpperCase() : mensagem;
		System.out.println("Host: " + notificadorProperties.getHostServidor());
		System.out.println("Porta: " + notificadorProperties.getPortaServidor());
		System.out.printf("Notificando %s através do e-mail %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}
}
