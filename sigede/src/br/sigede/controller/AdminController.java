package br.sigede.controller;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.sigede.dao.DAOFactory;
import br.sigede.model.Usuario;
import br.sigede.utils.componentes.UserSession;

@Resource
public class AdminController {
	private final Result result;
	private final DAOFactory daoFactory;
	private final UserSession userSession;
	
	public AdminController(Result result, DAOFactory daoFactory, UserSession userSession) {
		this.result = result;
		this.daoFactory = daoFactory;
		this.userSession = userSession;
	}

	//metodos de chamadas de página
	@Get @Path("/admin/suporte")
	public void suporteCrud(){
		result.include("usuarioList", daoFactory.getUsuarioDAO().list());
		//result.include("generoList", daoFactory.getGeneroDAO().list());
		//result.include("editoraList", daoFactory.getEditoraDAO().list());
	}
	
	@Get @Path("/admin/suporte/{usuarioId}/update")
	public void formSuporte(Long usuarioId){
		result.include("usuario", daoFactory.getUsuarioDAO().get(usuarioId));
		//result.include("generoList", daoFactory.getGeneroDAO().list());
		//result.include("editoraList", daoFactory.getEditoraDAO().list());
	}
	//@Get @Path("/admin/generos/{generoId}/update")
	//public void formGenero(Long generoId){
		//result.include("genero", daoFactory.getGeneroDAO().get(generoId));
	//}
	
	//@Get @Path("/admin/editoras/{editoraId}/update")
	//public void formEditora(Long editoraId){
		//result.include("editora", daoFactory.getEditoraDAO().get(editoraId));
	//}
	
	@Get @Path("/admin/suporte/{usuarioId}/delete")
	public void suporteCrud(Long usuarioId){
		
	}
	
	//metodos CRUD
	@Post @Path("/suporte")
	public void add(Usuario usuario) {
		daoFactory.getUsuarioDAO().add(usuario);
		result.redirectTo(this).suporteCrud();
	}
	
	@Put @Path("/suporte/{usuario.id}")
	public void update(Usuario usuario) {
		daoFactory.getUsuarioDAO().update(usuario);
		result.redirectTo(this).suporteCrud();
	}
	
	//@Post @Path("/generos")
	//public void add(Genero genero) {
		//daoFactory.getGeneroDAO().add(genero);
		//result.redirectTo(this).livrosCrud();
	//}
	
	//@Put @Path("/generos/{genero.id}")
	//public void update(Genero genero) {
		//daoFactory.getGeneroDAO().update(genero);
		//result.redirectTo(this).livrosCrud();
	//}
	
	//@Post @Path("/editoras")
	//public void add(Editora editora) {
		//daoFactory.getEditoraDAO().add(editora);
		//result.redirectTo(this).livrosCrud();
	//}
	
	//@Put @Path("/editoras/{editora.id}")
	//public void update(Editora editora) {
		//daoFactory.getEditoraDAO().update(editora);
		//result.redirectTo(this).livrosCrud();
	//}
}
