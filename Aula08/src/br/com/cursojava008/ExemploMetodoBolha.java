package br.com.cursojava008;

import java.util.Arrays;

public class ExemploMetodoBolha {

	public static void main(String[] args) {
		// exemplo metodo da bolha

int[]numero = {3,2,5,1,4};
int temp = 0;

		for(int i = 0; i < numero.length -1; i++){
			for(int j = i +1; j < numero.length; j++){
				if(numero[i] > numero[j]){
					temp = numero[i];
					numero[i] = numero[j];
					numero[j] = temp;

				}
			}
		}
		System.out.println(Arrays.toString(numero));
	}


}
