package br.com.cursojava.aula014;

import java.util.ArrayList;

public class VeiculoRepositorio {
	private static int count = 1;
	private static ArrayList<Veiculo> veiculos = new ArrayList<>();
	
	
	public boolean adicionarVeiculo(Veiculo veiculo) {
		boolean resultado = false;
		if(veiculo != null){
		veiculo.setId(count++);
		resultado = veiculos.add(veiculo);
			
		}
			return resultado;
	
	}


	public ArrayList<Veiculo> buscarTodos() {
	
		return veiculos;
	}

}
