package br.com.helo;

import java.util.Scanner;

public class COmparadoreLogicos {

	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite sua idade");
		int idade = Integer.parseInt(teclado.nextLine());
		
		if (idade >= 18 ){
			System.out.println("Voc� � obrigado a votar!!");
		
		} else if(idade >=16){
			System.out.println("voc� ja pode votar se quiser");
		
		}	else{
			System.out.println("Voc� n�o pode votar");
		}
		
		System.out.println("Fim da aplica��o");
		teclado.close();
	}
}



// Operadores comparador >, <, <=, >=, !=, e ==



// operadores l�gicos &&(e) , ||(ou) , !(n�o) , ^(ou exclusivo)

// && usado quando obrigatoriamente os 2 valores sao True
// || utilizado quando pelo menos 1 dos valores for True
// ^ utilizado quando exclusivamente 1 lado e verdadeiro  = traz true
// ! utilizado para inverter true por false e false por true 

//if sempre retorna o valor true. se for false ele pula o processo.