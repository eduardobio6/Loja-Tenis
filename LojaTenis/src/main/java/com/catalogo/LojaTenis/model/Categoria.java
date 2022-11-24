package com.catalogo.LojaTenis.model;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_categoria")
public class Categoria extends AbstractEntity{

	private static final long serialVersionUID = 1L;

	
	@GeneratedValue(strategy = GenerationType.TABLE)
	
	@Column(name = "nm_categoria", length = 50)
	private String categoria;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Modelo> modelo;
	
	public Categoria() {
		
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	

	
	
	
	
	
}
