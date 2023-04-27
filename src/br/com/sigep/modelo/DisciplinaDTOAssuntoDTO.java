package br.com.sigep.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="tb_disciplina_tb_assunto_13")
public class DisciplinaDTOAssuntoDTO {
	
	@Id
	@GeneratedValue
	private Integer nuDisciplinaAssunto;
	
	@ManyToOne
	private DisciplinaDTO disciplinaDTO;

	@ManyToOne
	private AssuntoDTO assuntoDTO;

	public DisciplinaDTO getDisciplinaDTO() {
		return disciplinaDTO;
	}

	public void setDisciplinaDTO(DisciplinaDTO disciplinaDTO) {
		this.disciplinaDTO = disciplinaDTO;
	}

	public AssuntoDTO getAssuntoDTO() {
		return assuntoDTO;
	}

	public void setAssuntoDTO(AssuntoDTO assuntoDTO) {
		this.assuntoDTO = assuntoDTO;
	}

	public Integer getNuDisciplinaAssunto() {
		return nuDisciplinaAssunto;
	}

	public void setNuDisciplinaAssunto(Integer nuDisciplinaAssunto) {
		this.nuDisciplinaAssunto = nuDisciplinaAssunto;
	}

	
}
