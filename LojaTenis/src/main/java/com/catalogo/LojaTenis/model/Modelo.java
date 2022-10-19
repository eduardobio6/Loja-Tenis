package com.catalogo.LojaTenis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_modelo")
public class Modelo extends AbstractEntity {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "nm_modelo", length = 50)
	private String nm_mondelo;
	@Column(name = "sg_corModelo", length = 12)
	private String sg_corModelo;
	
	public Modelo () {
		
	}


	public String getNm_mondelo() {
		return nm_mondelo;
	}

	public void setNm_mondelo(String nm_mondelo) {
		this.nm_mondelo = nm_mondelo;
	}

	public String getSg_corModelo() {
		return sg_corModelo;
	}

	public void setSg_corModelo(String sg_corModelo) {
		this.sg_corModelo = sg_corModelo;
	}
	
	
	
}
