package br.com.cursojava.aula029;

import java.util.List;

public interface RepositorioContato {
	
	public abstract List<Contato> buscarTodos();
	public abstract List<Contato> buscarporNome(String nome);
	public abstract Contato buscarPorTelefone(String telefone);
	public abstract Contato buscarPorId(Integer id);
	
	public void inserir(Contato contato);
	public void atualizar(Contato contato);
	public void remover(Integer id);
	public int contar();

}
