
package com.unaj.proyectofinal.backend.apirest.models.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.unaj.proyectofinal.backend.apirest.models.entity.CambioCondiciones;


public interface ICambioCondicionDao extends CrudRepository<CambioCondiciones, Long>{
	
	@Query("SELECT d.nombreUsuario, d.apellidoUsuario , d.mail, d.nombreEmpresa, camb.fecha, camb.motivoPrincipal, camb.subMotivo, camb.descripcion " + 
			"					 FROM CambioCondiciones camb" + 
			"					 LEFT JOIN camb.delegado d " + 
			"					 WHERE d.nombreUsuario LIKE  %:dato%"+ 
			"					 AND camb.fecha BETWEEN :fechaDesde AND :fechaHasta" )
	public List buscarCambioCondicionUsuario(@Param("fechaDesde") Date fechaDesde, @Param("fechaHasta") Date fechaHasta, @Param("dato") String dato);
	
	@Query("SELECT d.nombreUsuario, d.apellidoUsuario , d.mail, d.nombreEmpresa, camb.fecha, camb.motivoPrincipal, camb.subMotivo, camb.descripcion " +  
			"					 FROM CambioCondiciones camb" + 
			"					 LEFT JOIN camb.delegado d " + 
			"					 WHERE d.nombreEmpresa LIKE  %:dato%"+ 
			"					 AND camb.fecha BETWEEN :fechaDesde AND :fechaHasta" )
	public List buscarCambioCondicionEmpresa(@Param("fechaDesde") Date fechaDesde, @Param("fechaHasta") Date fechaHasta, @Param("dato") String dato);

}