package br.com.cursojava.aula015;

import java.util.ArrayList;
import java.util.Scanner;


public class CadastroCliente {

	private static final int SAIR = 6;
	private ControllerClientes controller = new ControllerClientes();
	private Cliente cliente = new Cliente();
	private ArrayList<Cliente> clientes = new ArrayList<>();

	public void mostrarMenu(Scanner teclado) {

		int opcao = 0;

		do {
			System.out.println("==========MENU PRINCIPAL==========");
			System.out.println("1- Cadastro de cliente");
			System.out.println("2 - Listar Cliente");
			System.out.println("3 - Filtrar por tipo");
			System.out.println("4 - filtrar por cidade");
			System.out.println("5 - Excluir cliente");
			System.out.println("6 - Sair");
			opcao = Integer.parseInt(teclado.nextLine());
			tratarOpcao(opcao, teclado);

		} while (opcao != SAIR);
	}

	private void tratarOpcao(int opcao, Scanner teclado) {

		switch (opcao) {
		case 1:
			cadastroCliente(teclado);

			break;

		case 2:
			listarCliente();

			break;

		case 3:
			filtrarTipo(teclado);

			break;

		case 4:
			filtrarCidade(teclado);

			break;

		case 5:
			excluirCLiente(teclado);

			break;

		case 6:
			System.out.println("Obrigado por utilizar nosso Programa");
			break;
		default:
			System.out.println("Opção invalida.");
			break;
		}

	}

	private void filtrarCidade(Scanner teclado) {
		System.out.println("======== FILTRAR POR CIDADE =============");
		System.out.println("Informe a cidade solicitado");
		String cidade = teclado.nextLine();
		ArrayList<Cliente> lista = controller.listarClientes();
		for (Cliente cliente : lista) {
			if (cliente.getEndereco().getCidade().equals(cidade)) {
				System.out.printf("%d - %s - %s - %s - %s - %d -%s - %s - %s - %s - %s - %s \n", cliente.getId(),
						cliente.getNome(), cliente.getEmail(), cliente.getTelefone(), cliente.getEndereco().getRua(),
						cliente.getEndereco().getNumero(), cliente.getEndereco().getComplemento(),
						cliente.getEndereco().getBairro(), cliente.getEndereco().getCidade(),
						cliente.getEndereco().getCep(), cliente.getEndereco().getEstado(), cliente.getTipo());
			}
		}
		
	}

	private void excluirCLiente(Scanner teclado) {
	
		System.out.println("----------EXCLUIR CLIENTE----------");
		System.out.println("Informe o ID do cliente");
		Integer id = Integer.parseInt(teclado.nextLine());
		ArrayList<Cliente> lista = controller.listarClientes();
	
		boolean ok = controller.excluirCliente(id, lista);
		if(ok) {
			System.out.println("Cliente excluido com sucesso");
		}else {
			System.out.println("Falha ao excluir cliente");
		}
		

	}

	private void filtrarTipo(Scanner teclado) {
		System.out.println("======== FILTRAR POR TIPO DE CLIENTE =============");
		System.out.println("Informe o tipo solicitado");
		String tipo = teclado.nextLine();
		ArrayList<Cliente> lista = controller.listarClientes();
		for (Cliente cliente : lista) {
			if (cliente.getTipo().equals(tipo)) {
				System.out.printf("%d - %s - %s - %s - %s - %d -%s - %s - %s - %s - %s - %s \n", cliente.getId(),
						cliente.getNome(), cliente.getEmail(), cliente.getTelefone(), cliente.getEndereco().getRua(),
						cliente.getEndereco().getNumero(), cliente.getEndereco().getComplemento(),
						cliente.getEndereco().getBairro(), cliente.getEndereco().getCidade(),
						cliente.getEndereco().getCep(), cliente.getEndereco().getEstado(), cliente.getTipo());
			}
		}

	}

	private void listarCliente() {
		ArrayList<Cliente> lista = controller.listarClientes();
		for (Cliente cliente : lista) {
			System.out.printf("%d - %s - %s - %s - %s - %d -%s - %s - %s - %s - %s - %s \n", cliente.getId(),
					cliente.getNome(), cliente.getEmail(), cliente.getTelefone(), cliente.getEndereco().getRua(),
					cliente.getEndereco().getNumero(), cliente.getEndereco().getComplemento(),
					cliente.getEndereco().getBairro(), cliente.getEndereco().getCidade(),
					cliente.getEndereco().getCep(), cliente.getEndereco().getEstado(), cliente.getTipo());
		}
	}

	private void cadastroCliente(Scanner teclado) {
		System.out.println("=== Cadastrar Cliente====");
		String nome;
		do {
			System.out.println("Entre com o nome do cliente");
			nome = teclado.nextLine();
		} while (!controller.isNomeValido(nome));
		System.out.println("Entre com o e-mail do cliente");
		String email = teclado.nextLine();
		System.out.println("Entre com o telefone do cliente");
		String telefone = teclado.nextLine();

		String temp;
		do {

			System.out.println("Informe o rua");
			temp = (teclado.nextLine());

		} while (!controller.isEnderecoValido(temp));
		String rua = temp;
		do {

			System.out.println("Informe o bairro");
			temp = (teclado.nextLine());

		} while (!controller.isEnderecoValido(temp));
		String bairro = temp;

		do {

			System.out.println("Informe o cidade");
			temp = (teclado.nextLine());

		} while (!controller.isEnderecoValido(temp));
		String cidade = temp;
		do {

			System.out.println("Informe o cep");
			temp = (teclado.nextLine());

		} while (!controller.isEnderecoValido(temp));
		String cep = temp;

		do {

			System.out.println("Informe o estado");
			temp = (teclado.nextLine());

		} while (!controller.isEnderecoValido(temp));
		String estado = temp;

		int numero;
		do {

			System.out.println("Informe o numero");
			numero = Integer.parseInt(teclado.nextLine());

		} while (!controller.isNumeroValido(numero));

		System.out.println("Informe o complemento");
		String complemento = teclado.nextLine();

		System.out.println("Informe o tipo (Silver, Gold, Platinum)");
		String tipo = teclado.nextLine();

		boolean ok = controller.adicionarCliente(nome, email, telefone, tipo, rua, numero, complemento, bairro, cep,
				estado, cidade);
		if (ok) {
			System.out.println("Cadastro feito com sucesso");
		} else {
			System.out.println("Não cadastrado");
		}

	}

}
