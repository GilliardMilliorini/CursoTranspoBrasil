package br.com.cursojava008;
import java.util.Scanner;

	public static void exercicio04(Scanner teclado){
	String[] nomes = new String[3];
	for(int index = 0; index < nomes.length; index++){
		System.out.printf("Informe o %dº nome:\n",index+1);
		nomes[index] = teclado.nextLine();
	}
	System.out.println("A ordem inversa da lista é");
	for(int index = nomes.length -1; index >=0; index--){
		System.out.println(nomes[index]);

	
	}

}

// Crie um programa que solicite o nome de 10 pessoas e em seguida apresente os nomes informados na ordem inversa
//( o ultimo nome deve ser o primeiro digitado)