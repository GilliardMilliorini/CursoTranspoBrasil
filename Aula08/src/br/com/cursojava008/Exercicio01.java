package br.com.cursojava008;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		
	Scanner teclado = new Scanner(System.in);
		double[] notas = new double [10];
		double media = 0;
		
		for( int index = 0; index < notas.length ; index ++){
			System.out.println("Digite a nota");
			notas[index] = Double.parseDouble(teclado.nextLine());
			media+= notas[index];
		}
		media/= notas.le												 //n acabei essa caralha
			
			double nota = Double.parseDouble(teclado.nextLine());
			System.out.println(nota + " ");
		//	notas = nota;
			
		}
	
	
	teclado.close();
	}
}

// Crie um programa que solicite 10 notas e em seguida calcule a media das notas e escreva as notas digitadas juntamente com o valor da media.