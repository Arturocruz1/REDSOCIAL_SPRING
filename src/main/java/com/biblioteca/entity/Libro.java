package com.biblioteca.entity;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tb_libro")
@Data
public class Libro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_libro")
	private Integer codigoLibro;
	@Column(name = "nom_libro", nullable = false,length = 30)
	private String nombreLibro;
	@Column(name = "fec_publi_libro", nullable = false)
	private LocalDate fechaPublicacion;

	
	
	
	@ManyToOne
	@JoinColumn(name="id_editorial")
	private Editorial idlibroEditorial;
	
	@ManyToOne
	@JoinColumn(name = "cod_genero")
	private Genero genero;
	
	
	//UNO A MUCHO LIBROS
	@JsonIgnore
	@OneToMany(mappedBy = "libro")
	private List<Autor> listaLibrosPorAutor;
	
	
	
	
}
