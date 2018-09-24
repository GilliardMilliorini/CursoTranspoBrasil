package br.com.cursojava;

import java.util.Scanner;

public class ExemploSwith {
	private static final int INICIAL = 1; // variavel constante.
	
public static void main(String[] args) {
	
	Scanner teclado = new Scanner(System.in);
	System.out.println("Digite um número entre 1 e 7");
	int dia = Integer.parseInt(teclado.nextLine());
	
	//switch deve ser sempre do mesmo tipo que a variavel declarada.
	
	switch(dia){
	case INICIAL:  //  pode ser utilizado assim se for declarado a constante no início do projeto.
		System.out.println("Domingo");
		break;  // break serve para parar a execução quando localizar a opção selecionada
	case 2:
		System.out.println("Segunda-Feira");
		break;
	case 3:
		System.out.println("Terçã-Feira");
		break;
	case 4:
		System.out.println("Quarta-Feira");
		break;
	case 5:
		System.out.println("Quinta-Feira");
		break;
	case 6:
		System.out.println("Sexta-Feira");
		break;
	case 7:
		System.out.println("Sabado");
		break;
	default:
		System.out.println("Número inválido");
		break;
			
	
	}
	
			
	teclado.close();
	
	
}


}
