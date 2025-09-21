package com.algaworks.algafood.di.notificacao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.model.Cliente;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
@Profile("dev")
@TipoDoIdentificador(NivelUrgencia.SEM_URGENCIA)
public class NotificadorEmailMock implements Notificador{
	private boolean caixaAlta;
	
	public NotificadorEmailMock() {
		System.out.println("Notificador e-mail dev");
	}
	
	public void notificar(Cliente cliente, String mensagem) {
		mensagem = caixaAlta ? mensagem.toUpperCase() : mensagem;
		System.out.printf("MOCK: Notificando %s através do e-mail %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}
}
