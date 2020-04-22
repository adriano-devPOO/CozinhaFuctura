package br.com.fuctura.cozinha.control;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import br.fuctura.cozinha.DAO.ProfissionalDAO;
import br.fuctura.cozinha.model.Profissional;

@ManagedBean(name = "LoginBean")
@RequestScoped
public class LoginBean {

	private String login;
	private String senha;
	private String loginAdministrador = "Administrador";
	private String senhaAdministrador = "CozinhaFuctura2020";

	private ProfissionalDAO profissionalDAO;

	private static final String BOASVINDAS = "http://localhost:9099/CozinhaFuctura/faces/paginas/boasVindas.xhtml";
	private static final String LISTARTODOS = "http://localhost:9099/CozinhaFuctura/faces/Administrador/listarTodos.xhtml";
	private static final String CADASTRO = "http://localhost:9099/CozinhaFuctura/faces/paginas/cadastro.xhtml";

	public LoginBean() {
	}

	public LoginBean(String login, String senha, ProfissionalDAO profissionalDAO) {

		this.login = login;
		this.senha = senha;
		this.profissionalDAO = profissionalDAO;

	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void logarSistema() {

		if ((this.login.equals(loginAdministrador) && (this.senha.equals(senhaAdministrador)))){
			
			listarTodos();
		}
		
		for (Profissional listaProfissional : profissionalDAO.listarTodos()) {
			if (this.login.contains(listaProfissional.getCpf()) && this.senha.contains(listaProfissional.getSenha())) {

				try {

					FacesContext.getCurrentInstance().getExternalContext().redirect(BOASVINDAS);

				} catch (IOException e) {

					e.printStackTrace();
				}

			} else {

				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Clique em: Esqueci Senha"));

			}
		}
		
	}
	
	public void listarTodos() {
		
		try {
			
			FacesContext.getCurrentInstance().getExternalContext().redirect(LISTARTODOS);
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	public void novocadastro() {
		
		try {
			
			FacesContext.getCurrentInstance().getExternalContext().redirect(CADASTRO);
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public void limpar() {

		this.login = null;
		this.senha = null;

	}

}
