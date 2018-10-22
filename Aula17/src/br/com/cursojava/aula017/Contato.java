package br.com.cursojava.aula017;

public class Contato implements Comparable<Contato> {

	private String nome;
	private String email;

	public Contato() {
		super();
	}

	public Contato(String nome) {
		super();
		this.nome = nome;
	}

	public Contato(String nome, String email){
		this(nome);
		this.email = (email);
		
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override // usado para retornar toString, sem ele o sistema retorna o
				// codigo de memoria do objeto.
	public String toString() {
		return "Contato [nome=" + nome + " " + " " +  email +  "]";
	}

	@Override
	public int compareTo(Contato o) {	
		// fazer uma validação para que ele compare o nome com o nome do outro objeto.
		
	if(nome!= null){
		if(o != null && o.nome!= null){
			int compare = Integer.compare(nome.length(),o.nome.length()); 
			//compara tamanho de nomes para organizar por quantidade de caracteres
			
			if(compare ==0){
					compare = nome.compareTo(o.nome);
			}
				return compare;
			
		}else{
			return -1;
		}
	}else if(o==null||o.nome==null){

		return 0;
		
	}else
		return 1;
	}



}
	

