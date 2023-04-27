package br.com.sigep.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_questao_04")
public class QuestaoDTO {

	@Id
	@GeneratedValue	
	private Integer nuQuestao;

	private String noDescricao;

	@ManyToOne
	private ProvaDTO provaDTO;
	
	@OneToMany
	private List<RespostaDTO> listaRespostas;
	
	@OneToMany
	private List<SimuladoDTOQuestaoDTO> listaSimuladoQuestao;

	public Integer getNuQuestao() {
		return nuQuestao;
	}

	public void setNuQuestao(Integer nuQuestao) {
		this.nuQuestao = nuQuestao;
	}

	public String getNoDescricao() {
		return noDescricao;
	}

	public void setNoDescricao(String noDescricao) {
		this.noDescricao = noDescricao;
	}

	public ProvaDTO getProvaDTO() {
		return provaDTO;
	}

	public void setProvaDTO(ProvaDTO provaDTO) {
		this.provaDTO = provaDTO;
	}

	public List<RespostaDTO> getListaRespostas() {
		return listaRespostas;
	}

	public void setListaRespostas(List<RespostaDTO> listaRespostas) {
		this.listaRespostas = listaRespostas;
	}

	public List<SimuladoDTOQuestaoDTO> getListaSimuladoQuestao() {
		return listaSimuladoQuestao;
	}

	public void setListaSimuladoQuestao(
			List<SimuladoDTOQuestaoDTO> listaSimuladoQuestao) {
		this.listaSimuladoQuestao = listaSimuladoQuestao;
	}



}
