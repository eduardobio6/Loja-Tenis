package com.catalogo.LojaTenis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.catalogo.LojaTenis.model.Modelo;

@Repository
public interface ModeloRepository extends JpaRepository<Modelo, Long> {

}
