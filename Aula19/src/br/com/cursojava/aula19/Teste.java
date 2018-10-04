package br.com.cursojava.aula19;

public class Teste {

	
	public static int atributoStatic;				// variavel statico
	public int atributo;							//variavel de instancia
	
	
	public void oi(){
		System.out.println("ola!!!!");
		System.out.println("o Valor do atributo é  :"+atributo);
		System.out.println("o Valor do atributo ESTATICO É  :"+atributoStatic);
		
	}
	
	public static void hello(){
		System.out.println("hellouuuuu!!");
		// variaveis de instancia não podem ser chamadas diretamente em um metodo estatico;
		//System.out.println("o Valor do atributo É  :"+ atributo);
		System.out.println("o Valor do atributo ESTATICO É  :"+atributoStatic);
	}
	
	
}
