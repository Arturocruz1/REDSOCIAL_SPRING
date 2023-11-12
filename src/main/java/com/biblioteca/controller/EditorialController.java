package com.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.entity.Editorial;
import com.biblioteca.servicesImpl.EditorialServices;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/editorial")
public class EditorialController {
	@Autowired
	private EditorialServices servicioEdi;
	
	@GetMapping("/lista")
	public ResponseEntity<List<Editorial>> lista() {
		return new ResponseEntity<>(servicioEdi.listarTodos(), HttpStatus.OK);
	}
	
}
