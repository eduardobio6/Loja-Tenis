package com.catalogo.LojaTenis.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;

import com.catalogo.LojaTenis.DTO.UsuarioDTO;
import com.catalogo.LojaTenis.model.Usuario;



public class UsuarioMapper {

	private ModelMapper modelMapper;

	public UsuarioMapper(ModelMapper modelMapper) {
		this.modelMapper = modelMapper;
	}
	
	public Usuario toEntity(UsuarioDTO usuarioDTO) {
		return modelMapper.map(usuarioDTO, Usuario.class);
	}

	public UsuarioDTO toDTO(Usuario usuario) {
		return modelMapper.map(usuario, UsuarioDTO.class);
	}
	
	
	public List<UsuarioDTO> toDTO(List<Usuario> usuario) {
		return usuario.stream().map(this::toDTO).collect(Collectors.toList());
	}

	public List<Usuario> toEntity(List<UsuarioDTO> usuarioDTO) {
		return usuarioDTO.stream().map(this::toEntity).collect(Collectors.toList());
	}
}
