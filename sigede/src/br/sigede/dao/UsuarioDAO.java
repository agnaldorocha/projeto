package br.sigede.dao;

import javax.persistence.EntityManager;

import br.sigede.model.Usuario;

public class UsuarioDAO extends DAOGenerico<Usuario> {

	public UsuarioDAO(EntityManager em, Class<Usuario> classe) {
		super(em, classe);
	}

}
