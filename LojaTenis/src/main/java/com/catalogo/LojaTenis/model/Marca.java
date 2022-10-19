package com.catalogo.LojaTenis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_marca")
public class Marca extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Column(name = "nm_marca", length = 15)
	private String nm_marca;
	
	public Marca() {
		
	}

	public String getNm_marca() {
		return nm_marca;
	}

	public void setNm_marca(String nm_marca) {
		this.nm_marca = nm_marca;
	}
	
	
}
