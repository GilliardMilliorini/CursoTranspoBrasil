package br.com.cursojava.exercicio;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		
//		2) Escreva um programa que solicite um numero entre 1 e 3 para o usuario. E
//	Em seguida escreva uma mensagem informando o valor da op��o selecionado.
//	As mensagens devem ser de cordo com a tabela abaixo:
//	1 - Sacar
//	2 - Depositar
//	3 - Verificar Saldo
//	![1-3] = Op��o Invalida

		Scanner teclado = new Scanner(System.in);
		System.out.println("Escolha uma op��o entre 1 a 3: ");
		int opcao = Integer.parseInt(teclado.nextLine());
		teclado.close();

		switch (opcao) {
		default:
			System.out.println("Op��o Escolhida Invalida!");
			break;
		case 1:
			System.out.println("Op��o escolhida: Sacar");
			break;
		case 2:
			System.out.println("Op��o escolhida: Depositar");
			break;
		case 3:
			System.out.println("Op��o escolhida: Verificar Saldo");
			break;
		}
	}
}
