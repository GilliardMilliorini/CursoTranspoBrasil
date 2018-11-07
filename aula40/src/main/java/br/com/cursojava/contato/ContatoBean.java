package br.com.cursojava.contato;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class ContatoBean {
	private ContatoFacade facade = new ContatoFacade();
	private List<Contato> contatos;
	private Contato contatoAtual = facade.novoContato();
	// private Integer id;
	private String oid; // para teste
	private boolean isNovo = true;

	private String getOid() {
		return oid;
	}

	
	
//	
//	this.oid = oid;
//	if ("novo".equals(oid)) {
//		contatoAtual = facade.novoContato();
//	} else {
//		try {
//			Integer id = Integer.parseInt(oid);
//			contatoAtual = facade.carregarContato(id);
//			isNovo = false;
//		} catch (NumberFormatException ex) {
//			addMensagem("Id Invalido!", FacesMessage.SEVERITY_ERROR);
//		}
//	}
	private void setOid() {
		this.oid = oid;
		if ("novo".equals(oid)) {
			contatoAtual = facade.novoContato();
			isNovo = true;
		} else {
			try {
				Integer id = Integer.parseInt(oid);
				isNovo = false;
				contatoAtual= facade.carregarContato(id);
			} catch (NumberFormatException ex) {
				FacesContext context = FacesContext.getCurrentInstance();
				FacesMessage massage = new FacesMessage("Id Invalido");
				massage.setSeverity(FacesMessage.SEVERITY_ERROR);
				context.addMessage(null, massage);
			}
		


		}
		
	}

	public Integer getId() {
		return contatoAtual != null ? contatoAtual.getId() : null;
	}

	public void setId(Integer id) {
		if (contatoAtual != null) {
			contatoAtual.setId(id);
		}
	}

	public String getNome() {
		return contatoAtual != null ? contatoAtual.getNome() : "";
	}

	public void setNome(String nome) {
		if (contatoAtual != null) {
			contatoAtual.setNome(nome);
		}
	}

	public String getEmail() {
		return contatoAtual != null ? contatoAtual.getEmail() : "";
	}

	public void setEmail(String email) {
		if (contatoAtual != null) {
			contatoAtual.setEmail(email);
		}
	}

	public String getTelefone() {
		return contatoAtual != null ? contatoAtual.getTelefone() : "";
	}

	public void setTelefone(String telefone) {
		if (contatoAtual != null) {
			contatoAtual.setTelefone(telefone);
		}
	}

	public TipoContato getTipo() {
		return contatoAtual != null ? contatoAtual.getTipo() : null;
	}

	public void setTipo(TipoContato tipo) {
		if (contatoAtual != null) {
			contatoAtual.setTipo(tipo);
		}
	}

	public TipoContato[] getTipos() {
		return TipoContato.values();
	}

	public void salvar() {
		boolean ok = false;
		if (contatoAtual != null) {
			ok = facade.salvar(contatoAtual);
		}
		if (ok) {
			addMensagem("Contato salvo com sucesso", FacesMessage.SEVERITY_INFO);
		} else {
			addMensagem("N�o foi possivel salvar o contato", FacesMessage.SEVERITY_ERROR);
		}
	}

	public void remover() {

	}

	public void editar() {

	}

	public List<Contato> getContatos() {
		if (contatos == null || contatos.isEmpty()) {
			contatos = facade.carregarContatos();
		}
		return contatos;
	}

	private void addMensagem(String mensagem, Severity severidade) {
		FacesContext context = FacesContext.getCurrentInstance();
		FacesMessage massage = new FacesMessage(mensagem);
		massage.setSeverity(FacesMessage.SEVERITY_ERROR);
		context.addMessage(null, massage);
	}

}