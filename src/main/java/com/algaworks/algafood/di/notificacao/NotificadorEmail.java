package com.algaworks.algafood.di.notificacao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.model.Cliente;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component

//Permite definir a prioridade da injeção do bean com essa anotação
//@Primary

@TipoDoIdentificador(NivelUrgencia.SEM_URGENCIA)
public class NotificadorEmail implements Notificador {
	
	private boolean caixaAlta;
	
	public void notificar(Cliente cliente, String mensagem) {
		mensagem = caixaAlta ? mensagem.toUpperCase() : mensagem;
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
