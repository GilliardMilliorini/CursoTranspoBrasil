package br.com.cursojava.aula20;

import java.util.Calendar;

public class testecalendar {

	
	public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
         
        System.out.println("Formato do calendario informado: "+c.getCalendarType());
        System.out.println("Data/Hora atual: "+c.getTime());
        System.out.println("Ano: "+c.get(Calendar.YEAR));
        System.out.println("M�s: "+c.get(Calendar.MONTH));
        System.out.println("Dia do M�s: "+c.get(Calendar.DAY_OF_MONTH));
    }
}

