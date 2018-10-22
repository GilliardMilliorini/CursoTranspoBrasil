package br.com.cursojava.aula014;

import java.util.ArrayList;

public class ExemploArrayList {
	
	public static void main(String[] args) {
		
		// definir uma lista de nomes		
		ArrayList<String> listaNomes = new ArrayList<>();
		
		
		//quantidade de elementos tem a lista?
		int quantidadeInicial = listaNomes.size();		// size traz a quantidade de dados que há na lista.
		System.out.println(quantidadeInicial);
		
		//adicionar elementos na lista
		listaNomes.add("João"); // add adiciona um elemento no final da lista
		
		System.out.println(listaNomes.size()); // sempre que quiser verificar o tamanho da lista executar o
												// comando ao final da operação de adicionar dados
		
		listaNomes.add("Maria"); // add adiciona um elemento no final da lista
		System.out.println(listaNomes);
		
		listaNomes.add(0, "Adao");  // adiciona um elemento a um indice específico - trazendo adao para a posicao 1 e eva para o 2
		System.out.println(listaNomes);
		listaNomes.add(1,"Eva");
		System.out.println(listaNomes);
		
		listaNomes.set(1, "Eva maria da Silva");  // Altera um elemento na posição informada.
		System.out.println(listaNomes);
		
		
		System.out.println(listaNomes.get(2)); // Busca um elemento na lista de acordo com o indice informado.(2)
		System.out.println(listaNomes.get(3));

	System.out.println(listaNomes.remove(1)); // Remoce um elemento da lista de acordo com o indice informado.
	System.out.println(listaNomes);
	System.out.println(listaNomes.remove("João"));  // remove um elemento com o mesmo nome informado. caso ele ja esteja deletado o sistema seta como false
	System.out.println(listaNomes);
	System.out.println(listaNomes.remove("João"));
	System.out.println(listaNomes);
	
	System.out.println(listaNomes.indexOf("Adao"));  // traz a posição do indice do valor da lista solicitada
	System.out.println(listaNomes.indexOf("Eva")); // caso o valor não exista na lista sistema traz valor -1 para a posição.
	
	
	}

}
