package br.com.cursojava3;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o primeiro n�mero");
		double numero1 = Double.parseDouble(teclado.nextLine());
		System.out.println("Informe o segundo n�mero");
		double numero2 = Double.parseDouble(teclado.nextLine());
		System.out.println("informe o terceiro n�mero");
		double numero3 = Double.parseDouble(teclado.nextLine());
		System.out.println("a m�dia todal �");
		System.out.printf("(%.2f + %.2f + %.2f) /3 = %f\n",numero1,numero2,numero3, (numero1 + numero2 + numero3) /3);
				
		
	teclado.close();
		
	}

}

//Escreva um programa que solicite 3 numeros reais e em seguida apresente o resultado da media dos numeros informados