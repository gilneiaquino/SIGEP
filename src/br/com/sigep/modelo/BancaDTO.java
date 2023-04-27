package br.com.sigep.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_banca_09")
public class BancaDTO {

	@Id
	@GeneratedValue	
	private Integer nuBanca;

	private String noBanca;

	@OneToMany
	private List<ProvaDTO> listaProvas;

	public Integer getNuBanca() {
		return nuBanca;
	}

	public void setNuBanca(Integer nuBanca) {
		this.nuBanca = nuBanca;
	}

	public String getNoBanca() {
		return noBanca;
	}

	public void setNoBanca(String noBanca) {
		this.noBanca = noBanca;
	}

	public List<ProvaDTO> getListaProvas() {
		return listaProvas;
	}

	public void setListaProvas(List<ProvaDTO> listaProvas) {
		this.listaProvas = listaProvas;
	}
	
	

}
