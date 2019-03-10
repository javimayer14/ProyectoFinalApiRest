package com.unaj.proyectofinal.backend.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "conflicto_laboral")
public class ConflictosLaborales implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_conflicto;
	private long id_delegado;
	private String motivo;
	private String medida;
	private String descripcion;

	public long getId_conflicto() {
		return id_conflicto;
	}

	public void setId_conflicto(long id_conflicto) {
		this.id_conflicto = id_conflicto;
	}

	public long getId_delegado() {
		return id_delegado;
	}

	public void setId_delegado(long id_delegado) {
		this.id_delegado = id_delegado;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getMedida() {
		return medida;
	}

	public void setMedida(String medida) {
		this.medida = medida;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
