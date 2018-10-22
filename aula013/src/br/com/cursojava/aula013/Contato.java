package br.com.cursojava.aula013;

public class Contato extends Pessoa {		// utilizado para relacionar a herança de uma classe para outra.
	
	private Integer id;
//	private String nome;
	private String email;
	private String telefone;
	
	
	
	public Contato(Integer id, String nome, String codigo, String email, String telefone){
		super(codigo, nome);
		this.id = id;
		this.email = email;
		this.telefone = telefone;
		
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
//	public String getNome() {
//		return nome;
//	}
//	public void setNome(String nome) {
//		this.nome = nome;
//	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	

}
