package br.com.cursojava.aula032;

import java.util.List;

public interface RepositorioProduto {
	
	public abstract List<Produto> buscarTodos();
	public abstract List<Produto> buscarPorNome(String nome);
	public abstract List<Produto> buscarPorPreco(double minimo, double maximo);
	public Produto buscarPorId(Integer id);
	public boolean inserir(Produto produto);
	public boolean atualizar(Produto produto);

	public int contar();



}
