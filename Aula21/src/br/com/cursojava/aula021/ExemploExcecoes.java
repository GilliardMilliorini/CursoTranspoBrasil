package br.com.cursojava.aula021;

import java.util.Scanner;

public class ExemploExcecoes {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
	//	System.out.println("Digite um numero");
	//	int numero = Integer.parseInt(teclado.nextLine());
	//	System.out.println("O numero digitado foi: "+numero);
		
		try{											// bloco de exce��o
			String []nomes = {"jo�o", "maria"};
			System.out.println(Integer.parseInt("dois"));
			System.out.println(nomes[2]);
		}catch (ArrayIndexOutOfBoundsException | NumberFormatException ex){
			ex.printStackTrace(); 												// traz o erro completo informando linha e erros;
			System.out.println(ex.getMessage());								// imprime a mensagem do erro que est� ocorrendo
			System.out.println(ex);												// imprime a informa��o mais completa do erro.
			System.out.println("Voc� tentou acesssar uma posi��o invalida ou Numero informado nao � valodo ");
		}
		System.out.println("Codigo continuuou normalmente");
		
		teclado.close();
	}

}


// trowable � a mae de todas as exce��es.
//exce��o do tipo Error n�o deve ser tratada
// Exception - Deve ser executado tratammento
//RunTimeException - exce��o de casos que n�o necessitam de tratamento para checar.  -  s� acontece em tempo de execu��o