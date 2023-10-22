package com.biblioteca.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_rol")
public class Rol {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name = "cod_rol")
	private Integer codigoRol;
	@Column(name = "nom_rol", nullable = false,length = 25)
	private String nombreRol;
	@Column(name = "rutas_pagina", nullable = false,length = 200)
	private String rutas;
	
	
	public Integer getCodigoRol() {
		return codigoRol;
	}
	public void setCodigoRol(Integer codigoRol) {
		this.codigoRol = codigoRol;
	}
	public String getNombreRol() {
		return nombreRol;
	}
	public void setNombreRol(String nombreRol) {
		this.nombreRol = nombreRol;
	}
	public String getRutas() {
		return rutas;
	}
	public void setRutas(String rutas) {
		this.rutas = rutas;
	}
	
	
	
}
