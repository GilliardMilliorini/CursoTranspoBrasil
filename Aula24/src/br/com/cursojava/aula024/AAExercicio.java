package br.com.cursojava.aula024;

public class AAExercicio {

}


/*1 ) Crie uma Enum TipoContato com os seguintes valores:
 * FAMILIA,
 * AMIGO,
 * TRABALHO,
 * OUTROS.
 * 
 * 
 * 2  ) Crie uma classe Contato com os atributos abaixo:
 * id: Integer
 * nome : String
 * email : String
 * telefone : String
 * tipo : TipoContato
 * 
 * 3 ) Crie uma Interface denomidada RepositorioContato com os seguintes métodos:
 * 
 * boolean adicionar (Contato contato);
 * boolean editar (Contato contato);
 * java.util.List<Contato> buscarTodos ();
 * java.util.List<Contato> buscarPorNome(String nome);
 * java.util.List<Contato> buscarPorTelefone(String telefone);
 * java.util.List<Contato> buscarPorTipo(TipoContato tipo);
 * Contato buscarPorId(Integer id);
 * boolean remover(Contato contato);
 * 
 * 
 * 
 * 4 ) Crie uma classe denominada RepositorioContatoMemory que implemente a interface RepositorioContato. 
 * Esta classe deve armazenar os dados dos contatos em uma lista em memoria
 * 
 * 5 ) Crie uma classe de Testes que realize os testes unitarios para todos os métodos da classe RepositorioContatoMemory.


*/