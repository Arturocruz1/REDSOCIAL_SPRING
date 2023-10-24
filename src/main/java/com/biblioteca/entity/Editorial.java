package com.biblioteca.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tb_editorial")
@Data
public class Editorial {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_editorial")
	private Integer idEditorial;
	@Column(name="nom_editorial",nullable = false,length = 50)
	private String nombreEditorial;
	
	
	/*ONE TOMANY*/
	@OneToMany(mappedBy = "idlibroEditorial")
	private List<Libro> listalibroporeditorial;
	
	
	

}