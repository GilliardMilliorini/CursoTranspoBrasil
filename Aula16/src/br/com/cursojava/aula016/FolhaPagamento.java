package br.com.cursojava.aula016;

public class FolhaPagamento {

	public void imprimirFolha(Funcionario funcionario){
		System.out.println("===========Folha de pagamento ==========");
		System.out.printf(funcionario.getClass().getSimpleName().toUpperCase());
		System.out.printf("C�digo : %s\n", funcionario.getCodigo());
		System.out.printf("Nome: %s\n", funcionario.getNome());
		System.out.printf("sAL�RIO bASE: %.2f \n", funcionario.getSalarioBase());
		System.out.printf("Sal�rio Liquido: %.2f \n", funcionario.salarioLiquido());
		System.out.println("=======================================");
		System.out.println("");
	
	}
	
	

}