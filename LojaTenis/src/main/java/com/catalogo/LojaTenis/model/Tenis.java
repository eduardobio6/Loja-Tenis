package com.catalogo.LojaTenis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_tenis")
public class Tenis extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Column(name = "id_tamanhoTenis")
	private int id_tamanhoTenis;
	
	public Tenis () {
		
	}
	
	@ManyToOne
	private Modelo modelo;
	
	@ManyToOne
	private Categoria categoria;

	public int getId_tamanhoTenis() {
		return id_tamanhoTenis;
	}

	public void setId_tamanhoTenis(int id_tamanhoTenis) {
		this.id_tamanhoTenis = id_tamanhoTenis;
	}
	
	
}
