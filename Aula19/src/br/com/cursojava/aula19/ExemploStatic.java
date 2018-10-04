package br.com.cursojava.aula19;

public class ExemploStatic {

	public static void main(String[] args) {
		Teste t1 = new Teste(); // intanciando a variavel de instancia
		Teste t2 = new Teste();

		System.out.println(t1.atributo);
		System.out.println(t2.atributo);
		System.out.println(t1.atributoStatic);
		System.out.println(t2.atributoStatic);
		System.out.println(Teste.atributoStatic);

		t1.atributo = 10;
		t2.atributo = 20;
		t1.atributoStatic = 50;

		System.out.println(t1.atributo);
		System.out.println(t2.atributo);
		System.out.println(t1.atributoStatic);
		System.out.println(t2.atributoStatic);
		System.out.println(Teste.atributoStatic);

		t2.atributoStatic = 100;
		System.out.println(t1.atributoStatic); // não é necessário informar a variavel de atributostati pois o Modificador Static
												// utiliza o mesmo valor para
												// toda as instancias dentro da
												// classe
		System.out.println(t2.atributoStatic);
		System.out.println(Teste.atributoStatic);

		Teste.atributoStatic = 500;							// recomendado utilizar desta forma, informando a classe e o nome do atributo.
		System.out.println(t1.atributoStatic);
		System.out.println(t2.atributoStatic);
		System.out.println(Teste.atributoStatic);

		
		
		t1.oi();
		t1.hello();
		t2.oi();
		t2.hello();
		Teste.hello();
	}

}
