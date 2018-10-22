package br.com.cursojava.aula014;

public class Veiculo {
	Integer id;
	String marca;
	String modelo;
	String cor;
	int anoFabricacao;
	int anoModelo;
	String placa;
	
	public void setId(Integer id) {
		this.id = id;
	}
	Integer getId(){
		return id;
	}
	void setMarca(String marca){
		this.marca = marca;
	}
	
	String getMarca(){
		return marca;
	}
	
	void setModelo(String modelo){
		this.modelo = modelo;
	}
	String getModelo(){
		return modelo;
	}
	
	void setCor(String cor){
		this.cor = cor;
	}
	String getCor(){
		return cor;
	}

	void setAnoFabricacao(int anoFabricacao){
		this.anoFabricacao = anoFabricacao;
	}
	int getAnoFabricacao(){
		return anoFabricacao;
	}
	
	void setAnoModelo(int anoModelo){
		this.anoModelo = anoModelo;
	}
	int getAnoModelo(){
		return anoModelo;
	}

	 void setPlaca(String placa) {
		 
		this.placa = placa;
		
	}
	 String getPlaca(){
		 return placa;
	 }
	
	
}



