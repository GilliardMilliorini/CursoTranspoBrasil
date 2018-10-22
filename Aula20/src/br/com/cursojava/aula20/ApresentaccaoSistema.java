package br.com.cursojava.aula20;



import java.util.Date;		// pacote de dados importados

public class ApresentaccaoSistema {
	
	// DATE - Exemplo de utilização

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
Primeira classe a ser utilizada para a função de  representar o tempo em forma de Dias, meses, anos, Horas, minutos e seg.
Atualmente  os métodos desta classe estão datada(Ultrapassada);
Utiliza os métodos e construtores do pacote Date do java.util;
Substituida pela classe Calendar, onde a mesma tem uma padronização internacionar melhorada no sistema de datas;
Por não ser uma classe abstrata pode ser instanciada.
Traz os dados configurados na forma padrão americana,  

*/