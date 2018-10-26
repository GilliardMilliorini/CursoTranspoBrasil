package br.com.cursojava.aula033;

import javax.persistence.EntityManager;


public class Main {
	
	
	
	public static void main(String[] args) {
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
//		Endereco end = new Endereco(null,"Rua teste3", "1003");
//		Funcionario func = new Funcionario(null, "Funcionario03", end);
//		//entityManager.persist(end);
//		entityManager.persist(func);
//		Funcionario funcionario = entityManager.find(Funcionario.class, 2);
//		System.out.println("Mostrar os dados do funcionario");
//		System.out.println(funcionario.getId());
//		System.out.println(funcionario.getNome());
//		System.out.println("Mostrar os dados do endereço...");
//		System.out.println(funcionario.getEndereco().getRua());
		
		Endereco endereco = entityManager.find(Endereco.class,1);
		System.out.println(endereco.getFunctionario());
		entityManager.getTransaction().commit();
		entityManager.close();
		
//		JPAUtil.shutdown();
//		System.exit(0);
			}
}



