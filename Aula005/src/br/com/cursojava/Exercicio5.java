package br.com.cursojava;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[]args){
	Scanner teclado = new Scanner(System.in);
	System.out.println("Digite um número");
	int numero = Integer.parseInt(teclado.nextLine());
	if (numero %2 ==0){
		System.out.println("Seu número é par");
	} else
		System.out.println("Seu número é impar");
		
teclado.close();
	}

	
	
	}

// Escreva um programa qe solicite um numero e em seguida apresente uma mensahhem informando se foi "PAR" ou "Impar"".
//todo numero par deve ter o resto da divisao por 2 igual a zero.