package com.catalogo.LojaTenis.model;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "tb_marca")
public class Marca extends AbstractEntity{


	private static final long serialVersionUID = 1L;

	@GeneratedValue(strategy = GenerationType.TABLE)
	
	@Column(name = "nm_marca", length = 15)
	private String marca;
	
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Modelo> modelo;
	
	@JoinColumn(name = "id", unique = true)
	
	@JsonProperty
	public void setModelo(List<Modelo> modelo) {
		this.modelo = modelo;
	}
	
	public Marca() {
		
	}

	public String getmarca() {
		return marca;
	}

	public void setmarca(String marca) {
		this.marca = marca;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(marca);
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
		Marca other = (Marca) obj;
		return Objects.equals(marca, other.marca);
	}
	
	
	
	
}
