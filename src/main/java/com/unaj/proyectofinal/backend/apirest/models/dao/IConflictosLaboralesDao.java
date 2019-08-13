package com.unaj.proyectofinal.backend.apirest.models.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.unaj.proyectofinal.backend.apirest.models.entity.ConflictosLaborales;

public interface IConflictosLaboralesDao extends CrudRepository<ConflictosLaborales, Long> {

	@Query("SELECT d.nombreUsuario, d.apellidoUsuario, d.nombreEmpresa, conf.fecha, conf.motivo, conf.descripcion, conf.medida " + 
			"					 FROM ConflictosLaborales conf" + 
			"					 LEFT JOIN conf.usuario d " + 
			"					 WHERE d.nombreUsuario LIKE  %:dato%"+ 
			"					 AND conf.fecha BETWEEN :fechaDesde AND :fechaHasta" )
	public List<?> buscarConflictoLaboralUsuario(@Param("fechaDesde") Date fechaDesde, @Param("fechaHasta") Date fechaHasta, @Param("dato") String dato);
	
	@Query("SELECT d.nombreUsuario, d.nombreEmpresa, d.mail , conf.motivo, conf.medida, conf.descripcion, conf.fecha, conf.medida " + 
			"					 FROM ConflictosLaborales conf" + 
			"					 LEFT JOIN conf.usuario d " + 
			"					 WHERE d.nombreEmpresa LIKE  %:dato%"+ 
			"					 AND conf.fecha BETWEEN :fechaDesde AND :fechaHasta" )
	
	public List<?> buscarConflictoLaboralEmpresa(@Param("fechaDesde") Date fechaDesde, @Param("fechaHasta") Date fechaHasta, @Param("dato") String dato);
	



}