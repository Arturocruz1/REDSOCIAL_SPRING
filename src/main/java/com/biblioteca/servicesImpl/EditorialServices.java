package com.biblioteca.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.biblioteca.entity.Editorial;
import com.biblioteca.repository.EditorialRepository;

@Service
public class EditorialServices extends ICRUDImpl<Editorial, Integer>{
	@Autowired
	private EditorialRepository repo;
	
	@Override
	public JpaRepository<Editorial, Integer> getRepository() {
		return repo;
	}

}
