package br.com.cursojava.aula016;

public class Funcionario {

	private String codigo;
	private String nome;
	private double salarioBase;
	
	public Funcionario(){
		super();				// super na classe pai chama a classe object. Inserindo ou nao ele sempre trará por padrao  a classe Object
	}
	
	public Funcionario(String codigo, String nome, double salarioBase) { // isto é	 definir um contrutor com parametros.
		super();								// serve para chamar o super de cima.
		setCodigo(codigo);
		setNome(nome);
		setSalarioBase(salarioBase);
		
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double salarioLiquido(){
		double salario =  getSalarioBase() - (getSalarioBase() * 0.11);  // este 0.11 é a comissão que o funcionario ganhará
						// prof passou exemplo de getSalarioBase() * (1-0.11);
		return salario;
	}
}

