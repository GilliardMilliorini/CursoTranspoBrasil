package br.com.cursojava.aula015;

import java.util.ArrayList;

public class RepositorioCliente {
	
	private static int count = 1;
	private ArrayList<Cliente> clientes = new ArrayList<>();
	private ArrayList<Endereco> enderecos = new ArrayList<>();
	
	public boolean adicionar(Cliente cliente, Endereco endereco) {
		boolean resultado = false;
		if(cliente != null && endereco != null) {
			cliente.setId(count++);
			resultado = clientes.add(cliente) && enderecos.add(endereco);
		}
		return resultado;
	}

	public ArrayList<Cliente> buscarTodos() {
		return clientes;
	}

	public boolean excluir(int index) {
		boolean resultado = false;
		if(index > -1){
			clientes.remove(index);
			resultado = true;
		}
		return resultado;
	}

	
}
