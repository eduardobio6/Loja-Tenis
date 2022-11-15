package com.catalogo.LojaTenis.DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;

public class UsuarioDTO {

	@NotBlank
	@Size(min = 6, max = 60)
	private String usuario;
	@NotBlank
	@Size(min = 5, max = 14)
	private String senha;
	@NotBlank
	@CPF
	private String cpf;
	
	public UsuarioDTO() {}
}
