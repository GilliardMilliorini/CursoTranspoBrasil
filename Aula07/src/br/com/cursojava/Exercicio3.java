package br.com.cursojava;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	int maior = 0;
	int numero = 0;
	
	for(int i = 1; i <= 5; i++){
		System.out.printf("Digite o %dº numero: \n", i);
		numero = Integer.parseInt(teclado.nextLine());
		if(i ==1 || maior < numero){
			maior = numero;
		}
		
	}
		System.out.println("o maior numero foi " +maior);
		
		
		
		
		/*	int resultado = Integer.MIN_VALUE;
		int contador = 0;
		do {
			System.out.println("Digite um valor : "); 								pode ser assim também
			int num = teclado.nextInt();
			if (num > resultado) 
				resultado = num;
			contador++;
			
		} while (contador <= 4);
		System.out.println("Maior numero digitado foi : " + resultado);
		*/
		teclado.close();
	
		}
	
	}



// Crie um programa que solicite 5 numeros e em seguida escreva o valor do maior numero informado.