package br.com.cursojava011;

public class Aluno {

	String nome;
	String telefone;
	String matricula;
	
	void configuraNome(String nome){
		this.nome = nome;
	}
	String retornaNome(){
		return nome;
	}
	
	void configuraTelefone(String telefone){
		this.telefone = telefone;
	}
	String retornaTelefone(){
		return telefone;
	}
	
	void configuraMatricula(String matricula){
		this.matricula = matricula;
	}
	String retornaMatricula(){
		return matricula;
	}
	
}

/* Crie uma classe Aluno que deve possuir os atributos nome, telefone, matricula.A classe deve possuir metodos de config e acesso para
 * cada um dos atrubutos definidos.

*/