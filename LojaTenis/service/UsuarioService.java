package com.catalogo.LojaTenis.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import com.catalogo.LojaTenis.model.Usuario;
import com.catalogo.LojaTenis.repository.UsuarioRepository;
@Service
public class UsuarioService implements ServiceInterface<Usuario> {

	@Autowired
	private UsuarioRepository repository;
	
	public UsuarioService() {
		
	}
	
	@Override
	public Usuario create(Usuario usuario) {
		
		repository.save(usuario);
		return usuario;
	}

	@Override
	public Page<Usuario> findAll(Pageable pageable){
		return repository.findAll(pageable);
	}
	
	@Override
	public Usuario findById(Long id) {
		Optional<Usuario> obj = repository.findById(id);
		return obj.orElse(null);
	}
	
	@Override
	public boolean update(Usuario usuario) {
		if (repository.existsById(usuario.getId())) {
			
			repository.save(usuario);
			return true;
		}
		
		return false;
	}
	
	@Override
	public boolean delete(Long id) {
		if (repository.existsById(id)) {
			
			repository.deleteById(id);
			return true;
		}
		
		return false;
	}
	
}
