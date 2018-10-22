package br.com.cursojava;

public class OperadoresUnarios {
	
	public static void main(String[] args){
		// Operadores un�rios
		/*
		 *   ++
		 * --
		 * 
		 */
		
		//pr�-incremento -- inserido antes da vari�vel
		int numero = 10;
		System.out.println("===  PR� INCREMENTO =====");
		System.out.println(numero);
		System.out.println(++numero);
		System.out.println(numero);
		
		
		// p�s incremento  -- inserido ap�s a variavel
		int numero2 = 20;
		System.out.println("===== P�S INCREMENTO ===");
		System.out.println(numero2);
		System.out.println(numero2++);
		System.out.println(numero2);
		
		int res = numero++;
		System.out.println(res == numero);

	int numeros[] = {1,2,3,4,5};
	int i = 0;
	while (i < numeros.length){
		System.out.println(numeros[i++]);
	
		//pr�-decremento -- inserido antes da vari�vel
				
				System.out.println("===  PR� DECREMENTO =====");
				System.out.println(numero);
				System.out.println(--numero);
				System.out.println(numero);
				
				
				// p�s decremento  -- inserido ap�s a variavel
				
				System.out.println("===== P�S DECREMENTO ===");
				System.out.println(numero2);
				System.out.println(numero2--);
				System.out.println(numero2);
	
	}
	}

}
