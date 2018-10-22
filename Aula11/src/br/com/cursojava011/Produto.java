package br.com.cursojava011;

public class Produto {

	// variavel de instancia
	private String nome; // encapsular variavel como privada para nao permitir a
							// atribuição de valores sem autorizaçao
	private double preco;

	private boolean promocao;
	
	public void setPreco(double preco) { // encapsular variavel com
												// publica
		if (preco >= 0.01) {
			this.preco = preco;
		} else {
			System.out.println("Valor invalido");
		}
	}

	public double getPreco() {
		return preco;
	}

	public void setNome(String nome) {  // padrao SET... serve para configurar
		this.nome = nome;
	}

	public String getNome() {   // padrao GET... serve como retorna
		return nome;
	}
public void setPromocao(boolean promocao){
	this.promocao = promocao;
}
public boolean isPromocao(){  // quando valor for boolean usar IS no lugar se SET. padrao
	
	return promocao;
}
}

// Crie uma classe Poduto que possua os atributos nome e preço, a classe também
// deve possuir metodos de configuração e acesso para cada um dos
// atributos definidos.
