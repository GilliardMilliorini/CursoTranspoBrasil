package br.com.cursojava.aula024;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class RepositorioContatoMemory implements RepositorioContato {

	private static int count = 1;
	private  List<Contato> contatos = new ArrayList();
	static {
		//contatos.add(new Contato(1, "João", "joao@joao", "99999999", TipoContato.AMIGO));
//		contatos.add(new Contato(2, "maria", "maria@maria", "8888888", TipoContato.FAMILIA));			// durante a execução do teste comentar este campo para o teste passar.
//		contatos.add(new Contato(3, "pedro", "pedro@pedro", "7777777", TipoContato.TRABALHO));
//		contatos.add(new Contato(4, "Cida", "cida@cida", "6666666", TipoContato.OUTROS));
	}

	@Override
	public boolean adicionar(Contato contato) {
		boolean resultado = false;
		if (contato != null) {
			contato.setId(count++);
			resultado = contatos.add(contato);
		}

		return resultado;
	}

	@Override
	public boolean editar(Contato contato) {
		boolean resultado = false;
		//Optional<Contato> data = contatos.stream().filter((c) -> c.getId()equals(contato.getId()))
		

		return false;
	}

	@Override
	public List<Contato> buscarTodos() {

		return contatos;
	}

	@Override
	public List<Contato> buscarPorNome(String nome) {

		Stream<Contato> streamContatos = contatos.stream();

		List<Contato> contatosPorNome = streamContatos						// realizar este cmando junto a classe teste para verificar se o processo está correndo corretamente
		.filter((Contato contato) -> { 
			return nome.equals(contato.getNome());							// mesmo processo realizado para todos os "buscar" so mudando a informação que ele busca
		})
		.collect(Collectors.toList());	
				
		return contatosPorNome ;


	}

	@Override
	public List<Contato> buscarPorTelefone(String telefone) {
		
		Stream<Contato> streamContatos = contatos.stream();

		List<Contato> contatosPorTelefone = streamContatos						// realizar este cmando junto a classe teste para verificar se o processo está correndo corretamente
		.filter((Contato contato) -> { 
			return telefone.equals(contato.getTelefone());							// mesmo processo realizado para todos os "buscar" so mudando a informação que ele busca
		})
		.collect(Collectors.toList());	
				
		return contatosPorTelefone;

	}

	@Override
	public List<Contato> buscarPorTipo(TipoContato tipo) {
		
		Stream<Contato> streamContatos = contatos.stream();

		List<Contato> contatosPorTipo = streamContatos						// realizar este cmando junto a classe teste para verificar se o processo está correndo corretamente
		.filter((Contato contato) -> { 
			return TipoContato.AMIGO.equals(contato.getTipo());							// mesmo processo realizado para todos os "buscar" so mudando a informação que ele busca
		})
		.collect(Collectors.toList());	
				
		return contatosPorTipo ;


			}

	@Override
	public Contato buscarPorId(Integer id) {

		return null;
	}

	@Override
	public boolean remover(Contato contato) {
		// boolean resultado = false;
		// if(contato > -1){ //verificar o porque não aceia o contato < -1
		// contatos.remove(contato);
		// resultado = true;
		// }
		return false;
	}

}

/*
 * 4 ) Crie uma classe denominada RepositorioContatoMemory que implemente a
 * interface RepositorioContato. Esta classe deve armazenar os dados dos
 * contatos em uma lissta em memoria
 */