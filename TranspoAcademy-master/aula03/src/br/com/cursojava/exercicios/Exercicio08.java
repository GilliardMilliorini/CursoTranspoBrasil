package br.com.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
//		8) Escreva um programa que solicite a base e a altura de um triangulo e em seguida calcule a area.

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor da base do triangulo: ");
		double base = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite o valor da altura do triangulo: ");
		double altura = Double.parseDouble(teclado.nextLine());

		teclado.close();

		double areaTriangulo = (base * altura) / 2;
		System.out.println("A �rea do trinagulo � : " + areaTriangulo);
		System.out.printf("A �rea do trinagulo � %.2f: ", areaTriangulo);

	}

}
