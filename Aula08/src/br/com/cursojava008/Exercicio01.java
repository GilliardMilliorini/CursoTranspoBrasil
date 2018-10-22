package br.com.cursojava008;

import java.util.Scanner;

public class Exercicio01 {

	public static void exercicio01(Scanner teclado){
		double[] notas = new double[3];
		double media = 0;
		for(int index = 0; index < notas.length; index++){
			System.out.printf("Informe a %dª nota:\n",index+1);
			notas[index] = Double.parseDouble(teclado.nextLine());
			media += notas[index];
		}
		media /=notas.length;
		System.out.println("As notas informadas foram:");
		for (double nota : notas) {
			System.out.print(nota +" ");
		}
		System.out.println("");
		System.out.println("O valor da média é "+media);
	}
}

// Crie um programa que solicite 10 notas e em seguida calcule a media das notas e escreva as notas digitadas juntamente com o valor da media.