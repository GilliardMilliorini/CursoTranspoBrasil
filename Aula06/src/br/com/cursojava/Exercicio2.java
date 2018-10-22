package br.com.cursojava;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número entre 1 e 3");
		int numero = Integer.parseInt(teclado.nextLine());
		
		switch(numero){
		case 1:
			
		System.out.println("Opção 1 - Sacar");
		break;
		
		case 2:
			System.out.println("Opção 2 - Depositar");
			break;
			
		case 3:
			System.out.println("Opção 3 - Verificar Saldo");
			break;
		default:
			System.out.println("Opção Invalida");
			break;
		}
		teclado.close();
				
	}

}

// Escreva um programa que solicite um número entre 1 e 3 para o usuário. Em seguida escreva uma mensagem informando o valor da opção 
//selecionada. AS mensahens devem ser de acordo com a tabela abaixo.
/*
1 - Sacar
2 - Depositar
3 - Verificar saldo
![1-3] Opção invalida
*/