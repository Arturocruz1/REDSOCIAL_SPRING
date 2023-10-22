package com.biblioteca.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_libro")
public class Libro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_libro")
	private Integer codigoLibro;
	@Column(name = "nom_libro", nullable = false,length = 30)
	private String nombreLibro;
	@Column(name = "fec_publi_libro", nullable = false)
	private LocalDate fechaPublicacion;
	
	public Integer getCodigoLibro() {
		return codigoLibro;
	}
	public void setCodigoLibro(Integer codigoLibro) {
		this.codigoLibro = codigoLibro;
	}
	public String getNombreLibro() {
		return nombreLibro;
	}
	public void setNombreLibro(String nombreLibro) {
		this.nombreLibro = nombreLibro;
	}
	public LocalDate getFechaPublicacion() {
		return fechaPublicacion;
	}
	public void setFechaPublicacion(LocalDate fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}
	
	
}
