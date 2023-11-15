package com.biblioteca.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tb_usuario")
@Data
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_usuario")
	private Integer codigo;
	@Column(name = "nom_usuario", nullable = false,length = 25)
	private String nombre;
	@Column(name = "ape_usuario", nullable = false,length = 25)
	private String apellido;
	@Column(name = "usuario", nullable = false,length = 25)
	private String usuario;
	@Column(name="contra_usuario", nullable = false,length = 50)
	private String contrasena;
	@Column(name = "sexo", nullable = false,length = 25)
	private String sexo;
	@Column(name = "fec_nac_persona", nullable = false)
	private LocalDate fechanacimiento;
	@Column(name = "tel_usuario", nullable = false)
	private int celular;
	@Column(name = "correo_usuario", nullable = false,length = 30)
	private String correoUsuario;
	@Column(name = "dni_usuario", nullable = false,length = 15)
	private String dniUsuario;
	@Column(name = "estado_usuario", nullable = false,length = 15)
	private String estado;
	@Column(name = "foto_usuario", nullable = false)
	private String foto;
	
	
		
	
}
