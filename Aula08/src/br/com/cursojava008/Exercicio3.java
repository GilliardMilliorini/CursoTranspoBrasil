package br.com.cursojava008;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
		double[] notas = new double[3];
		int posMaior = 0;
		for(int index = 0; index < notas.length; index++){
			System.out.printf("Informe a %d nota:\n", index+1);
			notas[index] = Double.parseDouble(teclado.nextLine());
				
			if(notas[index] > notas[posMaior]){
					posMaior = index;
				
			}
		}
		System.out.println("nota maior" +notas[posMaior]);
		System.out.println("posição é " + +posMaior);
		teclado.close();
	}

}
// Crie um programa que solicite 5 notas e em seguida apresente o valor da maior nota juntamente com a posição da nota dentro do array