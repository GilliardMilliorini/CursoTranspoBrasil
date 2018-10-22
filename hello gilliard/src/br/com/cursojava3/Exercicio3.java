package br.com.cursojava3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("informe sua Idade");
		int idade = Integer.parseInt(teclado.next());
		// pode criar variavel idademais20 e atribuid o valor de idade + 20 e no sysout so selecionar a variavel idademais20
		System.out.printf(idade + 20 +" Anos, está sera sua idade daqui a 20 anos:");
		
		
		teclado.close();
		
	}
}


//Escreva um programa que solicite a idade de um usuário e em seguida apresente a idade do usuário apos 20 anos