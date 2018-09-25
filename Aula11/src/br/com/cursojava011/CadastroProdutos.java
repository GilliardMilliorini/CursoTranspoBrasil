package br.com.cursojava011;

import java.util.Scanner;

public class CadastroProdutos {

	ProdutoController controller = new ProdutoController();
	
	public void mostrarMenu(Scanner teclado) {

		int opcao = 0;
		do {
			System.out.println("======================= Menu principal ==========================");
			System.out.println("1 - Cadastrar Produto");
			System.out.println("2 - Listar Produtos");
			System.out.println("3 - Soma total dos valores dos produtos");
			System.out.println("4 - Listar produtos por preço");
			System.out.println("5 - Sair");
			
			opcao = Integer.parseInt(teclado.nextLine());
			tratarOpcao(opcao, teclado);

		} while (opcao != 5);
	}

	private void tratarOpcao(int opcao, Scanner teclado){
		switch(opcao){
		case 1:
			cadastrarProduto(teclado);
			break;
		
		case 2:
			listarProdutos();
			break;
		
		case 3:
			somaTotal();
			break;
		
		case 4:
			filtrarPorPreço(teclado);
			break;
			
			
		case 5:
		System.out.println("Obrigado por usar nossos terminais.");
		break;
		
		default:
		System.out.println("Opção invalida");
		}
	}



	private void filtrarPorPreço(Scanner teclado) {
		//pedir para o usuário informar um preço minimo
		System.out.println("Informe o preço minimo do produto");
			
		//ler o preço minimo
		double precoMinimo = Double.parseDouble(teclado.nextLine());
		
		//percorrer a lista mostrando apenas os produtos com valor maior ou igual ao preço minimo
		Produto[] produtos = controller.listarProdutosPorPrecoMinimo(precoMinimo);
		if(produtos != null && produtos.length > 0){
			for( Produto atual : produtos){
				System.out.printf("%.2f - %s\n  ", atual.getPreco(), atual.getNome());
			}
		}else{
				System.out.println("Não existem produtos com o preço minimo informado");
			}
		}

	
	
	private void cadastrarProduto(Scanner teclado) {
		System.out.println("========== CADASTRAR PRODUTO ===========");
		System.out.println("Informe o nome do Produto");
		String nome = teclado.nextLine();
		System.out.println("informe o preco do Produto");
		double preco = Double.parseDouble(teclado.nextLine());
		boolean ok = controller.adicionar(nome, preco);
		if (ok){
			System.out.println("produto adicionado com sucesso");
		}else{
			System.out.println("Não foi possivel adicionar o produto");
		}
	}

	
	private void listarProdutos() {
	
		System.out.println("========== LISTAR PRODUTOS ===========");
		Produto atual = null;
		Produto[]produtos = controller.listarprodutos();
		for(int index = 0; index < produtos.length; index++){
			atual = produtos[index];
			System.out.printf("%d - %.2f - %s\n  ", index+1 , atual.getPreco(), atual.getNome());
			
		}
		
	}
	
	private void somaTotal() {
		System.out.println("============ SOMA TOTAL PRODUTOS =============");
		double soma = controller.somaProdutos();
		System.out.printf("A soma dos produtos cadastrados é %.2f \n ",soma);
	}

	
}
