package br.com.cursojava;

public class OperadoresCompostos {

	public static void main(String[] args) {
		
		/*
		 * OPERADORES COMPOSTOS
		 * 	+=
		 * 	-=
		 *	*=
		 * 	/=
		 * 	%=
		 */
		
		System.out.println("=====(+=)=====");
		int num = 10;
		int num2 = 5;
		num += num2;  //  num = num + num2
	System.out.println(num);
	
	System.out.println("=====(-=)=====");
	num -= num2; // num = num - num2
	System.out.println(num);
	
	System.out.println("=====(*=)=====");
	num*= num2; // num * num2
	System.out.println(num);
	
	System.out.println("=====(/=)=====");
	num /= num2; // num = num/2
	System.out.println(num);
	
	System.out.println("=====(%=)=====");
	num %= num2; // num = num % num2
	System.out.println(num);
	 
	
	//-------
	
	int n1 = 10; // exemplo
	n1*= 2 + 8;  //  n1 = n1 * (2 + 8) ------ nesses casos tudo que está a direita do operador e calculado primeiro.
	System.out.println(n1);
	}
	
}
