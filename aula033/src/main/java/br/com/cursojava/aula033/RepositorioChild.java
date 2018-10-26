package br.com.cursojava.aula033;

import java.util.List;


public interface RepositorioChild {
	
	public List<Child> listarTodos();
	public Child buscarPorId(Integer id);
	public boolean incluir(Child child);
	public boolean atualizar(Child child);
	public boolean remover (Integer id);
	
	

}
