package br.com.cursojava.avaliacao;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

// 4) Escreva um programa que solicite a idade do usuario e em seguida apresente
// uma mensagem informando se o usuario pode fazer a CNH.

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		int idade = Integer.parseInt(teclado.nextLine());
		if (idade >= 18) {
			System.out.println("Voc� j� pode fazer a CNH");
		} else {
			System.out.println("Voc� ainda n�o tem 18 anos e n�o pode fazer CNH.");
		}

		System.out.println("Fim da Aplica��o.");
		teclado.close();

	}

}
