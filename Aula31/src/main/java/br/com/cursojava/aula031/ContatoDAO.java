package br.com.cursojava.aula031;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class ContatoDAO {

	public List<Contato> buscarTodos(){
		EntityManager em = JPAUtil.getEntitymanegerFactory().createEntityManager();
		TypedQuery<Contato> querry = em.createQuery("from contato", Contato.class);
		List<Contato> lista = querry.getResultList();
		em.close();
		return lista;
	}
	
	
	public List<Contato> buscarPorNome(String nome){
		EntityManager em = JPAUtil.getEntitymanegerFactory().createEntityManager();
		TypedQuery<Contato> querry = em.createQuery("from Contato c where upper(c.nome) like upper(:nome)", Contato.class);
		querry.setParameter("nome", "%"+nome+"%");
		List<Contato> lista = querry.getResultList();
		em.close();
		return lista;
	}
	
	
	
	public boolean inserir(Contato contato){
		boolean resultado = false; 
		if(contato != null && contato.getId()== null){
			EntityManager em = JPAUtil.getEntitymanegerFactory().createEntityManager();
			em.getTransaction().begin();
			em.persist(contato);
			em.getTransaction().commit();
			em.close();
			resultado = contato.getId() != null;
		}
		return resultado;
	}

	
	public boolean atualizar(Contato contato){
		boolean resultado = false; 
		if(contato != null && contato.getId()!= null){
			EntityManager em = JPAUtil.getEntitymanegerFactory().createEntityManager();
			try{
			em.getTransaction().begin();
			em.persist(contato);
			em.getTransaction().commit();
			em.close();
			resultado = true;
			} catch(Exception e){
				if(em != null && em.isOpen()){
				em.getTransaction().rollback();
			}
		}
	}
	return resultado;
   }
	
	
	public boolean remover(Contato contato){
		boolean resultado = false; 
		if(contato != null && contato.getId()!= null){
			EntityManager em = JPAUtil.getEntitymanegerFactory().createEntityManager();
			try{
			em.getTransaction().begin();
			contato = em.merge(contato);
			em.remove(contato);
			em.getTransaction().commit();
			em.close();
			resultado = true;
			} catch(Exception e){
				if(em != null && em.isOpen()){
				em.getTransaction().rollback();
			}
		}
	}
	return resultado;
   }
	
	
}
