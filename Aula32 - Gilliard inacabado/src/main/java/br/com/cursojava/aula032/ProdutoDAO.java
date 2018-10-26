package br.com.cursojava.aula032;

import java.sql.ResultSet;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class ProdutoDAO implements RepositorioProduto {

	public List<Produto> buscarTodos() {
		
		EntityManager ent =JPAUtil.getEntitymanegerFactory().createEntityManager();
		TypedQuery<Produto> querry = ent.createQuery("from produtos", Produto.class);
		List<Produto> lista = querry.getResultList();
		ent.close();		
		return lista;
	}
		
	

	public List<Produto> buscarPorNome(String nome) {
	
		EntityManager ent = JPAUtil.getEntitymanegerFactory().createEntityManager();
		TypedQuery<Produto> query = ent.createQuery("from produtos c where upper(c.nome) like upper(:nome)", Produto.class);
		query.setParameter("nome","%"+nome+"%");
		List<Produto> lista = query.getResultList();
		ent.close();
		return lista;
	}

//	public List<Produto> buscarPorPreco(double minimo, double maximo) {
////		
////		EntityManager ent = JPAUtil.getEntitymanegerFactory().createEntityManager();
////		TypedQuery<Produto> query = ent.createQuery("from produtos c where preco = ?:", Produto.class);
////		query.setParameter(1, preco)
////		List<Produto> lista = query.getResultList();
////		ent.close();
////		return lista;
////		
////		return null;
//	}
	
	

	public Produto buscarPorId(Integer id) {
		
		
		Produto produto = null;
		if (id != null) {

			try {
				EntityManager ent = JPAUtil.getEntitymanegerFactory().createEntityManager();
				TypedQuery<Produto> query = ent.createQuery("from produtos where id = ?", Produto.class);
				query.setParameter(1, id);
				List<Produto> lista = query.getResultList();
				ent.close();
		return lista;
	}
		}
	
		
		
		return null;
	}

	public boolean inserir(Produto produto) {
		
		boolean resultado = false;
		if(produto != null && produto.getId() == null){
			EntityManager ent = JPAUtil.getEntitymanegerFactory().createEntityManager();
			ent.getTransaction().begin();
			ent.persist(produto);
			ent.getTransaction().commit();
			ent.close();
			resultado = produto.getId()!= null; 
		}
		return resultado;
		
	}

	public boolean atualizar(Produto produto) {
		
		boolean resultado = false;
		EntityManager ent = JPAUtil.getEntitymanegerFactory().createEntityManager();
		try{
			ent.getTransaction().begin();
			ent.persist(produto);
			ent.getTransaction().commit();
			ent.close();
			resultado = true;
		} catch(Exception e){
			if(ent != null && ent.isOpen()){
				ent.getTransaction().rollback();
			}
		}
		 return resultado;
		
	}

	public boolean remover(Produto produto) {
	
		boolean resultado  = false;
		if(produto != null && produto.getId() != null){
			EntityManager ent = JPAUtil.getEntitymanegerFactory().createEntityManager();
			try{
				ent.getTransaction().begin();
				produto = ent.merge(produto);
				ent.remove(produto);
				ent.getTransaction().commit();
				ent.close();
				resultado = true;
			} catch (Exception e){
				ent.getTransaction().rollback();
			}
		}
		
		return resultado;
	}

	public int contar() {
	
		
		
		return 0;
	}




}
