package com.unaj.proyectofinal.backend.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "tipo_contrato")
public class TipoContrato implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_tipo_contrato;
	private String nombre_contrato;
	private String Descripcion;

	public long getId_tipo_contrato() {
		return id_tipo_contrato;
	}

	public void setId_tipo_contrato(long id_tipo_contrato) {
		this.id_tipo_contrato = id_tipo_contrato;
	}

	public String getNombre_contrato() {
		return nombre_contrato;
	}

	public void setNombre_contrato(String nombre_contrato) {
		this.nombre_contrato = nombre_contrato;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

}
