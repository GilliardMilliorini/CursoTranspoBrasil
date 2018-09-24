package br.com.cursojava011;

import java.util.Scanner;

public class CadastroProdutos {

	private Produto[] produtos = new Produto[50];
	private int quantidade = 0;

	public void mostrarMenu(Scanner teclado) {

		int opcao = 0;
		do {
			System.out.println("======================= Menu principal ==========================");
			System.out.println("1 - Cadastrar Produto");
			System.out.println("2 - Listar Produtos");
			//System.out.println("3 - Sair");
			opcao = Integer.parseInt(teclado.nextLine());
			tratarOpcao(opcao, teclado);

		} while (opcao != 3);
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
		System.out.println("Obrigado por usar nossos terminais.");
		break;
		default:
		System.out.println("Opção invalida");
		}
	}

	private void cadastrarProduto(Scanner teclado) {
		System.out.println("========== CADASTRAR PRODUTO ===========");
		System.out.println("Informe o nome do Produto");
		String nome = teclado.nextLine();
		System.out.println("informe o preco do Produto");
		double preco = Double.parseDouble(teclado.nextLine());
		Produto produto = new Produto();
		produto.setNome(nome);
		produto.setPreco(preco);
		if( quantidade < produtos.length){
			produtos[quantidade++] = produto;
		}else{
			System.out.println("Quantidade máxima do produto já cadastrada");
		}
		

	}

	private void listarProdutos() {
	
		System.out.println("========== LISTAR PRODUTOS ===========");
		Produto atual = null;
		for(int index = 0; index < quantidade; index++){
			atual = produtos[index]
;
			System.out.printf("%d - %.2f - %s\n  ", index+1 , atual.getPreco(), atual.getNome());
			
		}
		
	}
	
	
}
