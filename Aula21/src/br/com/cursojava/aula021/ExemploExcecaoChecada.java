package br.com.cursojava.aula021;

public class ExemploExcecaoChecada {

	public static void main(String[] args) throws Exception { // 
		usarImprimirRange();
	}
	
	private static void usarImprimirRange() throws Exception{
		
		int inicio = 1;
		int fim = 10;
		try {
			imprimirRange(inicio, fim);
		} catch (RangeInvalidoException e) {		//utilizando a classe RangeInvalidoException criada para estender da classe Exceptiom
		System.out.println(e.getMessage());
			//e.printStackTrace();
		System.out.println("Fiz algns tratamentos");
		//throw e;  // pouco utilizada
		}finally{
			System.out.println("Finally Executado");
		}
		
		
	}
	
	private static void imprimirRange(int inicio, int fim) throws Exception{		//declarando que o sistema tera exceção do tipo checado
		if(fim <= inicio){
			throw new RangeInvalidoException("Fim deve ser maior que início");//sempre que for declarar que sistema trara a exceção utilizar comando Throw
		}else{												////utilizando a classe RangeInvalidoException criada para estender da classe Exceptiom
			for(int i = inicio; i  <=fim; i++){
				System.out.printf("%d", i);
			}
			System.out.println("");
		}
	}
}
