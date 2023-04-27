package br.com.sigep.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_simulado_tb_questao_08")
public class SimuladoDTOQuestaoDTO {

	@Id
	@GeneratedValue
	private Integer SimuladoQuestao;
	
	@ManyToOne
	private QuestaoDTO questaoDTO;

	@ManyToOne
	private SimuladoDTO simuladoDTO;

	public QuestaoDTO getQuestaoDTO() {
		return questaoDTO;
	}

	public void setQuestaoDTO(QuestaoDTO questaoDTO) {
		this.questaoDTO = questaoDTO;
	}

	public SimuladoDTO getSimuladoDTO() {
		return simuladoDTO;
	}

	public void setSimuladoDTO(SimuladoDTO simuladoDTO) {
		this.simuladoDTO = simuladoDTO;
	}

	public Integer getSimuladoQuestao() {
		return SimuladoQuestao;
	}

	public void setSimuladoQuestao(Integer simuladoQuestao) {
		SimuladoQuestao = simuladoQuestao;
	}

	
}
