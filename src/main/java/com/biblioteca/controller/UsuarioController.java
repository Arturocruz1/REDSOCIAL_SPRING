package com.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.entity.Usuario;
import com.biblioteca.servicesImpl.UsuarioServices;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	@Autowired
	private UsuarioServices servicioUsuario;
	
	@GetMapping("/lista")
	public ResponseEntity<List<Usuario>> lista(){
		return new ResponseEntity<>(servicioUsuario.listarTodos(),HttpStatus.OK);
	}
	
	@PostMapping("/registrar")
	public ResponseEntity<Usuario> registrar(@RequestBody Usuario bean){
		Usuario obj=servicioUsuario.registrar(bean);
		
		return new ResponseEntity<>(obj,HttpStatus.CREATED);
	}
	
	
	
}
