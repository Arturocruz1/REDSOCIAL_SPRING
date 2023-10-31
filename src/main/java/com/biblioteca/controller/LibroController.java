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

import com.biblioteca.entity.Libro;
import com.biblioteca.servicesImpl.LibroServices;
import com.biblioteca.utils.NotFoundException;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/libro")
public class LibroController {
	@Autowired
	private LibroServices servicioLib;
	
	@PostMapping("/registrar")
	public ResponseEntity<Libro> registrar(@RequestBody Libro bean) {
		Libro obj = servicioLib.registrar(bean);
		
		return new ResponseEntity<>(obj, HttpStatus.CREATED);
	}
	
	@PutMapping("/actualizar")
	public ResponseEntity<Libro> actualizar(@RequestBody Libro bean) {
		Libro lib = servicioLib.buscarPorID(bean.getCodigoLibro());
		if (lib == null)
			throw new NotFoundException();
		else
			lib = servicioLib.actualizar(bean);
		
		return new ResponseEntity<>(lib, HttpStatus.OK);
	}
	
	@DeleteMapping("/eliminar/{codigo}")
	public ResponseEntity<Void> eliminar(@PathVariable("codigo") Integer cod) {
		Libro lib = servicioLib.buscarPorID(cod);
		if (lib == null)
			throw new NotFoundException();
		else
			servicioLib.eliminarPorID(cod);
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	@GetMapping("/lista")
	public ResponseEntity<List<Libro>> lista() {
		return new ResponseEntity<>(servicioLib.listarTodos(), HttpStatus.OK);
	}
	
	@GetMapping("/buscar/{cod}")
	public ResponseEntity<Libro> buscar(@PathVariable("cod") Integer codi) {
		Libro lib = servicioLib.buscarPorID(codi);
		if (lib == null)
			throw new NotFoundException();
		else
			lib = servicioLib.buscarPorID(codi);
		
		return new ResponseEntity<>(lib, HttpStatus.OK);
	}
}