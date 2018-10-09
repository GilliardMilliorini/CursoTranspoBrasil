package br.com.cursojava.exercicio;

public class Veiculo {

	String marcaVeiculo;
	String modeloVeiculo;
	String corVeiculo;
	int anoDeFabricacaoVeiculo;
	int anoModeloVeiculo;

	String retornaMarca() {
		return marcaVeiculo;
	}

	void configuraMarca(String marca) {
		this.marcaVeiculo = marca;
	}

	String retornaModelo() {
		return modeloVeiculo;
	}

	void configuraModelo(String modelo) {
		this.modeloVeiculo = modelo;
	}

	String retornaCor() {
		return corVeiculo;
	}

	void configuraCor(String cor) {
		this.corVeiculo = cor;
	}

	int retornaAnoDeFabrica��o() {
		return anoDeFabricacaoVeiculo;
	}

	void configuraAnoDeFabrica��o(int anoDeFabrica��o) {
		this.anoDeFabricacaoVeiculo = anoDeFabrica��o;
	}

	int retornaAnoModelo() {
		return anoModeloVeiculo;
	}

	void configuraAnoModelo(int anoModelo) {
		this.anoModeloVeiculo = anoModelo;
	}

}
