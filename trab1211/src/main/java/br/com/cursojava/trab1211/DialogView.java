package br.com.cursojava.trab1211;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.event.CloseEvent;
import org.primefaces.event.MoveEvent;

@ManagedBean
public class DialogView {
     
    public void handleClose(CloseEvent event) {
        addMessage(event.getComponent().getId() + " encerrado", "Ent�o, voc� � da paz?");
    }
     
    public void handleMove(MoveEvent event) {
        addMessage(event.getComponent().getId() + " moved", "Left: " + event.getLeft() + ", Top: " + event.getTop());
    }
     
    public void destroyWorld() {
        addMessage(" Error", "Por favor, tente novamente mais tarde.");
    }
     
    public void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}