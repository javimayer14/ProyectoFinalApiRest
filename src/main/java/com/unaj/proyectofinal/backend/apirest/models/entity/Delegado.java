package com.unaj.proyectofinal.backend.apirest.models.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "delegado")

public class Delegado implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_delegado;
	private long id_empresa;
	private long dni;
	private String nombre;
	private String apellido;
	private int telefono;
	private int telefono_celular;
	private String email;
	private String sindicato;
	private String descripcion;
	private int antiguedad;
	private int superado;
	private int eliminado;



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

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public int getTelefono_celular() {
		return telefono_celular;
	}

	public void setTelefono_celular(int telefono_celular) {
		this.telefono_celular = telefono_celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSindicato() {
		return sindicato;
	}

	public void setSindicato(String sindicato) {
		this.sindicato = sindicato;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getSuperado() {
		return superado;
	}

	public void setSuperado(int superado) {
		this.superado = superado;
	}

	public int getEliminado() {
		return eliminado;
	}

	public void setEliminado(int eliminado) {
		this.eliminado = eliminado;
	}


}
