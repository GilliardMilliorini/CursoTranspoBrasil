package br.com.cursojava.aula014;

import java.util.Scanner;

public class CadastroVeiculo {

	
	private static final int NOVO_VEICULO = 1;
	private static final int LISTAR_VEICULOS = 2;
	private static final int FILTRAR_MARCA = 3;
	private static final int FILTRAR_MODELO = 4;
	private static final int FILTRAR_PLACA = 5;
	private static final int FILTRAR_ANOFABRICACAO = 6;
	private static final int REMOVER = 7;
	private static final int SAIR = 8;
	private VeiculoController controller = new VeiculoController();
	public void mostrarMenu(Scanner teclado) {
		int opcao = 0;
		do{
			System.out.println("==========CADASTRO DE VEICULO==========");
			System.out.println("Selecione a op��o desejada");
			System.out.println("1 - Cadastrar um novo ve�culo ");
			System.out.println("2 - Listar todos os veiculos ");
			System.out.println("3 - Pesquisar ve�culo por marca ");
			System.out.println("4 - Pesquisar ve�culo por modelo");
			System.out.println("5 - Pesquisar ve�culo por placa");
			System.out.println("6 - Pesquisar veiculo por Ano de Fabrica��o");
			System.out.println("7 - Remover um ve�culo do sistema");
			System.out.println("8 - Sair");
			opcao = Integer.parseInt(teclado.nextLine());
			tratarOpcao (opcao, teclado);
			
			}while(opcao!= SAIR);
		}

	private void tratarOpcao(int opcao, Scanner teclado) {
		switch (opcao) {
		case NOVO_VEICULO:
			novoVeiculo(teclado);
			
		break;
		
		case LISTAR_VEICULOS:
			listarVeiculo();
		break;
		
		case FILTRAR_MARCA:
			filtrarMarca(teclado);
		break;
	
		case FILTRAR_MODELO:
			filtrarModelo(teclado);
		break;
	
		case FILTRAR_PLACA:
			filtrarPlaca(teclado);
		break;
	
		case FILTRAR_ANOFABRICACAO:
			filtrarAnoFabricacao(teclado);
				
		break;
	
		case REMOVER:
			removerVeiculo(teclado);
	
		break;
	
		case 8 :	
			System.out.println("Obrigado por utilizar o sistema");
	
		break;	
		default:
			System.out.println("Op��o invalida, por favor escolha uma das op��es definidas");
			break;
		}
		
	}

	private void novoVeiculo(Scanner teclado) {
		System.out.println("========== NOVO VEICULO==========");
		String modelo;
		do{
			System.out.println("Modelo do ve�culo:");
			modelo = teclado.nextLine();
		}while(!controller.isModeloValido(modelo));
		
		System.out.println("Marca do ve�culo");
		String marca = teclado.nextLine();
		
		System.out.println("Placa do ve�culo");
		String placa = teclado.nextLine();
			
		System.out.println("Ano de fabrica��o");
		int anoFabricacao = teclado.nextInt();
		
		System.out.println("ano de modelo do veiculo");
		int anoModelo = teclado.nextInt();
	
	boolean ok = controller.adicionarVeiculo(modelo, marca, placa, anoFabricacao, anoModelo);
	if(ok){
		System.out.println("Cadastro efetuado com sucesso!");
	} else{
		System.out.println("N�o foi possivel realizar o cadastro deste veiculo.");
	
	}

		
	}

	private void listarVeiculo() {
		
		
	}

	private void filtrarMarca(Scanner teclado) {
		// TODO Auto-generated method stub
		
	}

	private void filtrarModelo(Scanner teclado) {
		// TODO Auto-generated method stub
		
	}

	private void filtrarPlaca(Scanner teclado) {
		// TODO Auto-generated method stub
		
	}

	private void filtrarAnoFabricacao(Scanner teclado) {
		// TODO Auto-generated method stub
		
	}

	private void removerVeiculo(Scanner teclado) {
		// TODO Auto-generated method stub
		
	}		
		
	}


/* O sistema deve permitir o cadastro de um novo veiculo, a listagem de todos os
* veiculos, a pesquisa de ve�culo por marca, a pesquisa de ve�culo por modelo,
* a pesquisa de ve�culos por placa, a pesquisa e veiculo por ano de fabricacao e a remo��o de ve�culos.*/