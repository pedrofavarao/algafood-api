package com.algaworks.algafood.jpa;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.algaworks.algafood.domain.model.Cozinha;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Component
public class CadastroCozinha {
	
	@PersistenceContext
	private EntityManager manager;
	
	public List<Cozinha> listar(){
//		return manager.createQuery("FROM Cozinha", Cozinha.class).getResultList();
		return manager.createNativeQuery("SELECT * FROM cozinha", Cozinha.class).getResultList();
	}
	
	@Transactional
	public Cozinha cadastrar(Cozinha cozinha) {
		return manager.merge(cozinha);
	}
	
	public Cozinha existeCozinha(int id) {
		return manager.find(Cozinha.class , id);
	}
	
	@Transactional
	public Cozinha atualizar(int id, String nome) {
		Cozinha cozinha = this.existeCozinha(id);
		cozinha.setNome(nome);
		return manager.merge(cozinha);
	}
	
	@Transactional
	public void remover(int id) {
		Cozinha cozinha = this.existeCozinha(id);
		manager.remove(cozinha);
	}
}
