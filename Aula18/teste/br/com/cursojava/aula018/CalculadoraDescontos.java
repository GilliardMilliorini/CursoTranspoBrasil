package br.com.cursojava.aula018;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CalculadoraDescontos {
	
	private CalculadoraDesc calc;
	
	@Before
	public void anterTeste(){
		calc = new CalculadoraDesc();
	}
	
	@After
	public void depoisTeste(){
		System.out.println("Fim o teste");
	}
	
	@Test
	public void testeNegativo(){
		double resultado = calc.negativo(-5.0);
		Assert.assertEquals(0.0, resultado, 0);
		
	}
	@Test
	public void testePositivo(){
		double resultado = calc.positivo(1800.0);
		Assert.assertEquals(1800.0, resultado, 0);
		
	}
	@Test
	public void testeDescontoCinco(){
		double resultado = calc.descontoCinco(1801.01, 5.0);
		Assert.assertEquals(1710.9595, resultado, 0);
		
	}
	
	@Test
	public void testeDescontoVinteeDois(){
		
		double resultado = calc.descontoVinteeDois(2400.01 , 22.0);
		Assert.assertEquals(1872.00780, resultado, 0.1);
		
	}

	@Test
	public void testeDescontoTrintaeDois(){
		
		double resultado = calc.descontoTrintaeDois(3600.0 , 32.0);
		Assert.assertEquals(2448, resultado , 0.1);
	}
	
}
