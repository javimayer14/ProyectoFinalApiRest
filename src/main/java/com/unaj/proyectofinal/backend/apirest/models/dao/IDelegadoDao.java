package com.unaj.proyectofinal.backend.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.unaj.proyectofinal.backend.apirest.models.entity.Delegado;

public interface IDelegadoDao extends CrudRepository<Delegado, Long> {
	

}
