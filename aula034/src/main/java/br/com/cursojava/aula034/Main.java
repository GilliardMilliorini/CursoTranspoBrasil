package br.com.cursojava.aula034;

import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;

public class Main {

	public static void main(String[] args) {
		
		
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		
		Tarefa t1 =  new Tarefa(null, "tarefa do bonzão", StatusTarefa.NOVA,new Date(),new Date());
		Usuario u = new Usuario(null,"Tiburcio ADM Correto","tibadm2@teste.com", Arrays.asList(t1));
		t1.setUsuario(u);
		Set<PerfilUsuario> perfis = new HashSet<>();
		perfis.add(PerfilUsuario.BAGRINHO);
		perfis.add(PerfilUsuario.MANAGER);
		perfis.add(PerfilUsuario.ADMIN);
		u.setPerfis(perfis);
		entityManager.persist(u);
		
		Tarefa tarefa = new Tarefa();
		tarefa.setTitulo("Minha primeira tarefa");
		tarefa.setStatus(StatusTarefa.NOVA);
		tarefa.setCriadoEm(new Date());
		tarefa.setAtualizadoEm(new Date());
		
		
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	
}
