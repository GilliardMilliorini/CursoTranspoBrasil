package br.com.cursojava.aula024;

import org.junit.Assert;
import org.junit.Test;

public class RepositorioContatoTeste {
	
	
	@Test
	public void testeAdicionar(){
		RepositorioContato repositorio = new RepositorioContatoMemory();

		int quantidade = repositorio.buscarTodos().size();
		Assert.assertEquals(0, quantidade);
		repositorio.adicionar(new Contato(null, "João", "joao@joao", "99999999", TipoContato.AMIGO));		// atribuindo um valod para o campo adicionar
		quantidade = repositorio.buscarTodos().size();														// atribuindo  o valor de adicionar para quantidade
		Assert.assertEquals(1, quantidade);																	//
		
		
	}
	
	
	@Test
	public void testeAdicionar2(){
		RepositorioContato repositorio = new RepositorioContatoMemory();

		int quantidade = repositorio.buscarTodos().size();
		Assert.assertEquals(0, quantidade);
		repositorio.adicionar(new Contato(null, "João", "joao@joao", "99999999", TipoContato.AMIGO));		// atribuindo um valod para o campo adicionar
		Assert.assertTrue(repositorio.buscarTodos().get(0).getId() != null);					// verifica se foi adicionado e se esta sendo setado o ID pro cadastro													//
		
	}

	
	public void testEditar(){
		RepositorioContato repositorio = new RepositorioContatoMemory();
		repositorio.adicionar(new Contato(null, "João", "joao@joao", "99999999", TipoContato.AMIGO));
		Integer id = repositorio.buscarTodos().get(0).getId();										//
		Contato contato = new Contato(id,"Nome alterado","","",TipoContato.AMIGO);
		repositorio.editar(contato);
		Contato alterado = repositorio.buscarTodos().get(0);
		Assert.assertEquals(contato.getId(),  alterado.getId());
		Assert.assertEquals(contato.getid(),  alterado.getId());
		Assert.assertEquals(contato.getid(),  alterado.getId());
		Assert.assertEquals(contato.getid(),  alterado.getId());
		Assert.assertEquals(contato.getid(),  alterado.getId());
		
		
	}
	
	
	
	
}



