package br.sigede.controller;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class DoController {
	private final Result result;
	
	public DoController(Result result) {
		this.result = result;
	}
	
	@Get("/do/Do")
	public void Do() {
	}
	
	public void Do(String msg) {
		result.include("mensagemErro", msg);
	}

}
