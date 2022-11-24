package com.catalogo.LojaTenis.dto;

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

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}

