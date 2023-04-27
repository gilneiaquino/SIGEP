package br.com.sigep.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_concurso_11")
public class ConcursoDTO {

	@Id
	@GeneratedValue
	private Integer nuConcurso;

	private String noConcurso;

	private String noDescricao;

	private Date dtIniInscricao;

	private Date dtFimInscricao;

	@OneToOne
	private ProvaDTO provaDTO;

	public Integer getNuConcurso() {
		return nuConcurso;
	}

	public void setNuConcurso(Integer nuConcurso) {
		this.nuConcurso = nuConcurso;
	}

	public String getNoConcurso() {
		return noConcurso;
	}

	public void setNoConcurso(String noConcurso) {
		this.noConcurso = noConcurso;
	}

	public String getNoDescricao() {
		return noDescricao;
	}

	public void setNoDescricao(String noDescricao) {
		this.noDescricao = noDescricao;
	}

	public Date getDtIniInscricao() {
		return dtIniInscricao;
	}

	public void setDtIniInscricao(Date dtIniInscricao) {
		this.dtIniInscricao = dtIniInscricao;
	}

	public Date getDtFimInscricao() {
		return dtFimInscricao;
	}

	public void setDtFimInscricao(Date dtFimInscricao) {
		this.dtFimInscricao = dtFimInscricao;
	}

	public ProvaDTO getProvaDTO() {
		return provaDTO;
	}

	public void setProvaDTO(ProvaDTO provaDTO) {
		this.provaDTO = provaDTO;
	}

	
	
}
