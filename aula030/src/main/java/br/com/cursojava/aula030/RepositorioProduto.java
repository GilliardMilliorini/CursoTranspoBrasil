package br.com.cursojava.aula030;

import java.util.List;

public interface RepositorioProduto {
	
	public abstract List<Produto> buscarTodos();
	public abstract List<Produto> buscarPorNome(String nome);
	public abstract List<Produto> buscarPorPreco(double minimo, double maximo);
	public Produto buscarPorId(Integer id);
	public void inserir(Produto produto);
	public void atualizar(Produto produto);
	public void remover(Integer id);
	public int contar();

}
