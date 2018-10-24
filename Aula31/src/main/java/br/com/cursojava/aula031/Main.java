package br.com.cursojava.aula031;

import java.math.BigInteger;

import javax.persistence.EntityManager;

public class Main {

	public static void main(String[] args) {
		EntityManager entitymanager = JPAUtil.getEntitymanegerFactory().createEntityManager(); // cria um entitymanager 
		
		
		Pessoa ana = new Pessoa(3,"Ana Maria Moreira");
		entitymanager.getTransaction().begin();
		Pessoa anaSincronizada = entitymanager.merge(ana);		// merge busca no banco o registro, se ja ouver ele trará, se nao ele cria novo
		
		Pessoa p = entitymanager.find(Pessoa.class, 1);
		System.out.println(p.getId());
		System.out.println(p.getNome());
		p.setNome("Tiburcio da silva Brasil pereira ");		
		//entitymanager.persist(p);
		
		String sql = "select count(*) from pessoas";
		
		BigInteger result = (BigInteger) entitymanager.createNativeQuery(sql).getSingleResult();
		
		System.out.println(result.intValue());
		System.out.println(p.getId());
		System.out.println(p.getNome());
		
		entitymanager.getTransaction().commit();
		entitymanager.close();
		
		JPAUtil.shutdown();
		System.exit(0);
	}
	
}
