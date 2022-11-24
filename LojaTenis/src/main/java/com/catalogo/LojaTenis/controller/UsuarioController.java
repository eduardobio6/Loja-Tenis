package com.catalogo.LojaTenis.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

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

import com.catalogo.LojaTenis.dto.UsuarioDTO;
import com.catalogo.LojaTenis.model.Categoria;
import com.catalogo.LojaTenis.model.Usuario;
import com.catalogo.LojaTenis.modelmapper.UsuarioMapper;
import com.catalogo.LojaTenis.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController implements ControllerInterface<UsuarioDTO> {

	@Autowired
	private UsuarioService service;
	
	private UsuarioMapper mapper;
	
	@Override
	@GetMapping
	public ResponseEntity<List<UsuarioDTO>> getAll(){
		return ResponseEntity.ok(mapper.toDTO(service.findAll()));
	}
	
	@Override
	@GetMapping(value = "/{id}")
	public ResponseEntity<?> get(@PathVariable("id") Long id){
		Usuario obj = service.findById(id);
		if(obj != null) {
			return ResponseEntity.ok(obj);
		}
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
	
	@Override
	@PostMapping
	public ResponseEntity<UsuarioDTO> post(@Valid @RequestBody UsuarioDTO obj){
		
		Usuario usuario = service.create(mapper.toEntity(obj));
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(usuario.getId())
				.toUri();
		return ResponseEntity.created(location).body(mapper.toDTO(usuario));
	}
	
	@Override
	@PutMapping
	public ResponseEntity<UsuarioDTO> put(@Valid @RequestBody UsuarioDTO obj){
		
		if (service.update(mapper.toEntity(obj))) {
			
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
