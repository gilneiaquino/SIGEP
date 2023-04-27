package br.com.sigep.persistencia.DAO;

import br.com.sigep.modelo.UsuarioDTO;
import br.com.sigep.persistencia.conexao.HibernateDAO;

public class UsuarioDAO {	

	public void incluir(UsuarioDTO obj) throws Exception {
    	HibernateDAO dao = HibernateDAO.getInstace();
    	dao.saveOrUpdate(obj);
	}
}
