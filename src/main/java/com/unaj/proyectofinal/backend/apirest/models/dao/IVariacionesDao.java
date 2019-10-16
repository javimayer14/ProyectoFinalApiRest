package com.unaj.proyectofinal.backend.apirest.models.dao;



import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.unaj.proyectofinal.backend.apirest.models.entity.Variaciones;

public interface IVariacionesDao extends CrudRepository<Variaciones, Long> {

	@Query("SELECT d.nombreUsuario, d.apellidoUsuario, d.mail, d.nombreEmpresa , var.fecha, var.tipoVariacion, var.tipoIncorporacion, var.descripcion, var.cantidad " + 
			"					 FROM Variaciones var" + 
			"					 INNER JOIN var.usuario d " + 
			"					 WHERE d.nombreUsuario LIKE  %:dato%"+ 
			"					 AND var.fecha BETWEEN :fechaDesde AND :fechaHasta"+
			"					 AND var.tipoVariacion = :tipoVariacion"
									)
	public List<?> buscarVariacionesUsuario(@Param("fechaDesde") Date fechaDesde, @Param("fechaHasta") Date fechaHasta, @Param("dato") String dato,  @Param("tipoVariacion") String tipoVariacion);
	
	@Query("SELECT d.nombreUsuario, d.apellidoUsuario, d.mail, d.nombreEmpresa , var.fecha, var.tipoVariacion, var.tipoIncorporacion, var.descripcion, var.cantidad " +
			"					 FROM Variaciones var" + 
			"					 INNER JOIN var.usuario d " + 
			"					 WHERE d.nombreEmpresa LIKE  %:dato%"+ 
			"					 AND var.fecha BETWEEN :fechaDesde AND :fechaHasta"+
			"					 AND var.tipoVariacion = :tipoVariacion")
	public List<?> buscarVariacionesEmpresa(@Param("fechaDesde") Date fechaDesde, @Param("fechaHasta") Date fechaHasta, @Param("dato") String dato,  @Param("tipoVariacion") String tipoVariacion);
}
