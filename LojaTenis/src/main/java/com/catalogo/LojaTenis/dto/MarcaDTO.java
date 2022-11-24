package com.catalogo.LojaTenis.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class MarcaDTO {
	
	
	@NotBlank
	@Size(min = 5, max = 15)
	private String marca;
	
	public MarcaDTO() {}


	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
}
