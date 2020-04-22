package br.fuctura.cozinha.DAO;

import java.util.List;

import br.fuctura.cozinha.model.Profissional;

public interface ImplementeProfissionalDAO {
	
public boolean inserir(Profissional profissional);

	public void alterar(Profissional profissional);

	public void remover(Profissional profissional);
	
	public Profissional pesquisar(String cpf);
	
	public List<Profissional> listarTodos();

}
