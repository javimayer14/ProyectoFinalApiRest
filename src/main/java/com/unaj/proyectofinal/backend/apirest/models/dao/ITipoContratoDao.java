package com.unaj.proyectofinal.backend.apirest.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.unaj.proyectofinal.backend.apirest.models.entity.TipoContrato;

public interface ITipoContratoDao extends CrudRepository<TipoContrato, Long> {


	@Query("SELECT tc.id_tipo_contrato FROM TipoContrato tc WHERE tc.nombre_contrato = ?1")
	@Transactional
	public Integer buscarIdContratoPorNommbre(@Param("contrato") String contrato);

}
