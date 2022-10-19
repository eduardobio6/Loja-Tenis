package com.catalogo.LojaTenis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.catalogo.LojaTenis.model.Tenis;

@Repository
public interface TenisRepository extends JpaRepository<Tenis, Long> {

}
