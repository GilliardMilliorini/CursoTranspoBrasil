package br.com.cursojava.aula015;

import java.util.ArrayList;

public class ControllerClientes {

	private RepositorioCliente repositorio = new RepositorioCliente();

	public boolean isNomeValido(String nome) {
		boolean resultado = nome != null && !"".equals(nome.trim()) && nome.length() >= 3;
		return resultado;
	}

	public boolean isEnderecoValido(String temp) {
		boolean resultado = temp != null && !"".equals(temp.trim());
		return resultado;
	}

	public boolean isNumeroValido(int numero) {
		boolean resultado = numero > 0;

		return resultado;
	}

	public boolean adicionarCliente(String nome, String email, String telefone, String tipo, String rua, int numero,
			String complemento, String bairro, String cep, String estado, String cidade) {
		Cliente cliente = new Cliente();
		Endereco endereco = new Endereco();
		cliente.setNome(nome);
		cliente.setEmail(email);
		cliente.setTelefone(telefone);
		cliente.setEndereco(endereco);
		cliente.setTipo(tipo);

		endereco.setRua(rua);
		endereco.setNumero(numero);
		endereco.setBairro(bairro);
		endereco.setComplemento(complemento);
		endereco.setCidade(cidade);
		endereco.setCep(cep);
		endereco.setEstado(estado);
		return repositorio.adicionar(cliente, endereco);

	}

	public ArrayList<Cliente> listarClientes() {
		
		return repositorio.buscarTodos();
	}

	public boolean excluirCliente(Integer id, ArrayList<Cliente> lista) {
		boolean resultado = false;
		for(int index = 0; index < lista.size(); index ++){
			if(lista.get(index).id== id){
				resultado = repositorio.excluir(index);
				
			}
		}
		
		return resultado;
		
	}

}
