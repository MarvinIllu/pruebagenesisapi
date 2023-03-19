package com.pruebagenesisapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="municipio")
public class Municipio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	
	@Column(name = "nombre")
	private String nombre;
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the departamentoId
	 */
	public Long getDepartamentoId() {
		return departamentoId;
	}

	/**
	 * @param departamentoId the departamentoId to set
	 */
	public void setDepartamentoId(Long departamentoId) {
		this.departamentoId = departamentoId;
	}

	@Column(name = "departamento_id")
	private Long departamentoId;
	

}
