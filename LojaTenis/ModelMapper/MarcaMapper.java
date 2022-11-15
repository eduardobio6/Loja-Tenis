package com.catalogo.LojaTenis.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;

import com.catalogo.LojaTenis.DTO.MarcaDTO;
import com.catalogo.LojaTenis.model.Marca;



public class MarcaMapper {

	private ModelMapper modelMapper;

	public MarcaMapper(ModelMapper modelMapper) {
		this.modelMapper = modelMapper;
	}
	
	public Marca toEntity(MarcaDTO marcaDTO) {
		return modelMapper.map(marcaDTO, Marca.class);
	}

	public MarcaDTO toDTO(Marca marca) {
		return modelMapper.map(marca, MarcaDTO.class);
	}
	
	
	public List<MarcaDTO> toDTO(List<Marca> marca) {
		return marca.stream().map(this::toDTO).collect(Collectors.toList());
	}

	public List<Marca> toEntity(List<MarcaDTO> marcaDTO) {
		return marcaDTO.stream().map(this::toEntity).collect(Collectors.toList());
	}
}
