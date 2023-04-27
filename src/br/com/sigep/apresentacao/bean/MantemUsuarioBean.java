package br.com.sigep.apresentacao.bean;

import br.com.sigep.modelo.UsuarioDTO;
import br.com.sigep.service.mantemUsuario.MantemUsuarioService;
import br.com.sigep.service.mantemUsuario.MantemUsuarioServiceImpl;

public class MantemUsuarioBean {

    private UsuarioDTO usuario;    
	
	public void incluir() throws Exception{
		MantemUsuarioService service = new MantemUsuarioServiceImpl();
		service.incluir(getUsuario());
	}

	public UsuarioDTO getUsuario() {
		if(usuario == null){
			usuario = new UsuarioDTO();
		}
		return usuario;
	}
	public void setUsuario(UsuarioDTO usuario) {
		this.usuario = usuario;
	}
	
	public static void main(String[] args) {
		
	}
	
	
}
