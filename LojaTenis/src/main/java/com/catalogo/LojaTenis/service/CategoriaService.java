package com.catalogo.LojaTenis.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.catalogo.LojaTenis.model.Categoria;
import com.catalogo.LojaTenis.repository.CategoriaRepository;

@Service
public class CategoriaService implements ServiceInterface<Categoria> {

	@Autowired
	private CategoriaRepository repository;
	
	public CategoriaService() {
		
	}
	
	@Override
	public Categoria create(Categoria categoria) {
		
		repository.save(categoria);
		return categoria;
	}

	public List<Categoria> findAll(){
		return repository.findAll();
	}
	
	@Override
	public Categoria findById(Long id) {
		Optional<Categoria> obj = repository.findById(id);
		return obj.orElse(null);
	}
	
	@Override
	public boolean update(Categoria categoria) {
		if (repository.existsById(categoria.getId())) {
			
			repository.save(categoria);
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
