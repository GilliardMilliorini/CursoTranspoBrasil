package br.com.cursojava3;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[]args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor do produto");
		double valor = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite o desconto em percentual que será atribuido ao produto");
		double desc = Double.parseDouble(teclado.nextLine());
		double desconto = desc / 100;
		System.out.println(valor * desconto + " Valor de desconto");
		System.out.println(valor-(valor * desconto) + " Valor do produto com desconto");
		
		
	teclado.close();
	}
		
}


//Escreva um programa que solicite o valor de um produto e o percentual de desconto, em seguida o programa deve apresentar o 
//valor do desconto e o valor do produto após a aplicação do desconto