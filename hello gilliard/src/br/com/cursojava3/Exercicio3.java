package br.com.cursojava3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("informe sua Idade");
		int idade = Integer.parseInt(teclado.next());
		System.out.printf(idade + 20 +" Anos, est� sera sua idade daqui a 20 anos:");
		
		
		teclado.close();
		
	}
}


//Escreva um programa que solicite a idade de um usu�rio e em seguida apresente a idade do usu�rio apos 20 anos