package com.biblioteca.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tb_autor")
@Data
public class Autor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_autor")
	private Integer idAutor;
	@Column(name="nom_autor",nullable = false,length = 200)
	private String nombreAutor;
	@Column(name="ape_autor",nullable = false,length = 200)
	private String apellidoAutor;
	
	
	@ManyToOne
	@JoinColumn(name="cod_libro")
	private Libro libro;
	
	
	
	
}