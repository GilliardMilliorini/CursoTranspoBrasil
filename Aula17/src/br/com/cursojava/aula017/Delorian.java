package br.com.cursojava.aula017;

public class Delorian extends Carro implements Turbinavel, Voador { //Pode ser utilizadomais de uma interface utilizando "," 

	@Override
	public void acionarTurbo() {
		System.out.println("Acionando turbo...");
		
	}

	@Override
	public void desligarTurbo() {
		System.out.println("Desligando Turbo...");
		
	}

	@Override
	public void voar() {
		System.out.println("Delorian voando...");
		
	}
	

	
	
}
