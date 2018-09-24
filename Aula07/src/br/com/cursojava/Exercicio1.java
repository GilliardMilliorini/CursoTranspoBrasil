package br.com.cursojava;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número entre 1 e 20");
		int numero = -1;
		long fator = 1;
		
		do{
			System.out.println("numero entre 1 e 20");
			numero = Integer.parseInt(teclado.nextLine());
		}while(numero <1 || numero >20);
		
		for( int i = 2; i <= numero; i++ ){  
			
		     fator *= i;
		}
		System.out.println( "O fatorial de " + numero + " é igual a " + fator );
			
		teclado.close();			
		}
		
		

		
		
		
		/*		int numero = Integer.parseInt(teclado.nextLine());
		long fator = 1;
		
		for( int i = 2; i <= numero; i++ ){  
			
		     fator *= i;
		}
		System.out.println( "O fatorial de " + numero + " é igual a " + fator );
*/
		//teclado.close();	
			
	}
		



 // Utilizado o comando FOR execute os exercicios seguintes.
//1 - Crie um programa que solicite um numero entre 1 e 20 e em seguida calcule e apresente o valor do fatorial do numero informado   Fatorial é numero * numero
//exemplo : 3 = 3 * 2 * 1           5= 5 * 4 * 3 * 2 * 1