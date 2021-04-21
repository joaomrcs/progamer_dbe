package br.com.fiap.beans;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import br.com.fiap.dao.UsuarioDAO;
import br.com.fiap.model.Usuario;

@Named
@RequestScoped
public class UsuarioBean {

	private Usuario usuario = new Usuario();

	public void save() {
		new UsuarioDAO().save(this.usuario);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Usuario cadastrado com sucesso"));
		System.out.println(this.usuario);
	}

	public List<Usuario> getUsuarios() {
		return new UsuarioDAO().getAll();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}