package com.biblioteca.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.biblioteca.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	
	/*//Metodo para poder buscar un usuario mediante el nombre de nuestro usuario
	Optional<Usuario> findByLogin(String username);
	
	//Metodo para poder verificar si el susuario existe en nuestra BD
	Boolean existeBylogin(String username);*/
    //List<Usuario> findAll();

	
}
