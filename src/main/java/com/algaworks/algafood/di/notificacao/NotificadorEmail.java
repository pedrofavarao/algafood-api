package com.algaworks.algafood.di.notificacao;

import com.algaworks.algafood.di.model.Cliente;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotificadorEmail implements Notificador {
	
	private boolean caixaAlta;
	private String hostServidorSmtp;
	
	public NotificadorEmail(String hostServidorSmtp) {
		this.hostServidorSmtp = hostServidorSmtp;
		System.out.println(hostServidorSmtp);
	}

	public void notificar(Cliente cliente, String mensagem) {
		mensagem = caixaAlta ? mensagem.toUpperCase() : mensagem;
		System.out.printf("Notificando %s através do e-mail %s usando o host %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), this.hostServidorSmtp, mensagem);
	}

	public boolean isCaixaAlta() {
		return caixaAlta;
	}

	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}
}
