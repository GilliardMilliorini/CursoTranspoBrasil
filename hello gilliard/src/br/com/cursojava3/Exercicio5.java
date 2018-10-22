package br.com.cursojava3;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("informe quantos dias de vida você tem");
		int idadeDias = Integer.parseInt(teclado.next());
		//não consegui fazer
		int anos = idadeDias / 360; // primeiro pegar valor total e dividir por 360( dias do ano)
		int resto = idadeDias %360; // pegar o resto do valor e calcular com % para que atribua o valor 
		int meses = resto / 30;// mesmo processo do ano
		int dias = resto % 30;
		System.out.printf("Sua idade é %d anos %d meses e %d dias", anos, meses, dias);

		teclado.close();
	}

}


// Escreva um programa que solicite a idade do usuáriio em dias e que e seguida apresente o valor em dias meses e anos. 
//Considere cada mes possui 30 dias e que um ano equivale a 12 meses