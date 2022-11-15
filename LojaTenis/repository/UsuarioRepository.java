package com.catalogo.LojaTenis.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.catalogo.LojaTenis.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	Page<Usuario> findByCategoriaContainingOrderByCategoria(Pageable pageable, String Usuario);
}
