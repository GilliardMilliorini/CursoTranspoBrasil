package br.com.cursojava3;

import java.util.Scanner;  // neccessário para importar uma diretiva.

public class ExemploConversaoDados {
	
	public static void main(String [] args){
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um numero");
		String n1 = teclado.nextLine();
		int numero1 = Integer.parseInt(n1); // parseint converte texto em int pegando a variavel "n1"
		System.out.println("Digite outro numero");
		int numero2 = Integer.parseInt(teclado.nextLine());// parseint converte texto em int pegando o valor de teclado.nextLine(variavel)
		//String numero2 = teclado.nextLine(); nao precisa ser digitado se for feito confome linha de cima""(Integer.parseInt(teclado.nextLine())"";
		System.out.println(numero1 + numero2); // quando a variavel é string o "+" serve para concatenar(juntar) e não para sumar.
		//System.out.println(" O resultado é" + numero1 + numero2); não funciona porque ele vai puxar o valor texto e contatenar .
		//System.out.println(numero1 + numero2 + "é o valor"); funciona porque ele está puxando primeiramente os valores int e depois string
		System.out.println("Digite o preço do produto");
		double preco = Double.parseDouble(teclado.nextLine());
		double desconto = 0.10;
		System.out.println("O valor de desconto é "+(preco * desconto)); // neste caso o sistema funciona pois está calculando primeiro o valor dos "( )" e depois a String.
		
		teclado.close();
	}
}



// byte short boolean char int long float double são os tipos primitivos