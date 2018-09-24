package br.com.cursojava;

public class ExemploFor {
	public static void main(String[] args) {
		
		for(int index = 0; index <10; index++){ // Variavel iniciada dentro do FOR só executa dentro dele.
		System.out.printf("%d ", index);
		}
		
		System.out.println("");
		System.out.println("Fim da aplicação");
		
		int i = 10;
		for(;i>=1; i--){					// For pode ser utilizado de 3 modos diferentes, o primeiro com  incremento no fim do comando
			System.out.printf("%d ", i);
			}
        System.out.println("");

		for(;i<=10;){						// trazendo somente a comparaçao no meio
			System.out.printf("%d ", i);
			i++;
		}
		System.out.println("");

		for(;;){							// trazendo nenhum dado mas obrigatorio tem " ; " em cada um dos 3 campos
			System.out.printf("%d ", i);
			i--;
			if(i == 0){
				break;
			}
		
		
		}
	}
}
