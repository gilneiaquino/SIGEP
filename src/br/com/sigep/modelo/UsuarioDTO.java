package br.com.sigep.modelo;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_usuario_07")
public class UsuarioDTO {
	
	@Id
	@GeneratedValue		
	private Integer nuUsuario;

	private String noLogin;

	private Integer nuSenha;

	private String noEmail;

	private Date dtNascimento;

	@ManyToOne
	private GrupoDTO grupoDTO;

	@OneToMany
	private List<SimuladoDTO> listaSimulados;

	public Integer getNuUsuario() {
		return nuUsuario;
	}

	public void setNuUsuario(Integer nuUsuario) {
		this.nuUsuario = nuUsuario;
	}

	public String getNoLogin() {
		return noLogin;
	}

	public void setNoLogin(String noLogin) {
		this.noLogin = noLogin;
	}

	public Integer getNuSenha() {
		return nuSenha;
	}

	public void setNuSenha(Integer nuSenha) {
		this.nuSenha = nuSenha;
	}

	public String getNoEmail() {
		return noEmail;
	}

	public void setNoEmail(String noEmail) {
		this.noEmail = noEmail;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public GrupoDTO getGrupoDTO() {
		return grupoDTO;
	}

	public void setGrupoDTO(GrupoDTO grupoDTO) {
		this.grupoDTO = grupoDTO;
	}

	public List<SimuladoDTO> getListaSimulados() {
		return listaSimulados;
	}

	public void setListaSimulados(List<SimuladoDTO> listaSimulados) {
		this.listaSimulados = listaSimulados;
	}


	
}
