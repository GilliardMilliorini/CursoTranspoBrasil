package br.com.cursojava3;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a altura");
		double altura = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite a base");
		double base = Double.parseDouble(teclado.nextLine());
		double area = base * altura / 2;
		System.out.printf("A áre do triangulo é %.2f\n", area);
		
		teclado.close();
		
	}

}


// Escreva um programa que solicite a base e altura de um trianglo e em seguida calcule o valor da area