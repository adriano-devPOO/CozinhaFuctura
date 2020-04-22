package br.fuctura.cozinha.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class JpaUtil {

	private static EntityManagerFactory factory;

    static {
    	
    	try {
    		
    		factory = Persistence.createEntityManagerFactory("SEFAZ");
			
		} catch (Exception e) {
			
			System.out.println("Erro conexão!");
			
		}
        
    }

    public static EntityManager getEntityManager() {
        return factory.createEntityManager();
    }

    public static void close() {
        factory.close();
    }
}
