package br.com.cursojava3;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a primeira nota");
		double numero1 = Double.parseDouble(teclado.nextLine());
		System.out.println("Informe a segunda nota");
		double numero2 = Double.parseDouble(teclado.nextLine());
		System.out.println("Informe a terceira nota");
		double numero3 = Double.parseDouble(teclado.nextLine());
		//poderia criar uma variavel "media" e atribuir o valor da (nota 1 2 e 3) / 3.0
		System.out.println("Sua m�dia �: ");
		System.out.printf("(%.2f + %.2f + %.2f)/3 = %f\n", numero1, numero2, numero3, (numero1 + numero2 + numero3)/3);
		System.out.println("Sua maior nota �:");
		System.out.println(Math.max(Math.max(numero1, numero2), numero3));
		System.out.println("Sua menor nota �:");
		System.out.println(Math.min(Math.min(numero1, numero2), numero3));
		teclado.close();
	}
}
	


//Escreva um programa que solicite 3 notas e em seguida calcule e apresente o valor dos seguintes dados:
// a) valor da m�dia
//b) o valor da maior nota( Math.max)
//c) o valor da menor nota ( Math.min).