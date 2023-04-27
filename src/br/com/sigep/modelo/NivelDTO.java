package br.com.sigep.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_nivel_10")
public class NivelDTO {

	@Id
	@GeneratedValue
	private Integer nuNivel;

	private String noNivel;

	@OneToOne
	private ProvaDTO provaDTO;

	public Integer getNuNivel() {
		return nuNivel;
	}

	public void setNuNivel(Integer nuNivel) {
		this.nuNivel = nuNivel;
	}

	public String getNoNivel() {
		return noNivel;
	}

	public void setNoNivel(String noNivel) {
		this.noNivel = noNivel;
	}

	public ProvaDTO getProvaDTO() {
		return provaDTO;
	}

	public void setProvaDTO(ProvaDTO provaDTO) {
		this.provaDTO = provaDTO;
	}

	
}
