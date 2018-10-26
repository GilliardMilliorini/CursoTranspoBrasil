package br.com.cursojava.aula032;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	
	private static final String PERSISTENCE_UNIT_NAME = "PERSISTENCE";
	private static EntityManagerFactory factory;	// gerencia as conexões do banco de dados de acoro com o arquivo persistence
	
	public static EntityManagerFactory getEntitymanegerFactory(){ //EntityManagerFactory cria e gerencia as conexões do banco de dados
		if(factory == null){
			factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		}
		return factory;
	}
	public static void shutdown(){
		if(factory!=null){
			factory.close();
		}
	}

}
