package com.unaj.proyectofinal.backend.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "variacion_laboral")
public class Variaciones implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_variacion;
	private long id_delegado;
	private long id_tipo_contrato;
	private long id_motivo;
	private String tipo_variacion;
	private String tipo_incorporacion;
	private String descripcion;

	public long getId_variacion() {
		return id_variacion;
	}

	public void setId_variacion(long id_variacion) {
		this.id_variacion = id_variacion;
	}

	public long getId_delegado() {
		return id_delegado;
	}

	public void setId_delegado(long id_delegado) {
		this.id_delegado = id_delegado;
	}

	public long getId_tipo_contrato() {
		return id_tipo_contrato;
	}

	public void setId_tipo_contrato(long id_tipo_contrato) {
		this.id_tipo_contrato = id_tipo_contrato;
	}

	public long getId_motivo() {
		return id_motivo;
	}

	public void setId_motivo(long id_motivo) {
		this.id_motivo = id_motivo;
	}

	public String getTipo_variacion() {
		return tipo_variacion;
	}

	public void setTipo_variacion(String tipo_variacion) {
		this.tipo_variacion = tipo_variacion;
	}

	public String getTipo_incorporacion() {
		return tipo_incorporacion;
	}

	public void setTipo_incorporacion(String tipo_incorporacion) {
		this.tipo_incorporacion = tipo_incorporacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
