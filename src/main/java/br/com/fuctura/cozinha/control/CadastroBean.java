package br.com.fuctura.cozinha.control;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.fuctura.cozinha.DAO.ImplementeProfissionalDAO;
import br.fuctura.cozinha.DAO.ProfissionalDAO;
import br.fuctura.cozinha.model.Profissional;
import br.fuctura.cozinha.util.JpaUtil;

@ManagedBean(name = "CadastroBean")
@SessionScoped
public class CadastroBean {

	private Profissional profissional;
	//private Receitas receitas;
	//private List<Profissional> listaProfissional;
	private ImplementeProfissionalDAO implementeProfissionalDAO;
	
	//private static final String CADASTRORECEITA = "http://localhost:9099/CozinhaFuctura/faces/paginas/cadastroReceitas.xhtml";
	//private static final String ATUALIZARCADASTRO = "http://localhost:9099/CozinhaFuctura/faces/paginas/cadastro.xhtml";

	public CadastroBean() {
	}

	public CadastroBean(Profissional profissional) {

		this.profissional = new Profissional();
		
		this.implementeProfissionalDAO = new ProfissionalDAO(JpaUtil.getEntityManager());
		
		//this.listaProfissional = implementeProfissionalDAO.listarTodos();
		
		//System.out.println(this.listaProfissional);

	}

	public void salvar() {

//		if (!listarProfissional(profissional)) {
//
//			if (profissional.getIdade() < 18) {
//
//				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Menor de idade"));
//
//			} else {

				this.implementeProfissionalDAO.inserir(this.profissional);
			//	cadastrarReceitas();

//			}
//		}

	}

//	public boolean listarProfissional(Profissional profissional) {
//
//		boolean retorno = false;
//
//		for (Profissional profissional2 : listaProfissional) {
//			if (profissional2.getCpf().equals(profissional.getCpf())) {
//				retorno = true;
//			}
//		}
//
//		return retorno;
//	}
//
//	public void editar(Profissional profissional) {
//
//		this.implementeProfissionalDAO.alterar(profissional);
//		atualizarCadastro();
//		
//
//	}
//	
//	public void atualizarCadastro() {
//		
//		try {
//
//			FacesContext.getCurrentInstance().getExternalContext().redirect(ATUALIZARCADASTRO);
//
//		} catch (IOException e) {
//
//			e.printStackTrace();
//		}
//		
//	}
//	
//
//	public void remover(Profissional profissional) {
//
//		this.implementeProfissionalDAO.remover(profissional);
//
//	}
//
//	public void cadastrarReceitas() {
//
//		try {
//
//			FacesContext.getCurrentInstance().getExternalContext().redirect(CADASTRORECEITA);
//
//		} catch (IOException e) {
//
//			e.printStackTrace();
//		}
//
//	}
//	
//	public void pesquisar() {
//
//		this.listaProfissional = this.implementeProfissionalDAO.listarTodos();
//
//	}
//	
	public Profissional getProfissional() {
		return profissional;
	}

	public void setProfissional(Profissional profissional) {
		this.profissional = profissional;
	}

//	public ImplementeProfissionalDAO getImplementeProfissionalDAO() {
//		return implementeProfissionalDAO;
//	}
//
//	public void setImplementeProfissionalDAO(ImplementeProfissionalDAO implementeProfissionalDAO) {
//		this.implementeProfissionalDAO = implementeProfissionalDAO;
//	}
//
//	public List<Profissional> getListaProfissional() {
//		return listaProfissional;
//	}
//
//	public void setListarProfissional(List<Profissional> listaProfissional) {
//		this.listaProfissional = listaProfissional;
//	}

}
