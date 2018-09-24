package br.com.cursojava010;

import java.util.Arrays;
import java.util.Scanner;

public class ProvaJogoDaVelha {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int [][] tabela = {{1,2,3},{4,5,6},{7,8,9}};
		String [] usuarioX = {"X"};
		String [] usuárioO = {"o"};
		
		//System.out.println("Usuário X, escolha um número entre 1 e 9");
		//int posiçãoX =(teclado.nextInt());		
		System.out.println("Está é a sua tabela, cada jogador deve subtiruir um numero de 1 a 9 com as letras X e O");
		for(int i = 0; i < tabela.length; i++){
			System.out.println(Arrays.toString(tabela[i]));	
			
				
	/* solicitar que o usuário X e O de forma ordenada substituam os numeros da tabela por sua respectivas letras.
	 * criar variaveis de usuario e alocar os valores que cada um digita na tabela ;
	 * usar laço de repetição para que o sistema verifique se a informação e correta e repita o procsso.
	 * quandp o primeiro usuario digitar 3 vezes na tabela, sistema precisa verificar se os valores na horizontal, vertical ou diagonal 
	 * do campo digitado batem, se um deles estiver com a sequencia de 3 dados iguais o usuário vence, caso contrario o outro jogador continua 
	 * a digitar os valores;
	 * o sistema deve dverificar a cada rodada se há 3 casas em sequencia completas pelo mesmo valor;
	 * se ela estver completa em algum sentido, o jogador com o respectivo valor preenchido vence;
	 * Os campos preenchidos por um jogador nao poder ser substituidos por outro;
	 * sistema traz mensagem com o vencedor do jogo(X ou O)
	 * caso todos os campos estejam preencidos mas não hava 3 valores identicos em sequencia o sistema trará "Fim de jogo, deu velha".
			 *  
			 *  
			 *  
			 *  as explicações e logica dos assuntos eu compreendo, mas não consigo aplicar no projeto.  8 anos parado sem ver programação. 
			 */
			
			
			
			
		}
																			/*	for(int linha = 0; linha < tabela.length; linha++){
																				for(int coluna = 0; coluna < tabela.length; coluna ++){
																				tabela[linha][coluna] = 0; */
		
		
		
		
		
		
		
		teclado.close();
				
	}
}
