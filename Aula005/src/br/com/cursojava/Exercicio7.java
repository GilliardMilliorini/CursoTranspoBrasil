package br.com.cursojava;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[]args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe seu salário");
		double salario = Double.parseDouble(teclado.nextLine());
		
		if(salario < 1800){
			System.out.println("Isento de imporsto");
		
		} else if (salario < 2400){
			System.out.println(salario *7.5/ 100 + " " +"7,5%");
		
		} else if (salario < 3600){
			System.out.println(salario *15/ 100 + " " +"15%");
		
		} else if (salario > 3600){
			System.out.println(salario *27/ 100 + " " +"27%");
			
		
				}	
		
		
		teclado.close();
	}

}

// Escreva um programa que solicite o valor do salário de uma pessoa e calcule o valor do imporsto de renda conforme os dados abaixo
/* ate 1800,00 				Isento
de 1800.01 ate 2400.00 		7.5%
de 2400.01 ate 3600.00		15%
acima de 3600.00			27%
*/