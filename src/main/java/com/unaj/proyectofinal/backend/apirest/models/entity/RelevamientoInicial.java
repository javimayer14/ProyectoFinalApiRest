package com.unaj.proyectofinal.backend.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "relevamiento_inicial")
public class RelevamientoInicial implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_relevamiento;
	private long id_delegado;
	private long id_empresa;
	private int cant_directos;
	private int cant_directos_uom;

	private int cant_subcontratados;
	private int cant_subcontratados_uom;

	private int cant_pasantias_becas;
	private int cant_pasantias_becas_uom;

	private int cant_monotributistas;
	private int cant_monotributistas_uom;

	private int cant_subvencionados;
	private int cant_subvencionados_uom;

	private int cant_contratos_temporarios;
	private int cant_contratos_temporarios_uom;

	private int cant_jubilados;
	private int cant_jubilados_uom;

	private int cant_terciarizados;
	private int cant_terciarizados_uom;

	private int cant_agencia;
	private int cant_agencia_uom;

	private int cant_personas_discapacidad;
	private int cant_personas_discapacidad_uom;

	private int cant_no_registrados;
	private int cant_no_registrados_uom;

	private int cant_total;
	private int cant_total_uom;

	private String descripcion;

	public long getId_relevamiento() {
		return id_relevamiento;
	}

	public void setId_relevamiento(long id_relevamiento) {
		this.id_relevamiento = id_relevamiento;
	}

	public long getId_delegado() {
		return id_delegado;
	}

	public void setId_delegado(long id_delegado) {
		this.id_delegado = id_delegado;
	}

	public long getId_empresa() {
		return id_empresa;
	}

	public void setId_empresa(long id_empresa) {
		this.id_empresa = id_empresa;
	}



	public int getCant_directos() {
		return cant_directos;
	}

	public void setCant_directos(int cant_directos) {
		this.cant_directos = cant_directos;
	}

	public int getCant_directos_uom() {
		return cant_directos_uom;
	}

	public void setCant_directos_uom(int cant_directos_uom) {
		this.cant_directos_uom = cant_directos_uom;
	}

	public int getCant_subcontratados() {
		return cant_subcontratados;
	}

	public void setCant_subcontratados(int cant_subcontratados) {
		this.cant_subcontratados = cant_subcontratados;
	}

	public int getCant_subcontratados_uom() {
		return cant_subcontratados_uom;
	}

	public void setCant_subcontratados_uom(int cant_subcontratados_uom) {
		this.cant_subcontratados_uom = cant_subcontratados_uom;
	}

	public int getCant_pasantias_becas() {
		return cant_pasantias_becas;
	}

	public void setCant_pasantias_becas(int cant_pasantias_becas) {
		this.cant_pasantias_becas = cant_pasantias_becas;
	}

	public int getCant_pasantias_becas_uom() {
		return cant_pasantias_becas_uom;
	}

	public void setCant_pasantias_becas_uom(int cant_pasantias_becas_uom) {
		this.cant_pasantias_becas_uom = cant_pasantias_becas_uom;
	}

	public int getCant_monotributistas() {
		return cant_monotributistas;
	}

	public void setCant_monotributistas(int cant_monotributistas) {
		this.cant_monotributistas = cant_monotributistas;
	}

	public int getCant_monotributistas_uom() {
		return cant_monotributistas_uom;
	}

	public void setCant_monotributistas_uom(int cant_monotributistas_uom) {
		this.cant_monotributistas_uom = cant_monotributistas_uom;
	}

	public int getCant_subvencionados() {
		return cant_subvencionados;
	}

	public void setCant_subvencionados(int cant_subvencionados) {
		this.cant_subvencionados = cant_subvencionados;
	}

	public int getCant_subvencionados_uom() {
		return cant_subvencionados_uom;
	}

	public void setCant_subvencionados_uom(int cant_subvencionados_uom) {
		this.cant_subvencionados_uom = cant_subvencionados_uom;
	}

	public int getCant_contratos_temporarios() {
		return cant_contratos_temporarios;
	}

	public void setCant_contratos_temporarios(int cant_contratos_temporarios) {
		this.cant_contratos_temporarios = cant_contratos_temporarios;
	}

	public int getCant_contratos_temporarios_uom() {
		return cant_contratos_temporarios_uom;
	}

	public void setCant_contratos_temporarios_uom(int cant_contratos_temporarios_uom) {
		this.cant_contratos_temporarios_uom = cant_contratos_temporarios_uom;
	}

	public int getCant_jubilados() {
		return cant_jubilados;
	}

	public void setCant_jubilados(int cant_jubilados) {
		this.cant_jubilados = cant_jubilados;
	}

	public int getCant_jubilados_uom() {
		return cant_jubilados_uom;
	}

	public void setCant_jubilados_uom(int cant_jubilados_uom) {
		this.cant_jubilados_uom = cant_jubilados_uom;
	}

	public int getCant_terciarizados() {
		return cant_terciarizados;
	}

	public void setCant_terciarizados(int cant_terciarizados) {
		this.cant_terciarizados = cant_terciarizados;
	}

	public int getCant_terciarizados_uom() {
		return cant_terciarizados_uom;
	}

	public void setCant_terciarizados_uom(int cant_terciarizados_uom) {
		this.cant_terciarizados_uom = cant_terciarizados_uom;
	}

	public int getCant_agencia() {
		return cant_agencia;
	}

	public void setCant_agencia(int cant_agencia) {
		this.cant_agencia = cant_agencia;
	}

	public int getCant_agencia_uom() {
		return cant_agencia_uom;
	}

	public void setCant_agencia_uom(int cant_agencia_uom) {
		this.cant_agencia_uom = cant_agencia_uom;
	}

	public int getCant_personas_discapacidad() {
		return cant_personas_discapacidad;
	}

	public void setCant_personas_discapacidad(int cant_personas_discapacidad) {
		this.cant_personas_discapacidad = cant_personas_discapacidad;
	}

	public int getCant_personas_discapacidad_uom() {
		return cant_personas_discapacidad_uom;
	}

	public void setCant_personas_discapacidad_uom(int cant_personas_discapacidad_uom) {
		this.cant_personas_discapacidad_uom = cant_personas_discapacidad_uom;
	}

	public int getCant_no_registrados() {
		return cant_no_registrados;
	}

	public void setCant_no_registrados(int cant_no_registrados) {
		this.cant_no_registrados = cant_no_registrados;
	}

	public int getCant_no_registrados_uom() {
		return cant_no_registrados_uom;
	}

	public void setCant_no_registrados_uom(int cant_no_registrados_uom) {
		this.cant_no_registrados_uom = cant_no_registrados_uom;
	}

	public int getCant_total() {
		return cant_total;
	}

	public void setCant_total(int cant_total) {
		this.cant_total = cant_total;
	}

	public int getCant_total_uom() {
		return cant_total_uom;
	}

	public void setCant_total_uom(int cant_total_uom) {
		this.cant_total_uom = cant_total_uom;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
