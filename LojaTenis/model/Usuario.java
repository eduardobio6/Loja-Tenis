package com.catalogo.LojaTenis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_usuario")
public class Usuario extends AbstractEntity {

	private static final long serialVersionUID = 1L;
	@Column(name = "nm_usuario", length = 60)
	private String usuario;
	@Column(name = "sg_senha", length = 14)
	private String senha;
	@Column(name = "ds_cpf", length = 11)
	private String cpf;
	
	public Usuario () {
		
	}


	public String getusuario() {
		return usuario;
	}

	public void setNm_usuario(String usuario) {
		this.usuario = usuario;
	}

	public String getsenha() {
		return senha;
	}

	public void setsenha(String senha) {
		this.senha = senha;
	}

	public String getcpf() {
		return cpf;
	}

	public void setpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
}
