package com.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.entity.Rol;
import com.biblioteca.servicesImpl.RolServices;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/rol")
public class RolController {
	@Autowired
	private RolServices servicioRol;
	
	@GetMapping("/lista")
	public ResponseEntity<List<Rol>> lista(){
		return new ResponseEntity<>(servicioRol.listarTodos(),HttpStatus.OK);
	}
}
