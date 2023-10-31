package com.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.entity.Genero;
import com.biblioteca.servicesImpl.GeneroServices;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/genero")
public class GeneroController {
	@Autowired
	private GeneroServices servicioGen;
	
	@GetMapping("/lista")
	public ResponseEntity<List<Genero>> lista() {
		return new ResponseEntity<>(servicioGen.listarTodos(), HttpStatus.OK);
	}
}