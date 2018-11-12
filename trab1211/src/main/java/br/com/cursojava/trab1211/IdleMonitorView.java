package br.com.cursojava.trab1211;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class IdleMonitorView {
     
    public void onIdle() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, 
                                        "Sem atividades.", "Hora da folga, não precisa trabalhar por enquanto!!"));
    }
 
    public void onActive() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,
                                        "Bem vindo chefe", "Opa, o café estava bom pelo jeito ein (:"));
    }
}