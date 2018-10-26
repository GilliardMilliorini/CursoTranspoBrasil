package br.com.cursojava.aula033;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class ChildDAO  implements RepositorioChild{

	@Override
	public List<Child> listarTodos() {
		EntityManager ent = JPAUtil.getEntityManagerFactory().createEntityManager();
		TypedQuery<Child> query = ent.createQuery("from Child", Child.class);
		List<Child> childs = query.getResultList();
		ent.close();	
		
		return childs;
	}

	@Override
	public Child buscarPorId(Integer id) {
		Child child = null;
		if(id != null){
		EntityManager ent = JPAUtil.getEntityManagerFactory().createEntityManager();
		ent.getTransaction().begin();
		child = ent.find(Child.class, id);
		ent.close();
		
		}
		return child;
	}

	@Override
	public boolean incluir(Child child) {
	boolean resultado = false; 
	if(child != null && child.getId()== null){
		EntityManager ent = JPAUtil.getEntityManagerFactory().createEntityManager();
		ent.getTransaction().begin();
		ent.persist(child);
		ent.getTransaction().commit();
		ent.close();
		resultado = child.getId() != null;
		
	}
	
		return resultado;
	}

	@Override
	public boolean atualizar(Child child) {
	
		boolean resultado = false;
		if(child != null && child.getId() != null){
			EntityManager ent = JPAUtil.getEntityManagerFactory().createEntityManager();
			try{
				ent.getTransaction().begin();
				ent.merge(child);
				ent.getTransaction().commit();
				ent.close();
				resultado = true;
			} catch(Exception e){
				if(ent != null && ent.isOpen()){
					ent.getTransaction().rollback();
				}
			}
		}
		
		return resultado;
	}

	@Override
	public boolean remover(Integer id) {

		boolean resultado = false;
		if(id > 0){
			EntityManager ent = JPAUtil.getEntityManagerFactory().createEntityManager();
			try{
				ent.getTransaction().begin();
				ent.remove(ent.find(Child.class, id));
				ent.getTransaction().commit();
				ent.close();
				resultado = true;
			}catch (Exception e){
				if(ent != null && ent.isOpen()){
					ent.getTransaction().rollback();
				}
			}
		}
		
		
		return resultado;
	}
	
	
	

}
