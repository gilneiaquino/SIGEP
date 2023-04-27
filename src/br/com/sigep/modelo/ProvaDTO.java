package br.com.sigep.modelo;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_prova_01")
public class ProvaDTO {

	@Id
	@GeneratedValue	
	private int nuProva;

	private int noCargo;

	private Date dtProva;
	
	@OneToOne
	private NivelDTO nivelDTO;
	
	@OneToOne
	private BancaDTO bancaDTO;
	
	@OneToMany
	private List<QuestaoDTO> listaQuestao;

	@OneToOne
	private ConcursoDTO concursoDTO;

	@OneToMany
	private List<QuestaoDTO> listaQuestoes;

	@OneToMany
	private List<DisciplinaDTO> listaDisciplinas;

	public int getNuProva() {
		return nuProva;
	}

	public void setNuProva(int nuProva) {
		this.nuProva = nuProva;
	}

	public int getNoCargo() {
		return noCargo;
	}

	public void setNoCargo(int noCargo) {
		this.noCargo = noCargo;
	}

	public Date getDtProva() {
		return dtProva;
	}

	public void setDtProva(Date dtProva) {
		this.dtProva = dtProva;
	}

	public NivelDTO getNivelDTO() {
		return nivelDTO;
	}

	public void setNivelDTO(NivelDTO nivelDTO) {
		this.nivelDTO = nivelDTO;
	}

	public BancaDTO getBancaDTO() {
		return bancaDTO;
	}

	public void setBancaDTO(BancaDTO bancaDTO) {
		this.bancaDTO = bancaDTO;
	}

	public ConcursoDTO getConcursoDTO() {
		return concursoDTO;
	}

	public void setConcursoDTO(ConcursoDTO concursoDTO) {
		this.concursoDTO = concursoDTO;
	}


	public List<QuestaoDTO> getListaQuestoes() {
		return listaQuestoes;
	}

	public void setListaQuestoes(List<QuestaoDTO> listaQuestoes) {
		this.listaQuestoes = listaQuestoes;
	}

	public List<DisciplinaDTO> getListaDisciplinas() {
		return listaDisciplinas;
	}

	public void setListaDisciplinas(List<DisciplinaDTO> listaDisciplinas) {
		this.listaDisciplinas = listaDisciplinas;
	}

	public List<QuestaoDTO> getListaQuestao() {
		return listaQuestao;
	}

	public void setListaQuestao(List<QuestaoDTO> listaQuestao) {
		this.listaQuestao = listaQuestao;
	}

	
}
