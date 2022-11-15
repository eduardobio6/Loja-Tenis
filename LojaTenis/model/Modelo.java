package com.catalogo.LojaTenis.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tb_modelo")

public class Modelo  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "id")
	private Long id;
	@Column(name = "nm_modelo", length = 50)
	private String modelo;
	@Column(name = "sg_corModelo", length = 12)
	private String corModelo;
	@Column(name = "ds_tamanho")
	private int tamanho;
	
	public Modelo () {
		
	}


	public String getmodelo() {
		return modelo;
	}

	public void setmodelo(String modelo) {
		this.modelo = modelo;
	}

	public String getSg_corModelo() {
		return corModelo;
	}

	public void setSg_corModelo(String corModelo) {
		this.corModelo = corModelo;
	}


	public int getTamanho() {
		return tamanho;
	}


	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(id);
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Modelo other = (Modelo) obj;
		return Objects.equals(id, other.id);
	}

	
	
	
}
