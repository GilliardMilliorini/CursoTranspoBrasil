package br.com.cursojava.aula018;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTeste {
	
	private Calculadora calc;		//constante
	
	@Before								// utilizado para execurar a ação antes de iniciar cada comando;  -- Instanciando anotação
	public void antesDeCadaTeste(){
		calc = new Calculadora();
	}
	
	@After						// instancia de anotação utilizada para execurar a acção apos o termino de cada comando
	public void depoisDeCadaTest(){
		System.out.println("Terminou mais um teste");
		
	}
	
	@Test					// utilizado para execurar testes.
	public void testSomarDoisMaisDois(){
	//	Calculadora calc = new Calculadora();		// não é necessario esta linha, só precisa criar uma constante no inicio do codigo.
		
		double resultado = calc.somar(2.0, 2.0);
		Assert.assertEquals(4.0, resultado, 0);
	}
		
				
		//Assert.fail("Teste somar ainda não implementado");
		
		@Test
		public void testSomarDoisMaisTres(){
			double resultado = calc.somar(2.0, 3.0);
			Assert.assertEquals(5.0, resultado, 0);
			
		}
		
		@Test
		public void testSomarCincoMaisVinte(){
			double resultado = calc.somar(5.0, 20.0);
			Assert.assertEquals(25.0, resultado, 0);
	}

		@Test					// utilizado para execurar testes.
		public void testSubtrairDoisMenosDois(){
		//	Calculadora calc = new Calculadora();		// não é necessario esta linha, só precisa criar uma constante no inicio do codigo.
			
			double resultado = calc.subtrair(2.0, 2.0);
			Assert.assertEquals(0.0, resultado, 0);
		}
			
		@Test					// utilizado para execurar testes.
		public void testSubtrairVinteMenosDez(){
		//	Calculadora calc = new Calculadora();		// não é necessario esta linha, só precisa criar uma constante no inicio do codigo.
			
			double resultado = calc.subtrair(20.0, 10.0);
			Assert.assertEquals(10.0, resultado, 0);
		}
}
	


