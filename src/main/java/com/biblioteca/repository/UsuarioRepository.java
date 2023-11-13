package com.biblioteca.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	//Metodo para poder buscar un usuario mediante el nombre de nuestro usuario
	Optional<Usuario> findByLogin(String username);
	
	//Metodo para poder verificar si el susuario existe en nuestra BD
	Boolean existeBylogin(String username);
	
}
