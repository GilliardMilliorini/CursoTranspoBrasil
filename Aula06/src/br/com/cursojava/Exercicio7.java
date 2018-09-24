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
			System.out.println("Selecionou a opção de Cadastrar aluno");
		break;
		
		case 2:
			System.out.println("Selecionou a opção de Cadastrar professor");
		break;
		
		case 3:
			System.out.println("Selecionou a opção de Cadastrar Turma");
		break;
		
		case 4:
			System.out.println(" 4 -Sair");
		break;
		
		default:
				System.out.println("opção Invalida");
		break;
		
			
		}
	
	}
		teclado.close();
}
}


/* Escreva um programa que apresente o menu abaixo para  usuário, e apos a escolha do usuário apresente uma mensagem correspondente 
 ao tipo de operação selecionada. O programa deve contnuar executando até qoeu o usuário escolha a opção "sair".Caso o usuário 
 escolha uma opção diferente, o programa deve apresentar a mensagem "opção invalida".
 
 1 - Cadastrar Aluno				 -> Escolheu a Opção Cadastrar Aluno
 2 - Cadastrar Professor			 -> Escolheu a Opção Cadastrar Professor
 3 - Cadastrar Turma				 -> Escolheu a Opção Cadastrar Turma
 4 - Sair
*
*/