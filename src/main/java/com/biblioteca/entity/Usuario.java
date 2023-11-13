package com.biblioteca.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_usuario")
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
	private LocalDate fecha_nacimiento;
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
	
	/*RELACION DE USUARIO A ROL*/
	@ManyToOne
	@JoinColumn(name="id_rol")
	private Rol rol;
	
	
	public Rol getRol() {
		return rol;
	}
	public void setRol(Rol rol) {
		this.rol = rol;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public int getCelular() {
		return celular;
	}
	public void setCelular(int celular) {
		this.celular = celular;
	}
	public String getCorreoUsuario() {
		return correoUsuario;
	}
	public void setCorreoUsuario(String correoUsuario) {
		this.correoUsuario = correoUsuario;
	}
	public String getDniUsuario() {
		return dniUsuario;
	}
	public void setDniUsuario(String dniUsuario) {
		this.dniUsuario = dniUsuario;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}

	
}
