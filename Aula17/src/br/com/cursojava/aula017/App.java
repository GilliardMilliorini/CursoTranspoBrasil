package br.com.cursojava.aula017;

public class App {

		public static void main(String[] args) {
//			Animal a1 = new Animal();
			Animal a2 = new Humano();
			Animal a3 = new Peixe();
			Animal a4 = new Bovino();
			Animal a5 = new Reptil();
			
//			a1.Comer();
			a2.Comer();
			a2.respirar();
			a3.Comer();
			a3.respirar();
			a4.Comer();
			a4.respirar();
			
			a5.Comer();
			a5.respirar();
			
		
			Voador v = new Voador() {
				
				@Override
				public void voar() {
					System.out.println("Voador anonimo voando..."); // criando uma classe anonima.
					
				}
			};
			v.voar();
			
		}
	
}
