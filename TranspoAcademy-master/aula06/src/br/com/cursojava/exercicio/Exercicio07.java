package br.com.cursojava.exercicio;

import java.util.Scanner;

public class Exercicio07 {

	// 07) Escreva um programa que apresente o menu abaixo para o usuario,
//	e apos a escolha do usuario apresente uma mensagem correspondente ao tipo
//	 de opera��o selecionado. O programa deve continuar executando at� que o usuario 
//	escolha a op��o sair. Caso o usuario escolha uma op��o diferente, o programa deve apresentar
//	a mensagem "Op��o Invalida".
//	1 - Cadastrar Aluno 	-> Escolheu a op��o Cadastrar Aluno
//	2 - cadastrar Professor -> Escolheu a op��o Cadastrar Professor
//	3 - Cadastrar Turma	-> Escolheu a op��o Cadastrar Turma
//	4 - Sair

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int escolha = 0;
		while (escolha != 4) {

			System.out.println("Escolha uma Op��o: ");
			System.out.println("1 - Cadastrar Aluno:");
			System.out.println("2 - Cadastrar Professor:");
			System.out.println("3 - Cadastrar Turma:");
			System.out.println("4 - Sair");
			escolha = Integer.parseInt(scanner.nextLine());

			switch (escolha) {
			case 1:
				System.out.println("Escolheu a op��o Cadastrar Aluno");
				break;
			case 2:
				System.out.println("Escolheu a op��o Cadastrar Professor");
				break;
			case 3:
				System.out.println("Escolheu a op��o Cadastrar Turma");
				break;
			case 4:
				System.out.println("Fim da aplica��o");
				// aplicacao = false;
				break;
			default:
				System.out.println("Op��o invalida!");
			}
		} 
		scanner.close();

	}


//	Scanner scanner = new Scanner(System.in);
//	int escolha = 0;
//	do {
//
//		System.out.println("Escolha uma Op��o: ");
//		System.out.println("1 - Cadastrar Aluno:");
//		System.out.println("2 - Cadastrar Professor:");
//		System.out.println("3 - Cadastrar Turma:");
//		System.out.println("4 - Sair");
//		escolha = Integer.parseInt(scanner.nextLine());
//
//		switch (escolha) {
//		case 1:
//			System.out.println("Escolheu a op��o Cadastrar Aluno");
//			break;
//		case 2:
//			System.out.println("Escolheu a op��o Cadastrar Professor");
//			break;
//		case 3:
//			System.out.println("Escolheu a op��o Cadastrar Turma");
//			break;
//		case 4:
//			System.out.println("Fim da aplica��o");
//			// aplicacao = false;
//			break;
//		default:
//			System.out.println("Op��o invalida!");
//		}
//	} while (escolha != 4);
//	scanner.close();

}
