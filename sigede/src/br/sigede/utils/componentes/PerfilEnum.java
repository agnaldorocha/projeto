package br.sigede.utils.componentes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public enum PerfilEnum {

	ADMINISTRADOR("Administrador"), 
	USUARIO("Usuário");
	
	private String perfil;
	
	PerfilEnum(String perfil) {
		this.perfil = perfil;
	}
	
	public String getNome() {
		return perfil;
	}
	
	@Override
	public String toString() {
		return perfil;
	}
	
	public static final List<String> getList() {						
		List<String> lista = new ArrayList<String>();
		
		for (PerfilEnum perfil : PerfilEnum.values()) {			
			lista.add(perfil.getNome());
		}	

		return lista;
	}
	
	public static final Map<String, String> getMap() {
		Map<String, String> mapa = new HashMap<String, String>();
		
		for (PerfilEnum perfil : PerfilEnum.values()) {
			mapa.put(perfil.name(), perfil.getNome());
					
		}
		
		return new TreeMap<String, String>(mapa);
	}

}
