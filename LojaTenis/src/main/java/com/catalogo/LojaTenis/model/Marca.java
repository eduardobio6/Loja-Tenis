package com.catalogo.LojaTenis.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "tb_marca")
public class Marca extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Column(name = "nm_marca", length = 15)
	private String nm_marca;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "id")
	private List<Modelo> modelo;
	
	@JsonProperty
	public void setModelo(List<Modelo> modelo) {
		this.modelo = modelo;
	}
	
	
	public Marca() {
		
	}

	public String getNm_marca() {
		return nm_marca;
	}

	public void setNm_marca(String nm_marca) {
		this.nm_marca = nm_marca;
	}
	
	
}
