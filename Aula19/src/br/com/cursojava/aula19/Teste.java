package br.com.cursojava.aula19;

public class Teste {

	
	public static int atributoStatic;				// variavel statico
	public int atributo;							//variavel de instancia
	
	
	public void oi(){
		System.out.println("ola!!!!");
		System.out.println("o Valor do atributo �  :"+atributo);
		System.out.println("o Valor do atributo ESTATICO �  :"+atributoStatic);
		
	}
	
	public static void hello(){
		System.out.println("hellouuuuu!!");
		// variaveis de instancia n�o podem ser chamadas diretamente em um metodo estatico;
		//System.out.println("o Valor do atributo �  :"+ atributo);
		System.out.println("o Valor do atributo ESTATICO �  :"+atributoStatic);
	}
	
	
}
