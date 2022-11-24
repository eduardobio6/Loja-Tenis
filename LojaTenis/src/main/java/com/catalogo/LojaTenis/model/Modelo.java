package com.catalogo.LojaTenis.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import javax.persistence.Table;




@Entity
@Table(name = "tb_modelo")

public class Modelo extends AbstractEntity  {
	
	
	private static final long serialVersionUID = 1L;
	
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "nm_modelo", length = 50)
	private String modelo;
	@Column(name = "sg_cor_modelo", length = 12)
	private String corModelo;
	@Column(name = "ds_tamanho")
	private int tamanho;
	public Modelo () {
		
	}
	
	
	public String getmodelo() {
		return modelo;
	}

	public void setmodelo(String modelo) {
		this.modelo = modelo;
	}

	public String getSg_corModelo() {
		return corModelo;
	}

	public void setSg_corModelo(String corModelo) {
		this.corModelo = corModelo;
	}


	public int getTamanho() {
		return tamanho;
	}


	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}



	
	
	
}
