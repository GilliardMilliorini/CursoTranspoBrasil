package br.com.cursojava;

public class ExemploString {

	public static void main(String[]args){
		String curso = "Java Web TranspoBrasil";
		
		//length() Retorna a quantidade de caracteres da linha.
		System.out.println(curso.length());
		
		//charAt retorna o caracter em uma posção especifica
		for(int posicao = 0; posicao< curso.length();posicao++){
			
			System.out.println(curso.charAt(posicao));
			
		}
			
			//indexOf() retorna o indice da String
			System.out.println(curso.indexOf("Web"));
			System.out.println(curso.indexOf("a", 4));
			
		}
				
		
	}

