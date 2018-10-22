package br.com.cursojava;

public class LaçoDeRepetiçãoWhile {
	public static void main(String[] args) {
		
		int numero = 10;
		
		meulabel: //Uttilizado para puxar o break para o while mais externo
		while(numero < 15){  //  Sempre executa enquanto a operação for TRUE
			while(numero <=20){
				if(numero ==13){
			//	if(numero % 2 == 0){ //  Utilizado para filtrar os numeros pares - só trará os numeros impares.
				numero++;
				break meulabel;
			}
		
			System.out.print((numero++) + ", ");
		}
		System.out.println("");
		System.out.println(numero);
		System.out.println("FIm da aplicação");
		
		
	}
	}
}
