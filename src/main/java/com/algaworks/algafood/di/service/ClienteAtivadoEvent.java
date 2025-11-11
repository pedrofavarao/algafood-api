package com.algaworks.algafood.di.service;

import com.algaworks.algafood.di.model.Cliente;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteAtivadoEvent {
	private Cliente cliente;

	public ClienteAtivadoEvent(Cliente cliente) {
		super();
		this.cliente = cliente;
	}
}
