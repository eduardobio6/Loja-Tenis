package com.catalogo.LojaTenis.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.catalogo.LojaTenis.model.Tenis;
import com.catalogo.LojaTenis.service.TenisService;

@RestController
@RequestMapping("/tenis")
public class TenisController implements ControllerInterface<Tenis> {

	@Autowired
	private TenisService service;
	
	@Override
	@GetMapping
	public ResponseEntity<List<Tenis>> getAll(){
		return ResponseEntity.ok(service.findAll());
	}
	
	@Override
	@GetMapping(value = "/{id}")
	public ResponseEntity<?> get(@PathVariable("id") Long id){
		Tenis obj = service.findById(id);
		if(obj != null) {
			return ResponseEntity.ok(obj);
		}
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
	
	@Override
	@PostMapping
	public ResponseEntity<Tenis> post(@RequestBody Tenis obj){
		
		service.create(obj);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		
		return ResponseEntity.created(location).body(obj);
	}
	
	@Override
	@PutMapping
	public ResponseEntity<?> put(@RequestBody Tenis obj){
		
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
