package br.com.cursojava008;

public class Exercicio02 {
	public static void main(String[] args) {
		

	int[] notas ={1,2,3};

	/*	
	for(int i = 0; i < numeros.length; i++){
		int atual = numeros[i];
		System.out.print(atual + " ");
		}		
	*/
		for(int nota: notas){
			System.out.println(nota+ " ");
			
			int temp = 0;
			for (int i = 0; i < notas.length -1; i++){
				temp = notas[i];
				notas[i] = notas[i+1];
				notas [i+1] = temp;
				
			}
			System.out.println("");
			for(int notas : notas){
				System.out.print(nota + " ");
			} 												// DANDO ERRO
		}
		
		
	}

}
// Crie um programa que crie um array com valores 1,3,2 e em seguida processe o array para que os valores se posicionem na forma 3,2,1.