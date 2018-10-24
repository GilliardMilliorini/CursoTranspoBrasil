	package br.com.cursojava;

import java.util.Scanner;

public class CadastroProduto {

	private static final int SAIR = 7;
	private static final int NOVO = 1;
	private static final int LISTAR = 2;
	private static final int FILTRAR_POR_PRECO = 3;
	private static final int FILTRAR_POR_NOME = 4;
	private static final int EDITAR = 5;
	private static final int REMOVER = 6;
	private ContatoController controller = new ContatoController();

	public void mostrarMenu(Scanner teclado) {
		int opcao = 0;
		do {
			System.out.println("MENU PRINCIPAL");
			System.out.println("1 - Cadastrar Produto");
			System.out.println("2 - Listar Produtos");
			System.out.println("3 - Listar os produtos por faixa de preco");
			System.out.println("4 - Listar os produtos por nome");
			System.out.println("5 - Editar produtos");
			System.out.println("6 - Remover produtos");
			System.out.println("7 - Sair");
			opcao = Integer.parseInt(teclado.nextLine());
			tratarOpcao(opcao, teclado);
		} while (opcao != SAIR);

	}

	private void tratarOpcao(int opcao, Scanner teclado) {
		switch (opcao) {
		case NOVO:
			novoProduto(teclado);
			break;
		case LISTAR:
			listarProduto();
			break;
			
		case FILTRAR_POR_PRECO:
			listarPorPreco(teclado);
			break;
		case FILTRAR_POR_NOME:
			listarPorNome(teclado);
			break;
		case EDITAR:
			editar(teclado);
			break;
		case REMOVER:
			remover(teclado);
			break;
		case SAIR:
			System.out.println("Obrigado por utilizarnosso sistema!");
		break;
		
		default:
			System.out.println("Opção invalida, selecione uma das opções informadas.");
			break;
		
		}

	}

	private void novoProduto(Scanner teclado) {
		
		System.out.println("======== NOVO PRODUTO =============");
		String nome;
		double preco;
		do{
			System.out.println("Nome:");
			nome = teclado.nextLine();
		}while(!controller.isNomeValido(nome));
		System.out.println("Preco");
		preco = Double.parseDouble(teclado.nextLine());
		while(!controller.isValorValido(preco));
		
		boolean ok = controller.adicionarProduto(nome, preco);
		if(ok){
			System.out.println("Contato adicionado com sucesso");
		}else{
			System.out.println("Não foi possível adicionar o contato");
		}
		
		
	}
		
		
		
	}

	private void listarProduto() {
		// TODO Auto-generated method stub
		
	}

	private void listarPorPreco(Scanner teclado) {
		// TODO Auto-generated method stub
		
	}

	private void listarPorNome(Scanner teclado) {
		// TODO Auto-generated method stub
		
	}

	private void editar(Scanner teclado) {
		// TODO Auto-generated method stub
		
	}

	private void remover(Scanner teclado) {
		// TODO Auto-generated method stub
		
	}
	
	

}
/*
 * 1 - Cadastrar produtos 2 - Listar produtos 3- Listar produtos por faixa de
 * preço 4- listar produtos por nome 5 - Editar produto 6- Remover produto
 */