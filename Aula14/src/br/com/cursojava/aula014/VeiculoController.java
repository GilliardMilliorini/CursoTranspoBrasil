package br.com.cursojava.aula014;

import java.util.ArrayList;

public class VeiculoController {
	
	private VeiculoRepositorio repositorio = new VeiculoRepositorio();
		
	public boolean adicionarVeiculo(String modelo, String marca, String placa, int anoFabricacao, int anoModelo) {
		Veiculo veiculo = new Veiculo();
		veiculo.setModelo(modelo);
		veiculo.setMarca(marca);
		veiculo.setPlaca(placa);
		veiculo.setAnoFabricacao(anoFabricacao);
		veiculo.setAnoModelo(anoModelo);
		return repositorio.adicionarVeiculo(veiculo); 
		
	}

	public boolean isModeloValido(String modelo) {
		boolean valido = modelo !=null && !"".equals(modelo.trim()) && modelo.length() >=3;
		return valido;
	}

	public ArrayList<Veiculo> buscarTodos() {
		
		return repositorio.buscarTodos();
}

	public ArrayList<Veiculo> filtrarModelo(String modelo) {
		ArrayList<Veiculo> todos = buscarTodos();
		ArrayList<Veiculo> lista = new ArrayList<>();
		
		for (Veiculo veiculo : todos) {
			if(veiculo != null && veiculo.getModelo() != null && veiculo.getModelo().startsWith(modelo)){
				lista.add (modelo);
			}
		}
		
		return lista;
	}
	
	public ArrayList<Veiculo> filtrarPlaca(String placa) {
		ArrayList<Veiculo> todos = buscarTodos();
		ArrayList<Veiculo> lista = new ArrayList<>();
		
		for (Veiculo veiculo : todos) {
			if(veiculo != null && veiculo.getPlaca() != null && veiculo.getPlaca().startsWith(placa)){
				lista.add (placa);
			}
		}
		
		return lista;
	
	}
	


	public ArrayList<Veiculo> filtrarAnoFabricacao(String anoFabricacao) {
		ArrayList<Veiculo> todos = buscarTodos();
		ArrayList<Veiculo> lista = new ArrayList<>();
		
		for (Veiculo veiculo : todos) {
			if(veiculo != null && veiculo.getAnoFabricacao()!= null && veiculo.getAnoFabricacao().startsWith(anoFabricacao)){
				lista.add (anoFabricacao);
			}
		}
		
		return lista;
	
	
	
}
}