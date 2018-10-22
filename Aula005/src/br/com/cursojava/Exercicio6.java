package br.com.cursojava;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[]args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe sua idade");
	//	String idade = teclado.nextLine();
		System.out.println("informe sua altura em metros ex: 1.80");
		float altura = Float.parseFloat(teclado.nextLine());
		System.out.println("Informe seu peso em KG");
		float peso = Float.parseFloat(teclado.nextLine());
		float IMC = peso / (altura * altura);
		System.out.println(IMC);
		
		if(IMC < 18.49){
			System.out.println("Abaixo do peso");
		}else 
			if(IMC< 25)
			System.out.println("peso nornal");
		
		else 
			if(IMC < 29)
			System.out.println("acima do peso");
		
		else
			if(IMC < 35)
			System.out.println("Obesidade 1");
		
		else
			if ( IMC <40)
			System.out.println("Obesidade 2");
			
			else
				if(IMC > 40)
					System.out.println("Obesidade mórbida");
	
	teclado.close();
	}
		
	}

 // Escreva um programa que solicite a idade, altura e o peso de uma pessoa e em seguida calcule o IMC utilizando a 
//fórmula IMC = peso/ altura / altura). O programa deve aoresentar uma mensagem informando se o IMC esta baixo,normal ou  obeso 
// de acordo com a tabela 
/* Abaixo de 17	Muito abaixo do peso

Entre 17 e 18,49			"Abaixo do peso"
Entre 18,5 e 24,99			"Peso normal"
Entre 25 e 29,99			"Acima do peso"
Entre 30 e 34,99			"Obesidade I"
Entre 35 e 39,99			"Obesidade II (severa)"
Acima de 40	Obesidade III   "(mórbida)"

*/