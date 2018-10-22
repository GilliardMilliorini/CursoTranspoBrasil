package br.com.cursojava.aula016;

public class Vendedor extends Funcionario { // extends usado pra utilizar a
											// herança da class funcionario

	private double percentualVenda;
	private double totalVendas;

	{
		System.out.println("Oi, eu sou o Goku!!!!");
	}
	
	public Vendedor() {
		super();					 // inserindo ou nao este comando o java insere ele
									// automaticamente. comando chama o construtor da classe pai
	}

	
	public Vendedor(String codigo, String nome, double salarioBase) { // isto é	 definir um contrutor com parametros.
		this();								// serve para chamar o super de cima.
		setCodigo(codigo);
		setNome(nome);
		setSalarioBase(salarioBase);
		System.out.println("primeira linha depois do super");
		System.out.println(totalVendas);
	}


	public Vendedor Vendedor() {
		return this; // não é construtor porque tem retorno.
	}

	public double getPercentualVenda() {
		return percentualVenda;
	}

	public void setPercentualVenda(double percentualVenda) {

		this.percentualVenda = percentualVenda > 1 ? percentualVenda / 100 : percentualVenda;
	}

	public double getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}

	@Override // override serve para avisar se uma mudança na linha pai afeta a
				// filho. apagando ele o sistema funciona normalmente
	public double salarioLiquido() {
		double acrescimo = 0;
		if (totalVendas >= 20000) {

			acrescimo = totalVendas * getPercentualVenda();
		}
		double salario = (getSalarioBase() + acrescimo) * (1 - 0.11);
		return salario;
	}

}
