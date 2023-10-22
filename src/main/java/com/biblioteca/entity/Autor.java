package com.biblioteca.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_autor")
public class Autor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_autor")
	private Integer idAutor;
	@Column(name="nom_autor",nullable = false,length = 200)
	private String nombreAutor;
	@Column(name="ape_autor",nullable = false,length = 200)
	private String apellidoAutor;
	
	public Integer getIdAutor() {
		return idAutor;
	}
	public void setIdAutor(Integer idAutor) {
		this.idAutor = idAutor;
	}
	public String getNombreAutor() {
		return nombreAutor;
	}
	public void setNombreAutor(String nombreAutor) {
		this.nombreAutor = nombreAutor;
	}
	public String getApellidoAutor() {
		return apellidoAutor;
	}
	public void setApellidoAutor(String apellidoAutor) {
		this.apellidoAutor = apellidoAutor;
	}
	
}