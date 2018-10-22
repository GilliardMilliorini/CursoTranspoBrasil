package br.com.cursojava.aula13;

public class Contato {

	private int id;
	private String nome;
	private String telefone;
	private String email;
	
	
	
	
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return id;
	}
	
	public void setNome(String nome){
		if(nome.length() > 3 && !"".equals(nome.trim())){				// Verificar como utilizar o && para comparar quando ele estiver preenchido com ESpaços no lugar de letras
			this.nome = nome;
			
		}else{
				System.out.println("Nome deve conter ao menos 3 caracteres, digite novamente");
			}
		}
	public String getNome (){
		return nome;
	}
	
	public void setTelefone(String telefone){			// veriicar porque vao aceita por String telefone dentro dos ()
		this.telefone = telefone;
	}
	
	public String setTelefone(){
		return telefone;
	}
	
	
	public void setEmail(String email){	//velificar como validar email, sendo que o mesmo deve conter @ e .com no corpo para melhorar o desempenho do sist
		this.email = email;
		
	}
	public String getEmail(){
		return email;
	}


}
	

