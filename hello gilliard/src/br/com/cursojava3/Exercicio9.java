package br.com.cursojava3;

import java.util.Scanner;

public class Exercicio9 {
 public static void main (String[]args){
	Scanner teclado = new Scanner(System.in);
	System.out.println("Informe a primeira nota");
	double n1 = Double.parseDouble(teclado.nextLine());
	System.out.println("Informe a segunda nota");
	double n2 = Double.parseDouble(teclado.nextLine());
	System.out.println("Informe a terceira nota");
	double n3 = Double.parseDouble(teclado.nextLine());
	
	
	//teclado.close();
 }
}
// não fiz pq professor apagou


//Escreva um programa que solicite 3 notas e em seguida calcule a media ponnderada aplicando os pesos 2, 3 e 5 
//respectivamente. ao final o prohrama debe apresentar o resultado da media calculada