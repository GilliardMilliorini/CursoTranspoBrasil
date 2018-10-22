package br.com.cursojava011;

public class App {
	public static void main(String[] args) {
	
		Contato abacaxi = new Contato();  //variavel com o tipo Contato vem da class COntato criado no projeto.
		
		abacaxi.nome = "João";
		abacaxi.email = "joao@teste.com";		//a variavel so funcionara se ela estiver setada com o tipo correto criado no inicio do projeto.
		abacaxi.telefone = "33211100";
		
		System.out.println(abacaxi.nome);		//sistema trazendo as propriedades.
		System.out.println(abacaxi.email);
		System.out.println(abacaxi.telefone);
		
		abacaxi.configuraNome("João da Silva");			//chama o metodo com parametros definidos pelo ()
		System.out.println(abacaxi.retornaNome());
		// pode usar tambem o abaixo
		System.out.println(abacaxi.nome);
	
		abacaxi.ligar();
	}
	
	
}
