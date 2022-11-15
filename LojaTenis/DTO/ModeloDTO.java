package com.catalogo.LojaTenis.DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class ModeloDTO {

	@NotBlank
	private Long id;
	@NotBlank
	@Size(min = 5, max = 50)
	private String modelo;
	@NotBlank
	@Size(min = 5, max = 12)
	private String corModelo;
	@NotBlank
	@Size(max = 2)
	private int tamanho;
	
	public ModeloDTO() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCorModelo() {
		return corModelo;
	}

	public void setCorModelo(String corModelo) {
		this.corModelo = corModelo;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	
}
