package com.algaworks.algafood;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Produto {
    private String nome;
    private BigDecimal valorTotal;
}
