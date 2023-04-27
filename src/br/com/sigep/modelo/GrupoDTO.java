package br.com.sigep.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_grupo_03")
public class GrupoDTO {

	@Id
	@GeneratedValue
	private Integer nuGrupo;

	private String noGrupo;

	private Integer nuPermissao;
	
	@OneToMany
	private List<UsuarioDTO> listaUsuarios;

	public Integer getNuGrupo() {
		return nuGrupo;
	}

	public void setNuGrupo(Integer nuGrupo) {
		this.nuGrupo = nuGrupo;
	}

	public String getNoGrupo() {
		return noGrupo;
	}

	public void setNoGrupo(String noGrupo) {
		this.noGrupo = noGrupo;
	}

	public Integer getNuPermissao() {
		return nuPermissao;
	}

	public void setNuPermissao(Integer nuPermissao) {
		this.nuPermissao = nuPermissao;
	}

	public List<UsuarioDTO> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<UsuarioDTO> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	
}
