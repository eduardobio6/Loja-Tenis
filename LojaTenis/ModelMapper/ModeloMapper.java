package com.catalogo.LojaTenis.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;

import com.catalogo.LojaTenis.DTO.ModeloDTO;
import com.catalogo.LojaTenis.model.Modelo;



public class ModeloMapper {

	private ModelMapper modelMapper;

	public ModeloMapper(ModelMapper modelMapper) {
		this.modelMapper = modelMapper;
	}
	
	public Modelo toEntity(ModeloDTO modeloDTO) {
		return modelMapper.map(modeloDTO, Modelo.class);
	}

	public ModeloDTO toDTO(Modelo modelo) {
		return modelMapper.map(modelo, ModeloDTO.class);
	}
	
	
	public List<ModeloDTO> toDTO(List<Modelo> modelo) {
		return modelo.stream().map(this::toDTO).collect(Collectors.toList());
	}

	public List<Modelo> toEntity(List<ModeloDTO> categoriaDTO) {
		return categoriaDTO.stream().map(this::toEntity).collect(Collectors.toList());
	}
}
