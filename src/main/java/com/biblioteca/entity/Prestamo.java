package com.biblioteca.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_prestamo")
public class Prestamo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_prestamo")
	private Integer idPrestamo;
	@Column(name="fech_prestamo",nullable = false)
	private LocalDate fechaPrestamo;
	
	public Integer getIdPrestamo() {
		return idPrestamo;
	}
	public void setIdPrestamo(Integer idPrestamo) {
		this.idPrestamo = idPrestamo;
	}
	public LocalDate getFechaPrestamo() {
		return fechaPrestamo;
	}
	public void setFechaPrestamo(LocalDate fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}
	
	

	
}
