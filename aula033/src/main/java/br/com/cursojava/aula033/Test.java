package br.com.cursojava.aula033;

import javax.persistence.EntityManager;

	public class Test {
		
		
		
		public static void main(String[] args) {
			EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
			entityManager.getTransaction().begin();
			Owner own = new Owner(null,"João da Silva");
			Child chi = new Child(null, "Child João da silva", own);
			entityManager.persist(chi);
			Child child= entityManager.find(Child.class, 2);
			System.out.println("Mostrar os dados do Child");
			System.out.println(child.getId());
			System.out.println(child.getNome());
			System.out.println("Mostrar os dados do owner...");
			System.out.println(child.getOwner().getId());
			entityManager.getTransaction().commit();
			entityManager.close();
			
			JPAUtil.shutdown();
			System.exit(0);
				}
	}






