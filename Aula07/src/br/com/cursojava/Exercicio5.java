package br.com.cursojava;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite uma frase");
		String frase = teclado.nextLine();
		
		for( int i =0; i < frase.length(); i++){
			if (i %2 != 0){
				System.out.println(frase.charAt(i));
			}
			
		}
		
		
		teclado.close();
	}

}
//Crie um programa que solicite uma frase e em seguida apresente a letra com os indices impares