package br.com.cursojava009;

public class Exercicio01 {

	public static void main(String[] args) {
		
		int[][] matriz = new int [3][3];
		matriz[0][0] = 10;
		matriz [0][1] = 9;
		matriz [0][2] = 8;
		matriz [1][0] = 7;
		matriz [1][1] = 9;
		matriz [1][2] = 10;
		matriz [2][0] = 10;
		matriz [2][1] = 7;
		matriz [2][2] = 8;
		
		int soma = 0;							// a principal usa 1 FOR somente pois a linha e coluna devem ser sempre iguais.
		for(int i = 0; i < matriz.length; i++){
			soma += matriz[i][i];
		}
		System.out.printf("O resultado da soma da diagonal principal é "+ soma);
	}
}


// Dada a matriz abaixo calcule a soma dos valors de sua diagonal principal.
/* [10,09,08], 
/* [07,09,10], 
/* [10,07,08], 

diagonal principal pega os valores da esquerda para direita, linha 1 coluna 1, linha 2 coluna 2 e etc...
*/