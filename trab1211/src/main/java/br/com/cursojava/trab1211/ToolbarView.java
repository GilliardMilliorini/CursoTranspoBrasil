package br.com.cursojava.trab1211;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class ToolbarView {
     
    public void save() {
        addMessage("Parabéns!!", "Arquivo salvo com sucesso!");
    }
     
    public void update() {
        addMessage("Parabéns!!!", "Arquivo atualizado com sucesso");
    }
     
    public void delete() {
        addMessage("Parabéns!!!", "Arquivo deletado com sucesso");
    }
     
    public void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}