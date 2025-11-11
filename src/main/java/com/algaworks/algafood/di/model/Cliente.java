package com.algaworks.algafood.di.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente {

	private String nome;
	private String email;
	private String telefone;
	private boolean ativo = false;

	public Cliente(String nome, String email, String telefone) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	
	public void ativar() {
		this.ativo = true;
	}
}
