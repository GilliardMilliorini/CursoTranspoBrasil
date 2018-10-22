package br.com.cursojava008;

public class ExemploArray {

	public static void main(String[] args) {
		
	int [] numeros;								 // Array sempre definido por "[]" podendo ser utilizado depois do tipo (no caso desse int)
	String nomes[];								 //  ou depois da variavel
	numeros = new int [10]; 			// capacidade maxima do array � "10" neste caso - Capacidade m�xima � definido
	nomes = new String[3];				// em string � 3
	
	String[] frutas = {"abacaxi","banana","P�ssego"};  // preenchendo o array com o texto informado
	double [] medias = new double[3];
	int [] notas = new int[]{10,9,8,10,9,8};
	int []notas2 = {10,9,8,10,9,8};
	System.out.println(notas);	
	
	System.out.println(medias.length); // traz a capacidade maxima que a variavel suporta
	System.out.println(notas.length);
	//  int y = new int []{10,9,8,7}[1]; // pega o valor do array e retorna o valor na posi��o "1"
	//  notas = new int[]{100};   � valido utilizar , mas quando executado ele apaga o valor da variavel inserido anteriormente
	//	notas = new int[]{10,10,10,10};   -  utilizado como exemplo 
	
	for( int index = 0; index < notas.length; index++){  // utilizando o notas.lenght nunca ser� estourado o limite de valores.
		System.out.printf(notas[index] + " ");
	}
	System.out.println("");
	
	
	for(int atual : notas){                  // Utilizado para trazer toda a informa��o da variavel, e nao a posi��o selecionada.
		System.out.print(atual + " ");
	}
	System.out.println("");
	// comando � a mesma coisa que utilizar o seguinte:
	for(int i = 0; i < notas.length; i++){
		int atual = notas[i];
		System.out.print(atual + " ");
	}
	}
}



//Array sempre come�a a contagem na posi��o "0"