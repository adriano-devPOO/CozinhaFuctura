package br.fuctura.cozinha.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import br.fuctura.cozinha.model.Profissional;

public class ProfissionalDAO implements ImplementeProfissionalDAO{
	
	private EntityManager ent;

	
	public ProfissionalDAO() {
		
		
	}

	public ProfissionalDAO(EntityManager ent) {
		this.ent = ent;
	}

	public boolean inserir(Profissional profissional) {
		
		EntityTransaction tx = ent.getTransaction();
		tx.begin();

		ent.persist(profissional);
		tx.commit();
		
		return true;
	}

	public void alterar(Profissional profissional) {
		
		EntityTransaction tx = ent.getTransaction();
		tx.begin();

		ent.merge(profissional);
		tx.commit();

	}

	public void remover(Profissional profissional) {
		
		EntityTransaction tx = ent.getTransaction();
		tx.begin();

		ent.remove(profissional);
		tx.commit();

	}
	
	public Profissional pesquisar(String cpf) {

		Profissional profissional = ent.find(Profissional.class, cpf);
		
		return profissional;
		
	}
	
	public List<Profissional> listarTodos() {

		Query query = ent.createQuery("from Profissional u");
		
		@SuppressWarnings("unchecked")
		List<Profissional> profissional = query.getResultList();
	
		return profissional;
		
	}

}
