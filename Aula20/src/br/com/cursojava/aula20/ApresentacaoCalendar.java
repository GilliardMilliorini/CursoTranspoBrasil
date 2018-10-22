package br.com.cursojava.aula20;

import java.util.Calendar;

public class ApresentacaoCalendar {

	// Calendar - Utilização e exemplo
	public static void main(String[] args) {
		Calendar calendario = Calendar.getInstance(); // Classe Abstrata
		calendario.roll(Calendar.DATE, 30); // Utilizando Roll sistema recebe o valor do dia e após isso incrementa 30, segundo e exemplo.
											// Caso a data ultrapasse o limite de dias do mes(no caso 31 dias em outubro) sistema volta pro primeiro dia do mes e continua a contagem mantendo o mes instacto, alterando somente o dia.
		
		System.out.println("Imprimindo data com ROLL : " +calendario.getTime());
		
		System.out.println("");
		calendario.add(Calendar.DATE, 30);	//Utilizabo ADD sistema recebe o dia informado e adiciona 30, conforme exemplo.
											//Caso a data ultrapasse o limite de dias do mes, sistema irá pular para o proximo mes e continuar a contagem até finalizar ac contagem de 30.
		
		System.out.println("Imprimindo data com ADD : "+calendario.getTime());
		System.out.println("");
		

		int hora = calendario.get(Calendar.HOUR_OF_DAY);		// Utilizando o comando get e setando que está solicitando Hour sistema imprime a variavel "hora" e atribui o horario atual do sistema.

		if (hora >= 6 && hora <= 12) {
			System.out.println("Bom dia horario atual é " + hora +"horas");					//utilizando este IF podemos informar  que parte do dia e o horário que esta sendo informado no sistma no momento da execução do comando
		} else if (hora <= 18) {
			System.out.println("Boa tarde horario atual é " + hora+"horas");
		} else {
			System.out.println("Boa noite horario atual é " + hora+"horas\n");
		}
		System.out.println("");
		
		
		//Trazendo informações de forma separada.
		System.out.println("");
		System.out.println("trazendo informações de forma separada : \n");
		    System.out.println("Formato do calendario informado: "+calendario.getCalendarType());		// traz qual o tipo de calendario está setado o sistema
	        System.out.println("Data/Hora atual: "+calendario.getTime());								// Traz as informações completas de dia e hora
	        System.out.println("Ano: "+calendario.get(Calendar.YEAR));									// traz o ano atua
	        System.out.println("Mês: "+calendario.get(Calendar.MONTH));									//traz mes
	        System.out.println("Dia do Mês: "+calendario.get(Calendar.DAY_OF_MONTH));					// dia do mes
	        System.out.println("Hora do dia: "+calendario.get(Calendar.HOUR_OF_DAY));					// Hora
	        System.out.println("Minutos do dia: "+calendario.get(Calendar.MINUTE));						//Minuto
	        System.out.println("Segundos do dia: "+calendario.get(Calendar.SECOND));					//Segundos
	}
}

/*
 * Classe Calendar é uma classe abstrata, sendo assim não pode ser instanciada;
 * Calendar é uma versão mais atual da classe Date onde tem a mesma funcionalidade que ela mas traz alguns metodos novos;
 * pode configurar qual parte da data ou da hora que o sistema deve informar;
*/