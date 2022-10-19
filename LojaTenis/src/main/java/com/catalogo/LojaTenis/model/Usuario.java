package com.catalogo.LojaTenis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_usuario")
public class Usuario extends AbstractEntity {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "nm_usuario", length = 60)
	private String nm_usuario;
	@Column(name = "sg_senha", length = 14)
	private String sg_senha;
	@Column(name = "sg_nickUsuario", length = 11)
	private String sg_nickUsuario;

	public Usuario () {
		
	}


	public String getNm_usuario() {
		return nm_usuario;
	}

	public void setNm_usuario(String nm_usuario) {
		this.nm_usuario = nm_usuario;
	}

	public String getSg_senha() {
		return sg_senha;
	}

	public void setSg_senha(String sg_senha) {
		this.sg_senha = sg_senha;
	}

	public String getSg_nickUsuario() {
		return sg_nickUsuario;
	}

	public void setSg_nickUsuario(String sg_nickUsuario) {
		this.sg_nickUsuario = sg_nickUsuario;
	}
	
	
	
}
