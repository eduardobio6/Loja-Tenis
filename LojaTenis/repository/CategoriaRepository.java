package com.catalogo.LojaTenis.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.catalogo.LojaTenis.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	Page<Categoria> findByCategoriaContainingOrderByCategoria(Pageable pageable, String Categoria);
}
