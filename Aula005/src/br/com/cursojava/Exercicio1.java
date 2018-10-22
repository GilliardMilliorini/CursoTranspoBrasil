package br.com.cursojava;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[]args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite seu nome");
		String nome = teclado.nextLine();
		System.out.println(nome.length() + "letras são compostas do seu nome");
		
		
		
		teclado.close();
		
	}
}
 // Crie um programa que solicite o nome do usuário e em seguida informe a quantidade de letras do nome informado.