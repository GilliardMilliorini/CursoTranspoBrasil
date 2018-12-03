package br.com.cursojava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RepositorioProduto {
	
	private static List<Produto> lista= new ArrayList<>();
	private static Integer count = 1;
	static{
		
		lista.add(new Produto(count++, "Arroz", "Pacote de arroz 1 kg", 3.52));
		lista.add(new Produto(count++, "Macarrão", "Pacote de macarrao 1 kg", 2.31));
		lista.add(new Produto(count++, "Trigo", "Pacote de trigo 1 kg", 4.26));
		lista.add(new Produto(count++, "azeite", "Azeite 1 ltr", 2.25));
				
	}
public List<Produto> buscarTodos(){
	return lista;
}

public Produto buscarPorId(Integer id){
	Produto produto = null;
	for(Produto atual : lista){
		if(atual != null && id.equals(atual.getId())){
			produto = atual;
			break;
		}
	}
	return produto;
}
	
public boolean salvar (Produto produto){
	boolean resultado = false;
	if(produto!= null){
		if(produto.getId() == null){
			resultado = inserir(produto);
		}else{
			resultado = atualizar(produto);
		}
	}
	
	return resultado;	
}

private boolean inserir(Produto produto) {
	produto.setId(count++);
	return lista.add(produto);
}

private boolean atualizar(Produto produto) {
	boolean resultado = false;
	int indx = lista.indexOf(produto);
	if(indx > -1){
		lista.set(indx, produto);
	}
	return resultado;
}


public boolean remover (Integer id){
	
	int qt = lista.size();
	lista = lista.stream().filter(c -> !id.equals(c.getId())).collect(Collectors.toList());
	return qt > lista.size();
}



}
