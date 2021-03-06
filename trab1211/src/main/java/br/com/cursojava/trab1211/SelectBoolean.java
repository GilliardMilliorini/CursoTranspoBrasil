package br.com.cursojava.trab1211;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class SelectBoolean {

	    private boolean valor1;  
	    private boolean valor2;
	 
	    public boolean isValue1() {
	        return valor1;
	    }
	 
	    public void setValue1(boolean value1) {
	        this.valor1 = value1;
	    }
	 
	    public boolean isValue2() {
	        return valor2;
	    }
	 
	    public void setValue2(boolean value2) {
	        this.valor2 = value2;
	    }
	     
	    public void addMessage() {
	        String summary = valor2 ? "Checked" : "Unchecked";
	        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(summary));
	    }
	}


