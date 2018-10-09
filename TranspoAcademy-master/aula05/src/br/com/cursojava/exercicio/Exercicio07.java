package br.com.cursojava.exercicio;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
// 7) Crie um  que solicite o comprimento das arestas de um tri�ngulo 
//		e em seguida escreva uma mensagem informando qual � o tipo d triangulo informado. 
//		(Equil�tero,is�celes ou escaleno).
//		Tri�ngulo equil�tero: possui os tr�s lados com medidas iguais. 
//		Tri�ngulo is�sceles: possui dois lados com medidas iguais. 
//		Tri�ngulo escaleno: possui os tr�s lados com medidas diferentes. 
//		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe a primeira aresta do triangulo(1/3): ");
		int aresta1 = Integer.parseInt(scanner.nextLine());
		System.out.println("Informe a segunda aresta do triangulo(2/3): ");
		int aresta2 = Integer.parseInt(scanner.nextLine());
		System.out.println("Informe a terceira aresta do triangulo(1/3): ");
		int aresta3 = Integer.parseInt(scanner.nextLine());

		if (aresta1 == aresta2) {

			if (aresta1 == aresta3) {
				System.out.println("Tres lados iguais, Equilatero");
			} else {
				System.out.println("Dois lados iguais, Isosceles");
			}
		} else {
			if (aresta2 == aresta3) {
				System.out.println("Dois lados iguais, Isosceles");
			} else {
				System.out.println("Tres lados diferentes, Escaleno");
			}
		}

		scanner.close();

	}
}
