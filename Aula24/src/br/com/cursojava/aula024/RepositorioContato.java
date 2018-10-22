package br.com.cursojava.aula024;

import java.util.List;

public interface RepositorioContato {

	public boolean adicionar(Contato contato);

	public boolean editar(Contato contato);

	public List<Contato> buscarTodos();

	public List<Contato> buscarPorNome(String nome);

	public List<Contato> buscarPorTelefone(String telefone);

	public List<Contato> buscarPorTipo(TipoContato tipo);

	public Contato buscarPorId(Integer id);

	public boolean remover(Contato contato);



}

/*
 * 3 ) Crie uma Interface denomidada RepositorioContato com os seguintes
 * métodos:
 * 
 * boolean adicionar (Contato contato); boolean editar (Contato contato);
 * java.util.List<Contato> buscarTodos (); java.util.List<Contato>
 * buscarPorNome(String nome); java.util.List<Contato> buscarPorTelefone(String
 * telefone); java.util.List<Contato> buscarPorTipo(TipoContato tipo); Contato
 * buscarPorId(Integer id); boolean remover(Contato contato);
 */