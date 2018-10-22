package br.com.cursojava011;

public class Veiculosssss {

	String marca;
	String modelo;
	String cor;
	String anoFabricacao;
	String anoModelo;
	
	void configuraMarca(String marca){
		this.marca = marca;
	}
	
	String retornaMarca(){
		return marca;
	}
	
	void configuraModelo(String modelo){
		this.modelo = modelo;
	}
	String retornaModelo(){
		return modelo;
	}
	
	void ConfiguraCor(String cor){
		this.cor = cor;
	}
	String retornaCor(){
		return cor;
	}

	void configuraAnoFabricacao(String anoFabricacao){
		this.anoFabricacao = anoFabricacao;
	}
	String retornaAnoFabricacao(){
		return anoFabricacao;
	}
	
	void configuraAnoModelo(String anoModelo){
		this.anoModelo = anoModelo;
	}
	String retornaAnoModelo(){
		return anoModelo;
	}
	
	
}


/*
 * Crie uma classeVeiculo, que possua atributos marca, modelo, cor , ano de
 * fabricação e ano modelo.A classe deve possuir metodos de config e acesso para
 * cada um dos atrubutos definidos.
 * 
 */
