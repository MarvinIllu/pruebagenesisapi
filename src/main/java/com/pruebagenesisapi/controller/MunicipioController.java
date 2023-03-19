package com.pruebagenesisapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebagenesisapi.model.Municipio;
import com.pruebagenesisapi.repository.MunicipioRepository;

@RestController
@RequestMapping("/api/municipio")
@CrossOrigin("*")
public class MunicipioController {
	 @Autowired
	 private MunicipioRepository repo;
	 
	 @GetMapping(value = "/bydepto/{idDepto}")
	 public List<Municipio> getMunicipioById(@PathVariable Long idDepto){
		 return repo.findByDepartamentoId(idDepto);
	 }

}