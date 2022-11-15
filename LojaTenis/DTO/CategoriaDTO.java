package com.catalogo.LojaTenis.DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class CategoriaDTO {
	@NotBlank
	private Long id;
	@NotBlank
	@Size(min = 5, max = 50)
	private String categoria;
	
	public CategoriaDTO() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
}
