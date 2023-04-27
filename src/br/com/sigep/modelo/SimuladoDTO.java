package br.com.sigep.modelo;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_simulado_12")
public class SimuladoDTO {

	@Id
	@GeneratedValue
	private Integer nuSimulado;

	private Date dtCriacao;

	private Integer qtQuestoes;

	private String noSimulado;
	
	@ManyToOne
	private UsuarioDTO usuarioDTO;
	
	@OneToMany
	private List<SimuladoDTOQuestaoDTO> listaSimuladoQuestao;

	public Integer getNuSimulado() {
		return nuSimulado;
	}

	public void setNuSimulado(Integer nuSimulado) {
		this.nuSimulado = nuSimulado;
	}

	public Date getDtCriacao() {
		return dtCriacao;
	}

	public void setDtCriacao(Date dtCriacao) {
		this.dtCriacao = dtCriacao;
	}

	public Integer getQtQuestoes() {
		return qtQuestoes;
	}

	public void setQtQuestoes(Integer qtQuestoes) {
		this.qtQuestoes = qtQuestoes;
	}

	public String getNoSimulado() {
		return noSimulado;
	}

	public void setNoSimulado(String noSimulado) {
		this.noSimulado = noSimulado;
	}

	public UsuarioDTO getUsuarioDTO() {
		return usuarioDTO;
	}

	public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
		this.usuarioDTO = usuarioDTO;
	}

	public List<SimuladoDTOQuestaoDTO> getListaSimuladoQuestao() {
		return listaSimuladoQuestao;
	}

	public void setListaSimuladoQuestao(
			List<SimuladoDTOQuestaoDTO> listaSimuladoQuestao) {
		this.listaSimuladoQuestao = listaSimuladoQuestao;
	}
	
	

}
