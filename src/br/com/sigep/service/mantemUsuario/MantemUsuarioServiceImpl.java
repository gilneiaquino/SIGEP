package br.com.sigep.service.mantemUsuario;

import br.com.sigep.modelo.UsuarioDTO;
import br.com.sigep.persistencia.DAO.UsuarioDAO;

public class MantemUsuarioServiceImpl implements MantemUsuarioService {

	public void incluir(UsuarioDTO usuarioDTO) throws Exception{
		UsuarioDAO dao = new UsuarioDAO();
		dao.incluir(usuarioDTO);		
	}
}
