package com.unaj.proyectofinal.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "delegado")

public class Delegado implements Serializable {

	private static final long serialVersionUID = 7044934755315999798L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_delegado;
	
	private String usuario;
	private String contrasenia;
	private String fechaInicioEnProyecto;
	private String nombreUsuario;
	private String apellidoUsuario;
	
	private long dni;
	private int telefono;
	private int telefonoCelular;
	private String mail;
	private int antiguedad;
	
	private String nombreEmpresa;
	private String cuit;
	private String actividad;
	private String checkk;
	private String direccion;
	
	private String localidad;
	private String codigoPostal;
	private String partido;
	private String provincia;
	private String sindicato;
	
	private String cct;
	private String cctNro;
	private String ramaActividad;
	private String cctNro2;
	private String ramaActividad2;
	
	private String cctNro3;
	private String ramaActividad3;
	private String cctNro4;
	private String ramaActividad4;
	private String descripcion;
	public long getId_delegado() {
		return id_delegado;
	}
	public void setId_delegado(long id_delegado) {
		this.id_delegado = id_delegado;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	public String getFechaInicioEnProyecto() {
		return fechaInicioEnProyecto;
	}
	public void setFechaInicioEnProyecto(String fechaInicioEnProyecto) {
		this.fechaInicioEnProyecto = fechaInicioEnProyecto;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getApellidoUsuario() {
		return apellidoUsuario;
	}
	public void setApellidoUsuario(String apellidoUsuario) {
		this.apellidoUsuario = apellidoUsuario;
	}
	public long getDni() {
		return dni;
	}
	public void setDni(long dni) {
		this.dni = dni;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public int getTelefonoCelular() {
		return telefonoCelular;
	}
	public void setTelefonoCelular(int telefonoCelular) {
		this.telefonoCelular = telefonoCelular;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
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
	public String getCheckk() {
		return checkk;
	}
	public void setCheckk(String check) {
		this.checkk = check;
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
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public String getPartido() {
		return partido;
	}
	public void setPartido(String partido) {
		this.partido = partido;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getSindicato() {
		return sindicato;
	}
	public void setSindicato(String sindicato) {
		this.sindicato = sindicato;
	}
	public String getCct() {
		return cct;
	}
	public void setCct(String cct) {
		this.cct = cct;
	}
	public String getCctNro() {
		return cctNro;
	}
	public void setCctNro(String cctNro) {
		this.cctNro = cctNro;
	}
	public String getRamaActividad() {
		return ramaActividad;
	}
	public void setRamaActividad(String ramaActividad) {
		this.ramaActividad = ramaActividad;
	}
	public String getCctNro2() {
		return cctNro2;
	}
	public void setCctNro2(String cctNro2) {
		this.cctNro2 = cctNro2;
	}
	public String getRamaActividad2() {
		return ramaActividad2;
	}
	public void setRamaActividad2(String ramaActividad2) {
		this.ramaActividad2 = ramaActividad2;
	}
	public String getCctNro3() {
		return cctNro3;
	}
	public void setCctNro3(String cctNro3) {
		this.cctNro3 = cctNro3;
	}
	public String getRamaActividad3() {
		return ramaActividad3;
	}
	public void setRamaActividad3(String ramaActividad3) {
		this.ramaActividad3 = ramaActividad3;
	}
	public String getCctNro4() {
		return cctNro4;
	}
	public void setCctNro4(String cctNro4) {
		this.cctNro4 = cctNro4;
	}
	public String getRamaActividad4() {
		return ramaActividad4;
	}
	public void setRamaActividad4(String ramaActividad4) {
		this.ramaActividad4 = ramaActividad4;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
//	INSERT INTO delegado (usuario,contrasenia,fechaInicioEnProyecto,nombreUsuario,apellidoUsuario,dni,telefono,telefonoCelular,mail,antiguedad,nombreEmpresa,cuit,actividad,checkk,direccion,localidad,codigoPostal,partido,provincia,sindicato,cct,cctNro,ramaActividad,cctNro2,ramaActividad2,cctNro3,ramaActividad3,cctNro4,ramaActividad4,descripcion) values('pepe','pepe123','fecha','nom','app',123,123,123,'mail',8,'nom_empresa','asd','asd','true','dire','localidad','codigo','partido','provincia','sindicato','conv','c1','c2','c3','c4','r1','r2','r3','r4','desc');


	
}
