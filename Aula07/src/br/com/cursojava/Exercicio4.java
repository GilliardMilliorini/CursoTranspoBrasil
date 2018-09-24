package br.com.cursojava;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

	int soma = 0;
	int nota = 0;
	
	for(int i = 1; i <= 5; i++){
		System.out.printf("Digite o %dº da nota: \n", i);
		nota = Integer.parseInt(teclado.nextLine());
		if(i == 1 || nota < soma){
			soma += nota;
		}
			double media = soma / 5.0;
			System.out.println("A soma das notas foi" +soma);
			System.out.println("A nmédia das notas foi" +media);
		
		
	}
// nao terminei
		
		
		/*
		int media = (n1+ n2 + n3 + n4 + n5) / 5;
		int total = n1 + n2 + n3 + n4 + n5; 
		 */	
		teclado.close();		
	}

}
//Crie um programa que solicite 5 numeros e em seguida apresente o valor da soma dos numeros e da média