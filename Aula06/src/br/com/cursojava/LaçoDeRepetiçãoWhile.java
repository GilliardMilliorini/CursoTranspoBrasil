package br.com.cursojava;

public class La�oDeRepeti��oWhile {
	public static void main(String[] args) {
		
		int numero = 10;
		
		meulabel: //Uttilizado para puxar o break para o while mais externo
		while(numero < 15){  //  Sempre executa enquanto a opera��o for TRUE
			while(numero <=20){
				if(numero ==13){
			//	if(numero % 2 == 0){ //  Utilizado para filtrar os numeros pares - s� trar� os numeros impares.
				numero++;
				break meulabel;
			}
		
			System.out.print((numero++) + ", ");
		}
		System.out.println("");
		System.out.println(numero);
		System.out.println("FIm da aplica��o");
		
		
	}
	}
}
