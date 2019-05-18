package com.unaj.proyectofinal.backend.apirest.models.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.unaj.proyectofinal.backend.apirest.models.entity.Variaciones;

public interface IVariacionesDao extends CrudRepository<Variaciones, Long> {

	@Query("SELECT d.nombreUsuario, d.apellidoUsuario, d.mail , var.fecha, var.tipoVariacion, var.tipoIncorporacion, var.descripcion " + 
			"					 FROM Variaciones var" + 
			"					 INNER JOIN var.delegado d " + 
			"					 WHERE d.nombreUsuario LIKE  %:dato%"+ 
			"					 AND var.fecha BETWEEN :fechaDesde AND :fechaHasta" )
	public List buscarVariacionesUsuario(@Param("fechaDesde") Date fechaDesde, @Param("fechaHasta") Date fechaHasta, @Param("dato") String dato);
	
	@Query("SELECT d.nombreUsuario, d.apellidoUsuario, d.mail , var.fecha, var.tipoVariacion, var.tipoIncorporacion, var.descripcion " +
			"					 FROM Variaciones var" + 
			"					 INNER JOIN var.delegado d " + 
			"					 WHERE d.nombreEmpresa LIKE  %:dato%"+ 
			"					 AND var.fecha BETWEEN :fechaDesde AND :fechaHasta" )
	public List buscarVariacionesEmpresa(@Param("fechaDesde") Date fechaDesde, @Param("fechaHasta") Date fechaHasta, @Param("dato") String dato);
}
//SELECT d.nombre_usuario, d.apellido_usuario, cct, dni, d.nombre_empresa
//FROM db_proyecto_final.delegado d
//INNER JOIN db_proyecto_final.variacion_laboral var on d.id_delegado = var.id_delegado
//WHERE nombre_empresa LIKE  '%%'