package br.com.cursojava.aula19;

import java.text.DateFormat;
import java.text.ParseException;


public class DateTime {
	public static void main(String[] args) {
		String data = "28/08/2010 22:25:32 "; //se tirar por ex: 21:19:50 dará java.text.ParseException
		DateFormat dataFormatada = DateFormat.getDateTimeInstance();  //HH:mm:ss
		java.util.Date recebeDataFormatada = null; 
		
		try{  // tratamento de exe
			recebeDataFormatada = dataFormatada.parse(data);  
		}catch(ParseException e) {  
		    e.printStackTrace();  //imprimi a stack trace
	
		}
		finally{
			
		}
		System.out.println(recebeDataFormatada);  
	}
}// todo methodo format  converte objeto do para texto(Stings).
//parce é de texto para objeto.