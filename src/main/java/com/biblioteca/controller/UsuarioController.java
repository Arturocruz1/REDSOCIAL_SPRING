package com.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.entity.Usuario;
import com.biblioteca.servicesImpl.UsuarioServices;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	@Autowired
	private UsuarioServices servicioUsu;
	
	@GetMapping("/lista")
	public ResponseEntity<List<Usuario>> lista() {
		return new ResponseEntity<>(servicioUsu.listarTodos(), HttpStatus.OK);
	}

}
