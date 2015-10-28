package br.sigede.utils.componentes;

import java.io.Serializable;

import br.sigede.model.Usuario;
import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.SessionScoped;

@Component
@SessionScoped
public class UserSession implements Serializable {
	private static final long serialVersionUID = 1L;

	private Usuario usuario; //SALVA O USUARIO DA SESSAO
	
	public boolean isLogged() {
		return usuario != null;
	}

	public void logout() {
		usuario = null;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "UserSession [usuario.id=" + usuario + "]";
	}
}

