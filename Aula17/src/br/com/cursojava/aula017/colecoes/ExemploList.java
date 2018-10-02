package br.com.cursojava.aula017.colecoes;

import java.util.ArrayList;

import java.util.Collections;
//import java.util.LinkedList;
import java.util.List;

import br.com.cursojava.aula017.Contato;

public class ExemploList {
	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();  // pode usar o  linkedList no lugar do   arraylist, dará no mesmo
		nomes.add("João");
		nomes.add("Maria");
		nomes.add("Adão");
		nomes.add("Eva");
		
		System.out.println(nomes);
		Collections.sort(nomes);		// ordena os valores na ordem alfabetica
		System.out.println(nomes);
		Collections.sort(nomes,Collections.reverseOrder());  // ordena os valores na ordem alfabetira inversa
		System.out.println(nomes);
	
		
		List<Contato> contatos = new ArrayList<>();
		contatos.add(new Contato("João","teste1"));
		contatos.add(new Contato("maria", "teste2"));
		contatos.add(new Contato("Adão", "teste4"));
		contatos.add(new Contato("Eva", "teste3"));
	
	System.out.println(contatos);
	Collections.sort(contatos);
	System.out.println(contatos);
	Collections.sort(contatos,Collections.reverseOrder());  // ordena os valores na ordem alfabetira inversa
	System.out.println(contatos);
	
	System.out.println("");
	System.out.println(contatos);
	Collections.sort(contatos);
	}

	
	
}
