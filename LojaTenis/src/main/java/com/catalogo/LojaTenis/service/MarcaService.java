package com.catalogo.LojaTenis.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catalogo.LojaTenis.model.Marca;
import com.catalogo.LojaTenis.repository.MarcaRepository;
@Service
public class MarcaService implements ServiceInterface<Marca> {

	@Autowired
	private MarcaRepository repository;
	
	public MarcaService() {
		
	}
	
	@Override
	public Marca create(Marca marca) {
		
		repository.save(marca);
		return marca;
	}

	@Override
	public List<Marca> findAll(){
		return repository.findAll();
	}
	
	@Override
	public Marca findById(Long id) {
		Optional<Marca> obj = repository.findById(id);
		return obj.orElse(null);
	}
	
	@Override
	public boolean update(Marca marca) {
		if (repository.existsById(marca.getId())) {
			
			repository.save(marca);
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
