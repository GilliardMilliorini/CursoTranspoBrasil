package br.com.cursojava;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a primeira nota");
		double nota1 = Double.parseDouble(teclado.nextLine());
		
		while (nota1 >= 0){
			
			System.out.println("Digite a segunda nota");
			double nota2 = Double.parseDouble(teclado.nextLine());
			
			System.out.println("Digite a Terceira nota");
			
			double nota3 = Double.parseDouble(teclado.nextLine());
			
			double media = (nota1 + nota2 + nota3) / 3;
			System.out.println(media);
			System.out.println("Digite a primeira nota");
			nota1 = Double.parseDouble(teclado.nextLine());
			
		}
		System.out.println("nao e valido");
		

	
		
		// não consegui fazer ele voltar a pedir a primeira nota,
		
		
		
		teclado.close();	
		}
		
	

	}




// Escreva um programa que solicite 3 notas e em seguida calcule e apresente o valor da media das notas.
// o programa deve ser executado até que a primeira nota tenha um valor negativo
