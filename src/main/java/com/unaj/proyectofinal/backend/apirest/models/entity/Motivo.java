package com.unaj.proyectofinal.backend.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "motivo")
public class Motivo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_motivo;
	private String nombre_motivo;
	private String descripcion;

	public long getId_motivo() {
		return id_motivo;
	}

	public void setId_motivo(long id_motivo) {
		this.id_motivo = id_motivo;
	}

	public String getNombre_motivo() {
		return nombre_motivo;
	}

	public void setNombre_motivo(String nombre_motivo) {
		this.nombre_motivo = nombre_motivo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
