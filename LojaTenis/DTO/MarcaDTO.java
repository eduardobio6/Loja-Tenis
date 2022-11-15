package com.catalogo.LojaTenis.DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class MarcaDTO {
	
	@NotBlank
	private Long id;
	@NotBlank
	@Size(min = 5, max = 15)
	private String marca;
	
	public MarcaDTO() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
}
