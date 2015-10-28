package br.sigede.dao;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;

import br.sigede.model.Usuario;


@Component
public class DAOFactory {

	private EntityManager em;

	public DAOFactory(EntityManager em) {
		this.em = em;
	}
	
	public UsuarioDAO getUsuarioDAO() {
		return new UsuarioDAO(this.em, Usuario.class);
	}
	
}
