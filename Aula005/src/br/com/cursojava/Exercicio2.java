package br.com.cursojava;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[]args){
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a primeira nota");
		double nota1 = Double.parseDouble(teclado.nextLine());
		System.out.println("digite a segunda nota");
		double nota2 = Double.parseDouble(teclado.nextLine());
		System.out.println("digite a terceira nota");
		double nota3 = Double.parseDouble(teclado.nextLine());
		double media = (nota1 + nota2 + nota3) / 3;
	
		if (media >= 7) {
			System.out.println("Parabéns, você foi aprovado");
			
		}else
			System.out.println("Infelizmente você foi reprovado");
		
		teclado.close();
	}
	}
		


// Crie um programa que solicite 3 noras e em seguida calcule a media das noras. 
//se a media for maior ou igual a 7 escreva aprovadi senao escreva reprovado