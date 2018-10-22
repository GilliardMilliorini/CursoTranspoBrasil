package br.com.cursojava.aula017;

public class Ave extends Animal implements Voador {

	@Override
	public void Comer() {
	System.out.println("Ave comendo...");
		
	}
@Override
	public void voar(){
		System.out.println("Ave voando...");
	}
	
}
