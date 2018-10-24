package br.com.cursojava.aula031;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity					// setando uma entidade
@Table(name="pessoas")	// indica o nome da tabela que vamos utilizar, caso nome da tabela e do class forem o mesmo nao e necessario informar.
public class Pessoa {
	
	@Id				// indica que a propriedade ir� se vincular com a coluna da tabela que tenha a chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY) // indica que o id ser� utilizado o mesmo padrao do IDENTITY - Serial neste caso
	Integer id;
	
	@Column			// informa que este campo ser� informado pela coluna nome. 
	String nome;
	

	public Pessoa() {
		super();
		
	}
	public Pessoa(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + "]";
	}
	
	
	
}
