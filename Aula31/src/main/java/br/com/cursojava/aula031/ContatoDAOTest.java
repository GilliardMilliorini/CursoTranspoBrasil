package br.com.cursojava.aula031;

import java.util.List;

public class ContatoDAOTest {

	
	public static void main(String[] args) {
		
		Contato c1 = new Contato(null,"João", "joao@teste.com", "33332211");
		Contato c2 = new Contato(null,"Maria", "maria@teste.com", "33334455");
		ContatoDAO dao = new ContatoDAO();
		dao.inserir(c1);
		dao.inserir(c2);
		
		List<Contato> lista = dao.buscarTodos();
		
		for(Contato contato : lista){
			System.out.println(contato);
		}
		
	}
	
}
