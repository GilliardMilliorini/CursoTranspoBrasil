package br.com.cursojava;

public class UsandoReplace {

	public static void main(String[]args){
		String curso = "Java Web TranspoBrasil";	
		String a = "bola";
		System.out.println(a.replace("o", "a"));
		System.out.println(a);
		String b = "bola";
		String c = new String ("bola");
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(a.equals(c));

		System.out.println(curso.substring(9));
		System.out.println(curso.substring(0,5));
		
	}
}
