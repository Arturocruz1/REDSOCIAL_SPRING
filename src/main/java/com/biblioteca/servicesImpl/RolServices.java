package com.biblioteca.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.biblioteca.entity.Rol;
import com.biblioteca.repository.RolRepository;

@Service
public class RolServices extends ICRUDImpl<Rol, Integer>{

	@Autowired
	private RolRepository repo;
	
	
	@Override
	public JpaRepository<Rol, Integer> getRepository() {
		// TODO Auto-generated method stub
		return repo;
	}

}
