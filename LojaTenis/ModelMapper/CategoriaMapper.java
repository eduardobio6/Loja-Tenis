package com.catalogo.LojaTenis.ModelMapper;


import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.catalogo.LojaTenis.DTO.CategoriaDTO;
import com.catalogo.LojaTenis.model.Categoria;

@Component
public class CategoriaMapper {

	private ModelMapper modelMapper;

	public CategoriaMapper(ModelMapper modelMapper) {
		this.modelMapper = modelMapper;
	}
	
	public Categoria toEntity(CategoriaDTO categoriaDTO) {
		return modelMapper.map(categoriaDTO, Categoria.class);
	}

	public CategoriaDTO toDTO(Categoria categoria) {
		return modelMapper.map(categoria, CategoriaDTO.class);
	}
	
	
	public List<CategoriaDTO> toDTO(List<Categoria> categoria) {
		return categoria.stream().map(this::toDTO).collect(Collectors.toList());
	}

	public List<Categoria> toEntity(List<CategoriaDTO> categoriaDTO) {
		return categoriaDTO.stream().map(this::toEntity).collect(Collectors.toList());
	}
}
