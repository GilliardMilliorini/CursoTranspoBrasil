package br.com.cursojava3;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número");
		double numero1 = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite outro número");
		double numero2 = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite outro número");
		double numero3 = Double.parseDouble(teclado.nextLine());
		System.out.println("Sua média é: ");
		System.out.printf("(%.2f + %.2f + %.2f)/3 = %f\n", numero1, numero2, numero3, (numero1 + numero2 + numero3)/3);
		System.out.println("Sua maior nota é:");
		System.out.println(Math.max(Math.max(numero1, numero2), numero3));
		System.out.println("Sua menor nota é:");
		System.out.println(Math.min(Math.min(numero1, numero2), numero3));
		teclado.close();
	}
}
	


//Escreva um programa que solicite 3 notas e em seguida calcule e apresente o valor dos seguintes dados:
// a) valor da média
//b) o valor da maior nota( Math.max)
//c) o valor da menor nota ( Math.min).