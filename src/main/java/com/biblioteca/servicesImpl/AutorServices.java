package com.biblioteca.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.biblioteca.entity.Autor;
import com.biblioteca.repository.AutorRepository;

@Service
public class AutorServices extends ICRUDImpl<Autor, Integer>{
	@Autowired
	private AutorRepository repo;

	@Override
	public JpaRepository<Autor, Integer> getRepository() {
		return repo;

	}
}
