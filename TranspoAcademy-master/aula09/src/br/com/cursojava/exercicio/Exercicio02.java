package br.com.cursojava.exercicio;


public class Exercicio02 {

	public static void main(String[] args) {
////		2) Data a tabe�a abaixo:
//		meias	camisas	camisetas
//		Jan	100	200	150	
//		Fev	75	26	100
//		Mar	150	200	250
//		Abr	50	210	240
//
//		Calcule as seguintes opera��es:
//		a) A quantidade de pe�as vendidas
//		b) A quantidade de meias vendidas
//		c) A quantidade de pe�as vendidas m�s a m�s
//		d) A quantidade de camisas + a quantidade de camisetas vendidas m�s a m�s
//		e) O tipo de pe�a mais vendida em cada m�s.

		int[][] tabelaPreco = { { 100, 200, 150 }, { 75, 260, 100 }, { 150, 200, 250 }, { 50, 210, 240 } };

		// a) A quantidade de pe�as vendidas
		System.out.println("a) A quantidade de pe�as vendidas");
		int somaTotal = 0;
		for (int mes = 0; mes < tabelaPreco.length; mes++) {
			for (int produto = 0; produto < tabelaPreco[mes].length; produto++) {
				somaTotal += tabelaPreco[mes][produto];
			}
		}
		System.out.println("Total de pe�as vendidas: " + somaTotal);

		// A quantidade de meias vendidas
		System.out.println("b) A quantidade de meias vendidas");
		int somaMeias = 0;
		for (int mes = 0; mes <= tabelaPreco[0].length; mes++) {
			somaMeias += tabelaPreco[mes][0];
		}
		System.out.println("Total de meias vendidas: " + somaMeias);

		// c) A quantidade de pe�as vendidas m�s a m�s
		System.out.println("c) A quantidade de pe�as mes");
		for (int mes = 0; mes < tabelaPreco.length; mes++) {
			int somaMes = 0;
			int soma = 0;
			for (int produto = 0; produto < tabelaPreco[mes].length; produto++) {
				soma += tabelaPreco[mes][produto];
			}
			somaMes += soma;
			System.out.println("Total de pe�as mes: " + somaMes);
		}

		// d) A quantidade de camisas e camisetas mes a mes

		System.out.println("d) A quantidade de camisas +Camisetas mes/mes");
		for (int i = 0; i < tabelaPreco.length; i++) {
			int somaCamisas = 0;
			for (int produto = 0; produto < tabelaPreco[i].length; produto++) {
				if (produto != 0) {
					somaCamisas += tabelaPreco[i][produto];
				}
			}
			System.out.println("A soma das camisas + camisetas no mes: " + somaCamisas);
		}

		// e) O tipo de pe�a mais vendida de cada mes
		System.out.println("e) A pe�a mais vendida do mes");
		for (int mes = 0; mes < tabelaPreco.length; mes++) {
			int maisVendida = 0;
			int index = 0;
			for (int produto = 0; produto < tabelaPreco[mes].length; produto++) {
				if (maisVendida < tabelaPreco[mes][produto]) {
					maisVendida = tabelaPreco[mes][produto];
					index = produto;
				}
			}
			System.out.println("O produto mais vendido do mes foi: " + index + " qtdd de pe�as: " + maisVendida);

		}

	}

}
