package com.algaworks.di;

import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.notificacao.NotificadorEmail;
import com.algaworks.di.notificacao.NotificadorSMS;
import com.algaworks.di.service.AtivacaoClienteService;

public class main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Pedro", "pedro@gmail.com", "16993223662");
        AtivacaoClienteService ativacao = new AtivacaoClienteService(new NotificadorEmail());
        ativacao.ativar(cliente);
    }
}
