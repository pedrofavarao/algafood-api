package com.algaworks.di.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cliente {
    private String nome;
    private String email;
    private String telefone;
    private boolean ativo;

    public Cliente(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.ativo = false;
    }

    public void ativar(){
        this.ativo = true;
    }
}
