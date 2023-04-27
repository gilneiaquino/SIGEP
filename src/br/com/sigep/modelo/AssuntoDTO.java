package br.com.sigep.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_assunto_06")
public class AssuntoDTO {

	@Id
	@GeneratedValue
	private Integer nuAssunto;

	private String noAssunto;

	@OneToMany
	private List<DisciplinaDTOAssuntoDTO> listaDisciplinaAssunto;

	public Integer getNuAssunto() {
		return nuAssunto;
	}

	public void setNuAssunto(Integer nuAssunto) {
		this.nuAssunto = nuAssunto;
	}

	public String getNoAssunto() {
		return noAssunto;
	}

	public void setNoAssunto(String noAssunto) {
		this.noAssunto = noAssunto;
	}

	public List<DisciplinaDTOAssuntoDTO> getListaDisciplinaAssunto() {
		return listaDisciplinaAssunto;
	}

	public void setListaDisciplinaAssunto(
			List<DisciplinaDTOAssuntoDTO> listaDisciplinaAssunto) {
		this.listaDisciplinaAssunto = listaDisciplinaAssunto;
	}

	
}
