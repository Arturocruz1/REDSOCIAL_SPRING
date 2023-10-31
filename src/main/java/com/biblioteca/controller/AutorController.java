package com.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.entity.Autor;
import com.biblioteca.servicesImpl.AutorServices;
import com.biblioteca.utils.NotFoundException;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/autor")
public class AutorController {
	@Autowired
	private AutorServices servicioAut;
	
	@GetMapping("/lista")
	public ResponseEntity<List<Autor>> lista() {
		return new ResponseEntity<>(servicioAut.listarTodos(), HttpStatus.OK);
	}

	@PostMapping("/registrar")
	public ResponseEntity<Autor> registrar(@RequestBody Autor bean) {
		Autor obj = servicioAut.registrar(bean);
		
		return new ResponseEntity<>(obj, HttpStatus.CREATED);
	}
	
	@PutMapping("/actualizar")
	public ResponseEntity<Autor> actualizar(@RequestBody Autor bean) {
		Autor aut = servicioAut.buscarPorID(bean.getIdAutor());
		if (aut == null)
			throw new NotFoundException();
		else
			aut = servicioAut.actualizar(bean);
		
		return new ResponseEntity<>(aut, HttpStatus.OK);
	}
	
	@DeleteMapping("/eliminar/{codigo}")
	public ResponseEntity<Void> eliminar(@PathVariable("codigo") Integer cod) {
		Autor aut = servicioAut.buscarPorID(cod);
		if (aut == null)
			throw new NotFoundException();
		else
			servicioAut.eliminarPorID(cod);
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	

	@GetMapping("/buscar/{cod}")
	public ResponseEntity<Autor> buscar(@PathVariable("cod") Integer codi) {
		Autor aut = servicioAut.buscarPorID(codi);
		if (aut == null)
			throw new NotFoundException();
		else
			aut = servicioAut.buscarPorID(codi);
		
		return new ResponseEntity<>(aut, HttpStatus.OK);
	}
}
