package br.com.cursojava.aula017;

public abstract class Animal {

	
		public abstract void Comer();
		
		
		public void respirar(){
			System.out.println(this.getClass().getSimpleName()+" Respirando Oxigenio");
		}
}
