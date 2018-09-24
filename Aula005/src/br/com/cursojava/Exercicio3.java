package br.com.cursojava;

import java.util.Scanner;

public class Exercicio3 {
public static void main(String[]args){
	
	
	Scanner teclado = new Scanner(System.in);
	System.out.println("Digite uma frase");
	String frase = teclado.nextLine();
	String frasenova = frase.replaceAll("[aeiouAEIOU]","");
	System.out.println(frasenova);
	teclado.close();
}

}

// Crie um programa que solicite uma frase e em seguida apresente a frase digiada sem vogais