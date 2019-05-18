package com.unaj.proyectofinal.backend.apirest.models.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "variacion_laboral")
public class Variaciones implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_variacion;
	private long id_tipo_contrato;
	private long id_motivo;
	private int cantidad;
	private String tipoVariacion;
	private String tipoIncorporacion;
	private String descripcion;
	private Date fecha;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_delegado")
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	private Delegado delegado;
	
	public Date getFecha() {
		return fecha;
	}

	public Delegado getDelegado() {
		return delegado;
	}

	public void setDelegado(Delegado delegado) {
		this.delegado = delegado;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public long getId_variacion() {
		return id_variacion;
	}

	public void setId_variacion(long id_variacion) {
		this.id_variacion = id_variacion;
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

		
	public String getTipoVariacion() {
		return tipoVariacion;
	}

	public void setTipoVariacion(String tipoVariacion) {
		this.tipoVariacion = tipoVariacion;
	}

	public String getTipoIncorporacion() {
		return tipoIncorporacion;
	}

	public void setTipoIncorporacion(String tipoIncorporacion) {
		this.tipoIncorporacion = tipoIncorporacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}