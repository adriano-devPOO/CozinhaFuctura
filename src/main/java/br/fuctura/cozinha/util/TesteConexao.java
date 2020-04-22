package br.fuctura.cozinha.util;

import javax.persistence.EntityManager;

public class TesteConexao {

	public static void main(String[] args) {
		
		EntityManager conn = JpaUtil.getEntityManager();
		System.out.println("Conectado (" + conn + ")");
		
		

	}

}
