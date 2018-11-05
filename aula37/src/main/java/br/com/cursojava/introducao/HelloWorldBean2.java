package br.com.cursojava.introducao;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="helloWorldBean2")
@SessionScoped
public class HelloWorldBean2 {

	
	private String nome;
	
	private String time;
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	public String salvar(){					// criando uma validação para que o nome não seja nulo e tenha 3 ou mais caracteres
		if(this.nome != null && this.nome.length() >= 3){
			return "resultEx";
		}else {
			return null;
		}
	}

	
}
