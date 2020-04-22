package br.com.fuctura.cozinha.main;

import br.fuctura.cozinha.DAO.ImplementeProfissionalDAO;
import br.fuctura.cozinha.DAO.ProfissionalDAO;

public class Main {

	public static void main(String[] args) {
		
		ImplementeProfissionalDAO ipd = new ProfissionalDAO();
		
		System.out.println(ipd.listarTodos());

	}

}
