package br.com.cursojava;

import java.util.List;
import java.util.Scanner;

public class CadastroProdutoView {
	ProdutoController controller = new ProdutoController();

	public void mostrarMenu(Scanner teclado) {
		int opcao = 0;
		do {
			System.out.println("==========MENU de Produtos==========");
			System.out.println("1 - Cadastrar Produto");
			System.out.println("2 - Listar Produtos ");
			System.out.println("3 - Listar por Faixa Pre�o ");
			System.out.println("4 - Listar por Nome ");
			System.out.println("5 - Editar Produto ");
			System.out.println("6 - Remover Produto ");
			System.out.println("7 - Sair ");
			opcao = Integer.parseInt(teclado.nextLine());

			tratarOpcao(opcao, teclado);

		} while (opcao != 7);
	}

	private void tratarOpcao(int opcao, Scanner teclado) {
		switch (opcao) {
		case 1:
			cadastrarProduto(teclado);
			break;
		case 2:
			listarProduto(teclado);
			break;
		case 3:
			filtrarPorPreco(teclado);
			break;
		case 4:
			filtrarPorNome(teclado);
			break;
		case 5:
			editarProduto(teclado);
			break;
		case 6:
			removerProduto(teclado);
			break;
		case 7:
			System.out.println("Obrigado por usar nossos terminais!");
			break;
		default:
			System.out.println("Op��o Invalida!");
		}
	}

	private void cadastrarProduto(Scanner teclado) {
		String nome = null;
		double preco = 0;
		do {
			System.out.println("Informe o nome do produto: ");
			nome = teclado.nextLine();
		} while (!isValido(nome));
		boolean erroVazio = false;
		boolean erroMenor = false;
		do {
			try {
				do {
					System.out.println("Informe o preco do produto: ");
					preco = Double.parseDouble(teclado.nextLine());
					erroVazio = false;
				} while (!isVazioInt(preco));
			} catch (Exception e) {
				System.out.println("O campo pre�o n�o pode ser vazio.");
				erroVazio = true;
			}
		} while (erroVazio);

		boolean ok = controller.adicionar(nome, preco);
		if (ok) {
			System.out.println("Produto Cadastrado com Sucesso!");
		} else {
			System.out.println("N�o foi possivel cadastradaro Produto!");
		}
	}

	private void listarProduto(Scanner teclado) {

		Produto atual = null;
		List<Produto> produtos = controller.listarProdutos();
		if (produtos.size() > 0) {
			System.out.println("==========Lista de Produtos==========");
			System.out.println("==========ID | Nome | Pre�o");
			for (Produto produto : produtos) {
				System.out.println(produto);
			}
		} else {
			System.out.println("N�o h� produtos cadastrados nesta Lista.");
		}
	}

	private void filtrarPorPreco(Scanner teclado) {

		System.out.println("Informe o valor minimo: ");
		double minimo = Double.parseDouble(teclado.nextLine());
		System.out.println("Informe o valor maximo: ");
		double maximo = Double.parseDouble(teclado.nextLine());
		List<Produto> produtoPorPreco = controller.buscarPorPreco(minimo, maximo);
		if (produtoPorPreco.size() > 0) {
			System.out.println("==========Lista de Produtos Por Nome==========");
			for (Produto produto : produtoPorPreco) {
				System.out.println(produto);
			}
		} else {
			System.out.println("N�o tem produtos nesta faixa de pre�o.");
		}
	}

	private void filtrarPorNome(Scanner teclado) {
		String nome = null;
		System.out.println("Informe o nome do produto para a pesquisa: ");
		nome = teclado.nextLine();
		List<Produto> produtoPorNome = null;
		boolean valido = nome != null && !"".equals(nome.trim());
		if (valido) {
			produtoPorNome = controller.buscarPorNome(nome);
		} else {
			produtoPorNome = controller.listarProdutos();
		}
		System.out.println("==========Lista de Produtos Por Nome==========");
		for (Produto produto : produtoPorNome) {
			System.out.println(produto);
		}
	}

	private void editarProduto(Scanner teclado) {
		System.out.println("==========Edi��o de Produtos==========");
		int id = 0;
		boolean erroVazio = false;
		boolean erroMenor = false;
		do {
			try {
				do {
					System.out.println("Qual o ID do Produto que voc� gostaria de atualizar?");
					id = Integer.parseInt(teclado.nextLine());
				} while (!idValido(id));
				erroVazio = false;
			} catch (NumberFormatException e) {
				System.out.println("O Campo n�o pode ser vazio!");
				erroVazio = true;
			}
		} while (erroVazio);

		String nome = null;
		double preco = 0;
		do {
			System.out.println("Informe o nome do produto: ");
			nome = teclado.nextLine();
		} while (!isValido(nome));

		do {
			try {
				do {
					System.out.println("Informe o preco do produto: ");
					preco = Double.parseDouble(teclado.nextLine());
					erroVazio = false;
				} while (!isVazioInt(preco));
			} catch (Exception e) {
				System.out.println("O campo pre�o n�o pode ser vazio.");
				erroVazio = true;
			}
		} while (erroVazio);
		controller.atualizarProduto(nome, preco, id);
	}

	private void removerProduto(Scanner teclado) {
		int id = 0;
		boolean erroVazio = false;

		do {
			try {
				do {
					System.out.println("Qual o ID do Produto que voc� gostaria de remover?");
					id = Integer.parseInt(teclado.nextLine());
				} while (!idValido(id));
				erroVazio = false;
			} catch (NumberFormatException e) {
				System.out.println("O Campo n�o pode ser vazio!");
				erroVazio = true;
			}
		} while (erroVazio);

		controller.removerProduto(id);
	}

	private boolean isValido(String nome) {
		boolean valido = nome != null && !"".equals(nome.trim());
		if (!valido) {
			System.out.println("O nome n�o pode ser vazio!");
		}
		return valido;
	}

	private boolean precoValido(double preco) {
		boolean valido = preco > 0;
		if (!valido) {
			System.out.println("O pre�o deve ser maior que 0 ");
		}
		return valido;
	}

	public boolean isVazioInt(double preco) {
		boolean valido = preco >= 0;
		if (!valido) {
			System.out.println("O pre�o deve ser maior que'0'. ");
		}
		return valido;
	}

	private boolean idValido(int id) {
		return controller.idValido(id);
	}
}
