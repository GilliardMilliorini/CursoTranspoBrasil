package br.com.cursojava;

import java.util.Scanner;




public class Exercicio7 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero = -1;
		while(numero != 4) {
			System.out.println("");
		System.out.println("Digite 1 para Cadastrar Aluno");
		System.out.println(" 2 - Cadastrar Professor ");
		System.out.println("3 - Cadastrar Turma");
		System.out.println("4 - Sair " );
		numero = Integer.parseInt(teclado.nextLine());

		switch (numero){
		case 1:
			System.out.println("Selecionou a op��o de Cadastrar aluno");
		break;
		
		case 2:
			System.out.println("Selecionou a op��o de Cadastrar professor");
		break;
		
		case 3:
			System.out.println("Selecionou a op��o de Cadastrar Turma");
		break;
		
		case 4:
			System.out.println(" 4 -Sair");
		break;
		
		default:
				System.out.println("op��o Invalida");
		break;
		
			
		}
	
	}
		teclado.close();
}
}


/* Escreva um programa que apresente o menu abaixo para  usu�rio, e apos a escolha do usu�rio apresente uma mensagem correspondente 
 ao tipo de opera��o selecionada. O programa deve contnuar executando at� qoeu o usu�rio escolha a op��o "sair".Caso o usu�rio 
 escolha uma op��o diferente, o programa deve apresentar a mensagem "op��o invalida".
 
 1 - Cadastrar Aluno				 -> Escolheu a Op��o Cadastrar Aluno
 2 - Cadastrar Professor			 -> Escolheu a Op��o Cadastrar Professor
 3 - Cadastrar Turma				 -> Escolheu a Op��o Cadastrar Turma
 4 - Sair
*
*/