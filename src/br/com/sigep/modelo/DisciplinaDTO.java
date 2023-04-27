package br.com.sigep.modelo;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_disciplina_02")
public class DisciplinaDTO {

	@Id
	@GeneratedValue
	private int nuDisciplina;

	private String noDisciplina;

	@ManyToOne
	private ProvaDTO provaDTO;
	
	private ArrayList<DisciplinaDTOAssuntoDTO> listaDisciplinaAssunto;

	public int getNuDisciplina() {
		return nuDisciplina;
	}

	public void setNuDisciplina(int nuDisciplina) {
		this.nuDisciplina = nuDisciplina;
	}

	public String getNoDisciplina() {
		return noDisciplina;
	}

	public void setNoDisciplina(String noDisciplina) {
		this.noDisciplina = noDisciplina;
	}

	public ArrayList<DisciplinaDTOAssuntoDTO> getListaDisciplinaAssunto() {
		return listaDisciplinaAssunto;
	}

	public void setListaDisciplinaAssunto(
			ArrayList<DisciplinaDTOAssuntoDTO> listaDisciplinaAssunto) {
		this.listaDisciplinaAssunto = listaDisciplinaAssunto;
	}

	public ProvaDTO getProvaDTO() {
		return provaDTO;
	}

	public void setProvaDTO(ProvaDTO provaDTO) {
		this.provaDTO = provaDTO;
	}	
	
}
