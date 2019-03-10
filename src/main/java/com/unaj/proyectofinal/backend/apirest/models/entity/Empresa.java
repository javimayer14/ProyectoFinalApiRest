package com.unaj.proyectofinal.backend.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity 
@Table(name="empresa")
public class Empresa implements Serializable {
	

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_empresa;
	private String razon_social;
	private String cuit;
	private String actividad;
	private String sucursal;
	private String direccion;
	private String localidad;
	private String cp;
	private String partido;
	private String provincia;
	

	public long getId_empresa() {
		return id_empresa;
	}

	public void setId_empresa(long id_empresa) {
		this.id_empresa = id_empresa;
	}

	public String getRazon_social() {
		return razon_social;
	}

	public void setRazon_social(String razon_social) {
		this.razon_social = razon_social;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public String getActividad() {
		return actividad;
	}

	public void setActividad(String actividad) {
		this.actividad = actividad;
	}

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		partido = partido;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		provincia = provincia;
	}

}
