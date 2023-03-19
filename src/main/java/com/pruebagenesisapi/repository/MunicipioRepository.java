package com.pruebagenesisapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pruebagenesisapi.model.Municipio;

public interface MunicipioRepository extends JpaRepository<Municipio, Long> {
	List<Municipio> findByDepartamentoId(Long departamentoId);
	

}
