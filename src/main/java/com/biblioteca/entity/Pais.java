package com.biblioteca.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pais")
public class Pais {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_pais")
	private Integer codigoPais;
	@Column(name = "nom_pais", nullable = false,length = 25)
	private String nombrePais;
	
	public Integer getCodigoPais() {
		return codigoPais;
	}
	public void setCodigoPais(Integer codigoPais) {
		this.codigoPais = codigoPais;
	}
	public String getNombrePais() {
		return nombrePais;
	}
	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}

}
