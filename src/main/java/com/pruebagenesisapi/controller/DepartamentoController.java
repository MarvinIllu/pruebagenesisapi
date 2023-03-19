package com.pruebagenesisapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebagenesisapi.model.Departamento;
import com.pruebagenesisapi.repository.DepartamentoRepository;

@RestController
@RequestMapping("/api/departamento")
@CrossOrigin("*")
public class DepartamentoController {
	@Autowired
	private DepartamentoRepository repo;
	
	@GetMapping("/all")
	public List<Departamento> all(){
		return repo.findAll();
	}
}
