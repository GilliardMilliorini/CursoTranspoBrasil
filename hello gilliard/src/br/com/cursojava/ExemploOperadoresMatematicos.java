package br.com.cursojava;

public class ExemploOperadoresMatematicos {
	public static void main(String[] args){
		int numero1 = 10;
		int numero2 = 2;
		System.out.println("Soma + ");
		System.out.printf("%d + %d = %d\n",numero1, numero2, numero1 + numero2); 
		System.out.println("Subtrair - ");
		System.out.printf("%d - %d = %d\n",numero1, numero2, numero1 - numero2);
		System.out.println("Multiplicação ");
		System.out.printf("%d * %d = %d\n",numero1, numero2, numero1 * numero2);
		System.out.println("Divisão / ");
		System.out.printf("%d / %d = %d\n",numero1, numero2, numero1 / numero2);
		System.out.println("Divisão Real / ");
		System.out.printf("%d / %.2f = %f\n",numero1, 3.0, numero1 / 3.0);
		System.out.println("Resto % ");
		System.out.printf("%d %% %d = %d\n",numero1, numero2, numero1 % numero2);		
	}

}
