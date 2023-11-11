package com.biblioteca.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tb_menu")
@Data
public class Menu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_menu")
	private Integer id_menu;
	private String nombre;
	private String url;
	
	@ManyToMany
	@JoinTable(name = "tb_menu_rol",
			joinColumns = @JoinColumn(name="cod_menu",referencedColumnName ="cod_menu"),
			inverseJoinColumns = @JoinColumn(name="cod_rol",referencedColumnName = "cod_rol"))
	
	private List<Rol> listaRoles;
	
}