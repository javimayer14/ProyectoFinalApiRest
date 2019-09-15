package com.unaj.proyectofinal.backend.apirest.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.unaj.proyectofinal.backend.apirest.models.entity.RelevamientoInicial;
import com.unaj.proyectofinal.backend.apirest.models.entity.Variaciones;

public interface IRelevamientoInicialDao extends CrudRepository<RelevamientoInicial, Long>  {
	
	
	@Query("					 FROM RelevamientoInicial ri" + 
			"					 WHERE ri.id_delegado = :idUsuario")
	public RelevamientoInicial relevamientoByIdUser(@Param("idUsuario") Long idUsuario);

}
