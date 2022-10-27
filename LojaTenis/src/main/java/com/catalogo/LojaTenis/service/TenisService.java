package com.catalogo.LojaTenis.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catalogo.LojaTenis.model.Tenis;
import com.catalogo.LojaTenis.repository.TenisRepository;
@Service
public class TenisService implements ServiceInterface<Tenis> {

	@Autowired
	private TenisRepository repository;
	
	public TenisService() {
		
	}
	
	@Override
	public Tenis create(Tenis tenis) {
		
		repository.save(tenis);
		return tenis;
	}

	@Override
	public List<Tenis> findAll(){
		return repository.findAll();
	}
	
	@Override
	public Tenis findById(Long id) {
		Optional<Tenis> obj = repository.findById(id);
		return obj.orElse(null);
	}
	
	@Override
	public boolean update(Tenis tenis) {
		if (repository.existsById(tenis.getId())) {
			
			repository.save(tenis);
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
