package com.algaworks.algafood.di.notificacao;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.model.Cliente;

@Component
@TipoDoIdentificador(NivelUrgencia.URGENTE)
public class NotificadorSMS implements Notificador {
	private boolean caixaAlta;

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		mensagem = caixaAlta ? mensagem.toUpperCase() : mensagem;
		System.out.printf("Notificando %s por SMS através do telefone %s: %s\n", 
				cliente.getNome(), cliente.getTelefone(), mensagem);
	}
	
}
