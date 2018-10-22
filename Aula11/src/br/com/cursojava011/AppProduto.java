package br.com.cursojava011;

import java.util.Scanner;

public class AppProduto {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		CadastroProdutos cadastro = new CadastroProdutos();
		cadastro.mostrarMenu(teclado);
		
			
		
		teclado.close();
	
	}
}

// encapsular variavel como privada e publica a chamada
