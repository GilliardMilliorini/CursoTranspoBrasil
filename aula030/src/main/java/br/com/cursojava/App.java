package br.com.cursojava;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		CadastroProduto cadastro = new CadastroProduto();
		cadastro.mostrarMenu(teclado);
		teclado.close();
	}

	
	
}
