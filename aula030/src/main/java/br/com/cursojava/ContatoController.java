package br.com.cursojava;

import br.com.cursojava.aula013.Contato;

public class ContatoController {

	public boolean isNomeValido(String nome) {
		boolean valido = nome !=null && !"".equals(nome.trim()) && nome.length() >=2;
		return valido;
	}

	public boolean adicionarProduto(String nome, boolean preco) {

		Produto produto = new Produto(null, nome, preco);
		return repositorio.adicionarContato(contato);
	}
		
		return false;
	}

	public boolean isValorValido(double preco) {
		boolean valido = preco >= 0.02;
		return valido;
	
	}



}
