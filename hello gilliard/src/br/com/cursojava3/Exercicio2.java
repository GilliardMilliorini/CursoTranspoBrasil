package br.com.cursojava3;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o primeiro número");
		double numero1 = Double.parseDouble(teclado.nextLine());
		System.out.println("Informe o segundo número");
		double numero2 = Double.parseDouble(teclado.nextLine());
		System.out.println("informe o terceiro número");
		double numero3 = Double.parseDouble(teclado.nextLine());
		System.out.println("a média todal é");
		// Pode ser criado outra variavel double com o comando media = (numero 1 2 e 3 ) /3 e no sysout inserir somente a variavel média.
		System.out.printf("(%.2f + %.2f + %.2f) /3 = %.2f\n",numero1,numero2,numero3, (numero1 + numero2 + numero3) /3);
				
		
	teclado.close();
		
	}

}

//Escreva um programa que solicite 3 numeros reais e em seguida apresente o resultado da media dos numeros informados