package br.com.cursojava.aula20;



import java.util.Date;		// pacote de dados importados

public class ApresentaccaoSistema {
	
	// DATE - Exemplo de utiliza��o

	    public static void main(String[] args) {
	    	System.out.println("inicio do exemplo de Date");
	    	System.out.println("");
	    	Date data = new Date();// instanciando
	        System.out.println("Data atual do sistema: "+ data);// setando que o sistema informe a data atual do sistema operacional do seu computador.
	        System.out.println("");
	        System.out.println("Fm exemplo Date");
	          
	    }
	 
	}
	    
	    
	




/*
Classe Date
Primeira classe a ser utilizada para a fun��o de  representar o tempo em forma de Dias, meses, anos, Horas, minutos e seg.
Atualmente  os m�todos desta classe est�o datada(Ultrapassada);
Utiliza os m�todos e construtores do pacote Date do java.util;
Substituida pela classe Calendar, onde a mesma tem uma padroniza��o internacionar melhorada no sistema de datas;
Por n�o ser uma classe abstrata pode ser instanciada.
Traz os dados configurados na forma padr�o americana,  

*/