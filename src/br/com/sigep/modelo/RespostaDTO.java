package br.com.sigep.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_resposta_05")
public class RespostaDTO {

	@Id
	@GeneratedValue
	private Integer nuResposta;

	private char icStatus;

	private String noDescricao;

	@ManyToOne
	private QuestaoDTO questaoDTO;

	public Integer getNuResposta() {
		return nuResposta;
	}

	public void setNuResposta(Integer nuResposta) {
		this.nuResposta = nuResposta;
	}

	public char getIcStatus() {
		return icStatus;
	}

	public void setIcStatus(char icStatus) {
		this.icStatus = icStatus;
	}

	public String getNoDescricao() {
		return noDescricao;
	}

	public void setNoDescricao(String noDescricao) {
		this.noDescricao = noDescricao;
	}

	public QuestaoDTO getQuestaoDTO() {
		return questaoDTO;
	}

	public void setQuestaoDTO(QuestaoDTO questaoDTO) {
		this.questaoDTO = questaoDTO;
	}
	
	

}
