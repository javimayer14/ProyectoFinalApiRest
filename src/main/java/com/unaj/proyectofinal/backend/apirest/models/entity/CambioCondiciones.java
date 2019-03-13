package com.unaj.proyectofinal.backend.apirest.models.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cambio_laboral")
public class CambioCondiciones implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_cambio_condicion;
	private long id_delegado;
	private String motivo_principal;
	private String sub_motivo;
	private String Descripcion;
	private Date fecha;

	
	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public long getId_cambio_condicion() {
		return id_cambio_condicion;
	}

	public void setId_cambio_condicion(long id_cambio_condicion) {
		this.id_cambio_condicion = id_cambio_condicion;
	}

	public long getId_delegado() {
		return id_delegado;
	}

	public void setId_delegado(long id_delegado) {
		this.id_delegado = id_delegado;
	}

	public String getMotivo_principal() {
		return motivo_principal;
	}

	public void setMotivo_principal(String motivo_principal) {
		this.motivo_principal = motivo_principal;
	}

	public String getSub_motivo() {
		return sub_motivo;
	}

	public void setSub_motivo(String sub_motivo) {
		this.sub_motivo = sub_motivo;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

}
