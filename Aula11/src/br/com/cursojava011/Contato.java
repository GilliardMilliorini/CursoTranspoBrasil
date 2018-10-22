package br.com.cursojava011;

public class Contato {
	
	// Variavel de instancia / propriedades / Atributos;
	String nome;
	String email;				// variavel de instancia.
	String telefone;
	
	
	//ações
	void configuraNome(String nome){ 		// variavel local
		this.nome = nome;		// this serve para atribuir o valor da variavel local para a variavel de instancia (quando as 
	}							//																variaveis tem o mesmo nome).
	String retornaNome(){
		return nome;			// sobreamento de variaveis é quando a variavel local sobrepoe a de instancia.
	}
	
	void configuraEmail(String email){
		this.email = email;
	}
	String retornaEmail(){
		return email;
	}
	
	void configuraTelefone(String telefone){
		this.telefone = telefone;
	}
	String retornaTelefone(){
		return telefone;
	}
	
	void ligar(){
		System.out.println("Ligano para o contato "+nome);
		System.out.println("Telefone "+telefone);
	}
	
	void enviarMensagem(String mensagem){
		System.out.println("Enviando a mensagem ");
		System.out.println(mensagem);
		System.out.println("Para o email : "+email);
	}
}


//Variavel de instancia existe enquanto o objeto estiver na memoria;