package br.sigede.controller;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class AudinFioCruzController {
	private final Result result;
	
	public AudinFioCruzController(Result result) {
		this.result = result;
	}
	
	@Get("/audin/audinfiocruz")
	public void audinfiocruz() {
	}
	
	public void audinfiocruz(String msg) {
		result.include("mensagemErro", msg);
	}
	
	@Get("/audin/cadastrar_af")
public void cadastrar_af(){
		
	}


}
