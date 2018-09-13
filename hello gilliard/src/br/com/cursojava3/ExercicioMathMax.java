package br.com.cursojava3;

import java.util.Scanner;

public class ExercicioMathMax {

	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o primero número");
		int numero1 = Integer.parseInt(teclado.nextLine());
		System.out.println("didite o segundo número");
		int numero2 = Integer.parseInt(teclado.nextLine());
		System.out.printf("o maior valor é: "+ Math.max(numero1, numero2));
		
		
		teclado.close();
		
		
	}
}

// Escreva um programa que solicite 2 numeros inteiros e em seguida escreva o valor do maior informado. Utilizar Math.max 