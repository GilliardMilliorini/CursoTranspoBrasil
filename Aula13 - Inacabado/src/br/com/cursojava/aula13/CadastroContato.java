package br.com.cursojava.aula13;

import java.util.Scanner;

public class CadastroContato {

private static final int FILTRAR_TELEFONE = 4;
private static final int FILTRAR_NOME = 3;
private static final int LISTAR = 2;
private static final int NOVO = 1;
private static final int SAIR = 5;
//CadastroController controller = new CadastroController();
	
	public void mostrarMenu(Scanner teclado) {

		int opcao = 0;
		do {
			System.out.println("======================= Menu principal ==========================");
			System.out.println("1 - Cadastrar Contato");
			System.out.println("2 - Listar os Contatos Cadastrados");
			System.out.println("3 - Pesquisar um contato através do nome");
			System.out.println("4 - Pesquisar um contato através do telefone");
			System.out.println("5 - Sair");
			
			opcao = Integer.parseInt(teclado.nextLine());
			tratarOpcao(opcao, teclado);

		} while ((opcao != SAIR));
	}

	private void tratarOpcao(int opcao, Scanner teclado){
		switch(opcao){
		case NOVO:				// mesma coisa que por case 1 2 e etc.
			cadastrarContato(teclado);
			break;
		
		case LISTAR:
			listarContato();
			break;
		
		case FILTRAR_NOME:
			pesquisaContatoNome(teclado);
			break;
		
		case FILTRAR_TELEFONE:
			pequisaContatoTelefone(teclado);
			break;
			
			
		case SAIR:
		System.out.println("Obrigado por utilizar nosso sistema, volte sempre!");
		break;
		
		default:
		System.out.println("Opção invalida");
		}
	}

	private void cadastrarContato(Scanner teclado) {
		System.out.println("========== CADASTRAR CONTATO ===========");
		System.out.println("Informe o nome do Contato");
		String nome = teclado.nextLine();
		System.out.println("informe o Telefone do contato do Produto");
		String telefone = teclado.nextLine();
		System.out.println("informe o E-mail do contato ");
		String email = teclado.nextLine();
		controller.adicionarContato(nome, email, telefone);
	}
	

	private void listarContato() {
		
	}

	private void 	pesquisaContatoNome(Scanner teclado) {
		// TODO Auto-generated method stub
		
	}

	private void pequisaContatoTelefone(Scanner teclado) {
		// TODO Auto-generated method stub
		
	}

	
}
