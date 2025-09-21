package com.algaworks.algafood.di.service;

import com.algaworks.algafood.di.model.Cliente;

import lombok.Getter;

@Getter
public class ClienteAtivadoEvent {
	private Cliente cliente;

	public ClienteAtivadoEvent(Cliente cliente) {
		super();
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
