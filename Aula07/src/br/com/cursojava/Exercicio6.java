package br.com.cursojava;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite uma palavra");
		String palavra = teclado.nextLine();
		
		for(int i = palavra.length()-1; i >= 0; i--){
			System.out.print(palavra.charAt(i));
			
		}
		
		
		
		// não terminei
		teclado.close();
	}

}
// Crie um programa que solicite uma palavra e em seguida escreva a palavra de forma inversa Ex: (Felipe => epileF)