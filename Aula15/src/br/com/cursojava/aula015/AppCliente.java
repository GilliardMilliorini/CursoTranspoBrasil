package br.com.cursojava.aula015;

import java.util.Scanner;

public class AppCliente {
	
public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	CadastroCliente cliente = new CadastroCliente();
	cliente.mostrarMenu(teclado);
	
	teclado.close();
}
}



// Gilliard, Matheus, Wilker.