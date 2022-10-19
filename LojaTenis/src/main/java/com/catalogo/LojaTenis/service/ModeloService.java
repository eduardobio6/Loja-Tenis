package com.catalogo.LojaTenis.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.catalogo.LojaTenis.model.Modelo;
import com.catalogo.LojaTenis.repository.ModeloRepository;

public class ModeloService implements ServiceInterface<Modelo> {

	@Autowired
	private ModeloRepository repository;
	
	public ModeloService() {
		
	}
	
	@Override
	public Modelo create(Modelo modelo) {
		
		repository.save(modelo);
		return modelo;
	}

	@Override
	public List<Modelo> findAll(){
		return repository.findAll();
	}
	
	@Override
	public Modelo findById(Long id) {
		Optional<Modelo> obj = repository.findById(id);
		return obj.orElse(null);
	}
	
	@Override
	public boolean update(Modelo modelo) {
		if (repository.existsById(modelo.getId())) {
			
			repository.save(modelo);
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
