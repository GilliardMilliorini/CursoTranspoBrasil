package br.com.cursojava;

public class ExemploOperadoresMatematicos {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 2;
		System.out.println("Soma +: ");
		System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);

		System.out.println("Subtra��o - : ");
		System.out.printf("%d - %d = %d\n", n1, n2, n1 - n2);

		System.out.println("Divis�o / Inteiros:  ");
		System.out.printf("%d / %d = %d\n", n1, n2, n1 / n2);

		System.out.println("Divis�o Real / :  ");
		System.out.printf("%d / %.2f = %f\n", n1, 3.0, n1 / 3.0);

		System.out.println("Multiplica��o x : ");
		System.out.printf("%d * %d = %d\n", n1, n2, n1 * n2);

		System.out.println("Resto % :");
		System.out.printf("%d %% %d = %d\n", n1, n2, n1 % n2);
	}

}
