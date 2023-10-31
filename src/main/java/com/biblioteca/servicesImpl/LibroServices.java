package com.biblioteca.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.biblioteca.entity.Libro;
import com.biblioteca.repository.LibroRepository;

@Service
public class LibroServices extends ICRUDImpl<Libro, Integer> {
	@Autowired
	private LibroRepository repo;
	
	@Override
	public JpaRepository<Libro, Integer> getRepository() {
		return repo;
	}
}