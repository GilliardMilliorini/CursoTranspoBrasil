package br.com.cursojava3;
import java.util.Scanner;

public class ExemploLeitor {
 public static void main(String[] args){
	 Scanner teclado = new Scanner(System.in); // System.in serve para controlar a enrtrada padrao do sistema
	 System.out.println("Digite seu nome:");
	 String nome = teclado.nextLine(); // nextLine para retornar toda informação digitada antes de precionar ENTER ( sempre retorna String como dado)
	 System.out.printf("O nome digitado foi %s \n", nome);	 
	 teclado.close();// sempre que abrir uma operação fechar no final.
 }
}
