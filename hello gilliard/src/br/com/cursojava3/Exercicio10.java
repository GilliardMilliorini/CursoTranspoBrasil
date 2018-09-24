package br.com.cursojava3;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args){

	Scanner teclado = new Scanner(System.in);
	System.out.println("peso");
	double peso = Double.parseDouble(teclado.nextLine());
	System.out.println("altura");
	double altura = Double.parseDouble(teclado.nextLine());
	double imc = peso / (altura * altura);
	System.out.printf("IMC = %.2d\n", imc);
	 
	//nao concui 
	
	
	teclado.close();
	}		
}
// Escreva um prohrama que solcitite o peso e a autura de uma pessoa e em segida calcule o IMC desta pessoa  IMC = peso / (autura *autura)