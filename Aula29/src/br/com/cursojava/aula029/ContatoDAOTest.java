package br.com.cursojava.aula029;

import java.util.List;

public class ContatoDAOTest {

	public static void main(String[] args) {
		
		
		ContatoDAO dao = new ContatoDAO();
		List<Contato> listaContatos = dao.buscarTodos();
		for(Contato contatos : listaContatos){
			System.out.println(contatos);
		}
		
		
		System.out.println("");
	System.out.println("Buscando pessoas por nome!");
	for (int i = 0;i <= 10; i++ ){
		System.out.println(dao.buscarporNome(i));
		
	}
	
	
}
