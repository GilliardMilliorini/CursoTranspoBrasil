package br.com.cursojava;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número entre 1 e 12 para escolher o mês");
		int mes = Integer.parseInt(teclado.nextLine());
		switch(mes){
		
		case 1:
		System.out.println("JANEIRO");
		break;
		
		case 2:
		System.out.println("FEVEREIRO");
		break;

		case 3:
		System.out.println("MARÇO");
		break;
		
		case 4:
		System.out.println("ABRIL");
		break;
		
		case 5:
		System.out.println("MAIO");
		break;
		
		case 6:
		System.out.println("JUNHO");
		break;
		
		case 7:
		System.out.println("JULHO");
		break;
		
		case 8:
		System.out.println("AGOSTO");
		break;
		
		case 9:
		System.out.println("SETEMBRO");
		break;
		
		case 10:
		System.out.println("OUTUBRO");
		break;
		
		case 11:
		System.out.println("NOVEMBRO");
		break;
		
		case 12:
		System.out.println("DEZEMBRO");
		break;
		
		default:
		System.out.println("MES INVÁLIDO");
		break;
		}
		
		teclado.close();
	}
	
	
}




// Crie um programa que solicite um npumero entre 1 e 12, em seguida escreva o nome do mes correspondente ao numero digitado
//caso o usuário informe um numero fora do rage (1 - 12) o programa deve apresentar uma mensagem indicando que o numero informado
//e invalido.