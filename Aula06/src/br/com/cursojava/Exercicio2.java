package br.com.cursojava;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um n�mero entre 1 e 3");
		int numero = Integer.parseInt(teclado.nextLine());
		
		switch(numero){
		case 1:
			
		System.out.println("Op��o 1 - Sacar");
		break;
		
		case 2:
			System.out.println("Op��o 2 - Depositar");
			break;
			
		case 3:
			System.out.println("Op��o 3 - Verificar Saldo");
			break;
		default:
			System.out.println("Op��o Invalida");
			break;
		}
		teclado.close();
				
	}

}

// Escreva um programa que solicite um n�mero entre 1 e 3 para o usu�rio. Em seguida escreva uma mensagem informando o valor da op��o 
//selecionada. AS mensahens devem ser de acordo com a tabela abaixo.
/*
1 - Sacar
2 - Depositar
3 - Verificar saldo
![1-3] Op��o invalida
*/