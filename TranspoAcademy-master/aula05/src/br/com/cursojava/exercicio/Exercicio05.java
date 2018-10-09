package br.com.cursojava.exercicio;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
//5) Crie um  que solicite 5 números para o usuário e
//em seguida escreva o maior número digitado.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe um numero(1/5): ");
		double n1 = Double.parseDouble(scanner.nextLine());
		System.out.println("Informe um numero(2/5): ");
		double n2 = Double.parseDouble(scanner.nextLine());
		System.out.println("Informe um numero(3/5): ");
		double n3 = Double.parseDouble(scanner.nextLine());
		System.out.println("Informe um numero(4/5): ");
		double n4 = Double.parseDouble(scanner.nextLine());
		System.out.println("Informe um numero(5/5): ");
		double n5 = Double.parseDouble(scanner.nextLine());
		scanner.close();
		double maior = Math.max(Math.max(Math.max(Math.max(n1, n2), n3), n4), n5);
		
		System.out.println("O maior numero informado foi: " + maior);
		
	}
}
