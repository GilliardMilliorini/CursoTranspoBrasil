package br.com.cursojava.exercicio;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
//1) Crie um programa que solicite um numero entre 1 e 12, e em seguida escreva 
//		 o nome do m�s correspondente ao numero digitado. 
//		 Caso o usuario informe um numero fora do range (1-12) o 
// 		 programa deve apresentar uma mensagem indicando que o numero � Invalido;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe um numero de 1 a 12: ");
		int mes = Integer.parseInt(teclado.nextLine());
		teclado.close();

		switch (mes) {
		case 1:
			System.out.println("Janeiro");
			break;
		case 2:
			System.out.println("Fevereiro");
			break;
		case 3:
			System.out.println("Mar�o");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Maio");
			break;
		case 6:
			System.out.println("Junho");
			break;
		case 7:
			System.out.println("Julho");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Setembro");
			break;
		case 10:
			System.out.println("Outubro");
			break;
		case 11:
			System.out.println("Novembro");
			break;
		case 12:
			System.out.println("Dezembro");
			break;
		default:
			System.out.println("Numero Invalido.");
		}

	}

}
