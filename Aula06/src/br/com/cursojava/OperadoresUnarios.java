package br.com.cursojava;

public class OperadoresUnarios {
	
	public static void main(String[] args){
		// Operadores unários
		/*
		 *   ++
		 * --
		 * 
		 */
		
		//pré-incremento -- inserido antes da variável
		int numero = 10;
		System.out.println("===  PRÉ INCREMENTO =====");
		System.out.println(numero);
		System.out.println(++numero);
		System.out.println(numero);
		
		
		// pós incremento  -- inserido após a variavel
		int numero2 = 20;
		System.out.println("===== PÓS INCREMENTO ===");
		System.out.println(numero2);
		System.out.println(numero2++);
		System.out.println(numero2);
		
		int res = numero++;
		System.out.println(res == numero);

	int numeros[] = {1,2,3,4,5};
	int i = 0;
	while (i < numeros.length){
		System.out.println(numeros[i++]);
	
		//pré-decremento -- inserido antes da variável
				
				System.out.println("===  PRÉ DECREMENTO =====");
				System.out.println(numero);
				System.out.println(--numero);
				System.out.println(numero);
				
				
				// pós decremento  -- inserido após a variavel
				
				System.out.println("===== PÓS DECREMENTO ===");
				System.out.println(numero2);
				System.out.println(numero2--);
				System.out.println(numero2);
	
	}
	}

}
