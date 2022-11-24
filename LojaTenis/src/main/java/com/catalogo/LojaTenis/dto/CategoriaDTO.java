package com.catalogo.LojaTenis.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class CategoriaDTO {
	
	@NotBlank
	@Size(min = 5, max = 50)
	private String categoria;
	
	public CategoriaDTO() {}


	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
}
