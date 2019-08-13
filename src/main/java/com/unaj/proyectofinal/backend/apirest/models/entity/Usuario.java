package com.unaj.proyectofinal.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(unique = true, length = 20)
	private String username;

	@Column(length = 60)
	@JsonIgnore
	private String password;
	private Boolean enabled;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	// @JoinTable(uniqueConstraints= { @UniqueConstraint (columnNames=
	// {"usuario_id","role_id"})})
	private List<Role> roles;

	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Variaciones> variaciones;

	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonIgnore
	private List<CambioCondiciones> cambioCondiciones;

	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonIgnore
	private List<ConflictosLaborales> conflictosLaborales;

	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonIgnore
	private List<ConflictosLaborales> usuarioRoles;

	private String fechaInicioEnProyecto;
	private String nombreUsuario;
	private String apellidoUsuario;

	private String dni;
	private String telefono;
	private String telefonoCelular;
	private String mail;
	private String antiguedad;

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getTelefonoCelular() {
		return telefonoCelular;
	}

	public void setTelefonoCelular(String telefonoCelular) {
		this.telefonoCelular = telefonoCelular;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(String antiguedad) {
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

	public void setCheckk(String checkk) {
		this.checkk = checkk;
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

}
