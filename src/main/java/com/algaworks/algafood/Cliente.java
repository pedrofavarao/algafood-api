package com.algaworks.algafood;

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

    public void ativar(){
        this.ativo = true;
    }
}
