package br.com.cursojava;

import java.util.Scanner;

public class ExemploIf {

	private static Scanner scanner;

	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		System.out.println("Digite dia idade: ");
		int idade = Integer.parseInt(scanner.nextLine());
		
		if( idade >= 18) {
			System.out.println("Voce � obrigado a votar");
		} else if (idade >=16 ){
			System.out.println("Voce ainda n�o � obrigado a votar!");
		}else {
			System.out.println("Voc� ainda n�o pode votar!");
		}
		System.out.println("Fim da aplica��o");
		

	}

}
