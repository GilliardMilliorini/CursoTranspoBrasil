package br.com.cursojava.aula018;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConversorTemperatura {

	
	private Temperatura conv;
	
	@Before
	public void antesDeTestar(){
		conv = new Temperatura();
	}
	
	@After
	public void aposTestar(){
		System.out.println(" fim do teste");
	}
	
	@Test
	public void converterTemperatura1(){
		
		double resultado = conv.fahrenheitToCelsius(10.0);		// não conclui
		Assert.assertEquals(-12.222222222, resultado, 0);
	}
	
	
	@Test
	public void converterTemperatura2(){							//não conclui
		
		double resultado = conv.celsiusToFahrenheit(10,0);
		Assert.assertEquals(0.0, resultado, 0);
	}
}
