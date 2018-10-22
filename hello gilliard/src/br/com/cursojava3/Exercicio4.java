package br.com.cursojava3;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("informe sua Idade");
		int idade = Integer.parseInt(teclado.next());
		// pode criar variavel idadeEmMeses e atribuir o valor de idade / 12 meses.No sysout so selecionar a variavel idadeEmMeses
		System.out.printf(idade *12 +" meses de idade:");
		
		
		teclado.close();
		
	}
}


//Escreva um programa que solicite a idade do usuario em anos e apresente o valor da idade informada em meses; ( Exemplo 1 ano = 12 meses)