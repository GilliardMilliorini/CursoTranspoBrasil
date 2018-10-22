package br.com.cursojava.aula023;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemploStreamFilter {
	
	public static void main(String[] args) {
		
		List<Produto> produtos = new ArrayList<>();
		produtos.add(new Produto(1, "Produto 01", 10.0, Categoria.ALIMENTO));
		produtos.add(new Produto(2, "Produto 02", 100.0, Categoria.ELETRONICO));
		produtos.add(new Produto(3, "Produto 03", 90.0, Categoria.LIMPEZA));
		produtos.add(new Produto(4, "Produto 04", 47.90, Categoria.PERFUNARIA));
		produtos.add(new Produto(5, "Produto 05", 29.51, Categoria.VESTUARIO));
		produtos.add(new Produto(6, "Produto 06", 19.90, Categoria.ALIMENTO));
		produtos.add(new Produto(7, "Produto 07", 10.0, Categoria.ELETRONICO));
		produtos.add(new Produto(8, "Produto 08", 10.0, Categoria.LIMPEZA));
		produtos.add(new Produto(9, "Produto 09", 1.0, Categoria.PERFUNARIA));
		produtos.add(new Produto(10, "Produto 10", 89.90, Categoria.VESTUARIO));
		
		
		Stream<Produto> streamProdutos = produtos.stream();
		
		streamProdutos
		.filter((Produto produto) ->{		// traz somento os itens setados como alimento
			return Categoria.ALIMENTO.equals(produto.getCategoria());
		})
		.map(p -> p.getNome())
		.forEach(p -> System.out.println(p));
	

		List<Produto> alimentos = produtos
				.stream()
				.filter((Produto produto) ->{		// coleta os dados solicitados acima e armazena em uma list
					return Categoria.ALIMENTO.equals(produto.getCategoria());
				})
				.collect(Collectors.toList());			// collector serve para coletar os dados
		for (Produto alimento : alimentos){
			System.out.println(alimento.getNome());
		}
	
		Stream<Produto> streamProdutos1 = produtos.stream();
		
		streamProdutos1
		.filter((Produto produto) ->{	
			return Categoria.PERFUNARIA.equals(produto.getCategoria());
		})
		.map(p -> p.getNome())
		.forEach(p -> System.out.println(p));
		
		
	System.out.println("===========menos que 50 reais========================");
	
		
		List<Produto> menoresQUe50 = produtos
				.stream()
				.filter((Produto produto) ->{				//traz produtos menores quee 50
					return produto.getPreco() <= 50;
				})
				.collect(Collectors.toList());	
				for (Produto prod : menoresQUe50){
				System.out.println(prod.getNome());
			}
				
				System.out.println("=============mais que 50 reais==============");
		
				List<String> nomesProdutosMaisQue50 = produtos
						.stream()
						.filter(p -> p.getPreco() > 50)
						.map(p -> p.getNome())
						.collect(Collectors.toList());
				
				for (String nomeProdutos : nomesProdutosMaisQue50){
					System.out.println(nomeProdutos);
				}
		double total = produtos.stream().mapToDouble(p -> p.getPreco()).sum();
		System.out.printf("O valor todal dos produtos é %.2f\n  " ,total);
		OptionalDouble media = produtos.stream().mapToDouble(p -> p.getPreco()).average();
		System.out.printf("A média de preços é de %.2f \n ", media.getAsDouble());
	
		Map<Categoria,Double> map = new HashMap<>();
		Map<Categoria,Double> totalizador = produtos
				.stream()
				.filter(p ->p.getPreco() < 50)			//filtra para trazer somento os valores menores que 50
				.reduce(map,
						(current, prod) ->{
							Double value = current.get(prod.getCategoria());		// puxa os dados para realizar a operação
							if(value == null){
								value = 0.0;
							}
							value += prod.getPreco();
							current.put(prod.getCategoria(), value);	// put serve para adicionar o valor calculado para o put current.
							return current;
				}, (i,j)-> {
					return i;
				});
		for (Map.Entry<Categoria, Double> item : totalizador.entrySet()){
			System.out.printf("%s = %.2f\n",item.getKey(),item.getValue());
		}
		
		//menor preço
		System.out.println("=========PRODUTO COM MENOR PREÇO ============");
		Optional<Produto> produtoMenor = produtos
		.stream()																	// sistenma para pesquisar o menor produto em valor
		.reduce((anterior, atual)->{
			return anterior.getPreco() < atual.getPreco() ? anterior : atual;
			});
		System.out.println("O produto de menor preço é " +produtoMenor.get().getNome());
		
		}
	}
	

