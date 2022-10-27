package com.catalogo.LojaTenis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_categoria")
public class Categoria extends AbstractEntity{

	private static final long serialVersionUID = 1L;
	
	@Column(name = "nm_categoria", length = 50)
	private String nm_categoria;
	
	
	public Categoria() {
		
	}

	public String getNm_categoria() {
		return nm_categoria;
	}

	public void setNm_categoria(String nm_categoria) {
		this.nm_categoria = nm_categoria;
	}
	
	
	
}
