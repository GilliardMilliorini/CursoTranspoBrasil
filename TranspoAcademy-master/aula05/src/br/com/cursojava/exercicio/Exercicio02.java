package br.com.cursojava.exercicio;

import java.util.Scanner;

public class Exercicio02 {
//	2) Escreva um programa que solicite 3 n�meros para o usu�rio e 
//	em seguida escreva o resultado da soma do primeiro n�mero com o terceiro n�mero 
//e em seguida multiplique o resultado pelo segundo n�mero informado.
//Mostre na tela o resultado da aplica��o.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informa o primeiro numero: ");
		double n1 = Double.parseDouble(scanner.nextLine());
		System.out.println("Informa o segundo numero: ");
		double n2 = Double.parseDouble(scanner.nextLine());
		System.out.println("Informa o terceiro numero: ");
		double n3 = Double.parseDouble(scanner.nextLine());
		double soma1e3 = n1 + n3;
		System.out.printf("( %.2f + %.2f ) = %.2f x %.2f = %.2f ", n1, n3, soma1e3, n2, soma1e3 * n2);
		scanner.close();
	}
	
}
