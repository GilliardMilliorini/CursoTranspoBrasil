package br.com.cursojava.aula014;

import java.util.Scanner;

public class AppVeiculo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		CadastroVeiculo cadastro = new CadastroVeiculo();
		cadastro.mostrarMenu(teclado);		
		teclado.close();
	}
	
}
