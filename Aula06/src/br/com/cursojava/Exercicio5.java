package br.com.cursojava;

public class Exercicio5 {
	public static void main(String[] args) {
		int numero = 1;
		
		while(numero <= 100){
		if(numero % 2 != 0){
			System.out.print((numero) + ", ");
		}
			numero++;
			//System.out.print(((numero++) -1) +  ", ");  //  famosa gambiarra
			
		}
		System.out.println("Fim da operação");
	}

	}




// Escreva um programa que escreva todos os numeros impares entre 1 e 100