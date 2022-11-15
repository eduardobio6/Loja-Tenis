package com.catalogo.LojaTenis.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.catalogo.LojaTenis.model.Modelo;
import com.catalogo.LojaTenis.service.ModeloService;

@RestController
@RequestMapping("/modelos")
public class ModeloController implements ControllerInterface<Modelo> {

	@Autowired
	private ModeloService service;
	
	@Override
	@GetMapping
	public ResponseEntity<Page<Modelo>> getAll(Pageable pageable){
		return ResponseEntity.ok(service.findAll(pageable));
	}
	
	@Override
	@GetMapping(value = "/{id}")
	public ResponseEntity<?> get(@PathVariable("id") Long id){
		Modelo obj = service.findById(id);
		if(obj != null) {
			return ResponseEntity.ok(obj);
		}
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
	
	@Override
	@PostMapping
	
	public ResponseEntity<Modelo> post(@RequestBody Modelo obj){
		
		service.create(obj);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		
		return ResponseEntity.created(location).body(obj);
	}
	
	@Override
	@PutMapping
	public ResponseEntity<?> put(@RequestBody Modelo obj){
		
		if (service.update(obj)) {
			
			return ResponseEntity.ok(obj);
		}
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
	
	@Override
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") Long id){
		
			if (service.delete(id)) {
				return ResponseEntity.ok().build();
			}
			
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}

}
