package br.com.cursojava;

public class Exercicio6 {
	public static void main(String[] args) {
		
		int numero = 1;
		boolean primo = true;
			
		while(numero <= 50){
			int divisor = 2;
			primo = true;
			
			while(divisor < numero){
				if(numero % divisor == 0){
					primo = false;
					break;
				}
				divisor++;
			
			}
		if(primo){
			System.out.print(numero + ", ");
		
		}
		numero++;
		
		}
		System.out.println("");
		System.out.println("Fim do Exercicio");
	}

}
 


// Escrevam um programa que  escreva dodos os numeros primos entre 1 e 50. Considere como número primo o número que é apenas 
//divisivel por 1 e por ele mesmo