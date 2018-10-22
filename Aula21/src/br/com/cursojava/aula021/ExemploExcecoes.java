package br.com.cursojava.aula021;

import java.util.Scanner;

public class ExemploExcecoes {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
	//	System.out.println("Digite um numero");
	//	int numero = Integer.parseInt(teclado.nextLine());
	//	System.out.println("O numero digitado foi: "+numero);
		
		try{											// bloco de exceção
			String []nomes = {"joão", "maria"};
			System.out.println(Integer.parseInt("dois"));
			System.out.println(nomes[2]);
		}catch (ArrayIndexOutOfBoundsException | NumberFormatException ex){
			ex.printStackTrace(); 												// traz o erro completo informando linha e erros;
			System.out.println(ex.getMessage());								// imprime a mensagem do erro que está ocorrendo
			System.out.println(ex);												// imprime a informação mais completa do erro.
			System.out.println("Você tentou acesssar uma posição invalida ou Numero informado nao é valodo ");
		}
		System.out.println("Codigo continuuou normalmente");
		
		teclado.close();
	}

}


// trowable é a mae de todas as exceções.
//exceção do tipo Error não deve ser tratada
// Exception - Deve ser executado tratammento
//RunTimeException - exceção de casos que não necessitam de tratamento para checar.  -  só acontece em tempo de execução