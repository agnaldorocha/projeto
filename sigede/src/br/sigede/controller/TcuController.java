package br.sigede.controller;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class TcuController {
	private final Result result;
	
	public TcuController(Result result) {
		this.result = result;
	}
	
	@Get("/tcu/Tcu")
	public void Tcu() {
	}
	
	public void tcu(String msg) {
		result.include("mensagemErro", msg);
	}
	
	@Get("/tcu/cadastrartcu")
	public void cadastrartcu() {
	}
	
}
