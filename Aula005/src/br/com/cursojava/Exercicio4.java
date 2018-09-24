package br.com.cursojava;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[]args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite sua idade");
		int idade = Integer.parseInt(teclado.nextLine());
		
		if (idade >= 18){
			System.out.println("parabéns, você ja pode ter sua CNH");
	
		} else 
		System.out.println("que pena, você ainda nao tem idade para ter CNH");
		System.out.println(18 - idade + " anos para você poder fazer sua CNH");
		teclado.close();
			
	}

}


// Escreva um programa que solciite a idade do usuário e em sguida a presente a mensahem informando se o usuário pode fazer a CNH. 
// Caso ele nao tenha idade suficiente deve ser aoresentado uma mensagem informando quantos anos faltam para que ele possa solicitar a CNH