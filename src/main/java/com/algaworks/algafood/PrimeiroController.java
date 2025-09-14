package com.algaworks.algafood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.algaworks.algafood.di.model.Cliente;
import com.algaworks.algafood.di.service.AtivacaoClienteService;

@Controller
public class PrimeiroController {
	
	private AtivacaoClienteService ativacaoClienteService;
	
	public PrimeiroController(AtivacaoClienteService ativacaoClienteService) {
		super();
		this.ativacaoClienteService = ativacaoClienteService;
	}

	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		Cliente pedro = new Cliente("Pedro", "pedrofavarao@gmail.com", "(16) 99322-3662");
		this.ativacaoClienteService.ativar(pedro);
		return "Vai dar tudo certo meu caro!!!";
	}
}
