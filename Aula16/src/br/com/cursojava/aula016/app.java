package br.com.cursojava.aula016;

public class app {
	
	public static void main(String[] args) {
		Funcionario func = new Funcionario();
		func.setCodigo("FUNC-0001");
		func.setNome("joão da silva");
		func.setSalarioBase(1000);
		
		
		Vendedor vend = new Vendedor("VEND -0001","Armed Morramed", 1000);

		vend.setPercentualVenda(0.05);						// trazendo os parametros  no ()não precisa  definir abaixo os valores
		vend.setTotalVendas(100000);
		
		
		
		FolhaPagamento folha = new FolhaPagamento();
				folha.imprimirFolha(func);
				folha.imprimirFolha(vend);
				
				Funcionario fv = new Vendedor();
				fv.setCodigo("codigo123");
				fv.setNome("nome Vendedor");
				fv.setSalarioBase(1200);
		if(fv instanceof Vendedor){					//instanceof é utilizado para permitir que FV possa utilizar as configs de Vendedor.
			((Vendedor)fv).setPercentualVenda(0.10);
			((Vendedor)fv).setTotalVendas(20000);
		}
	
		folha.imprimirFolha(fv);
	
	//	Vendedor v = new Funcionario();
	//	v.setPercentualVenda();
	
	
	
	
	}

}
