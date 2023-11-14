package com.biblioteca.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.entity.Usuario;
import com.biblioteca.repository.UsuarioRepository;

public class UsuarioServices extends ICRUDImpl<Usuario, Long>{

	@Autowired
	private UsuarioRepository repo;
	
	@Override
	public JpaRepository<Usuario, Long> getRepository() {
		
		return repo;
	}
	
}
