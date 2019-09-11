package com.unaj.proyectofinal.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.unaj.proyectofinal.backend.apirest.models.entity.RelevamientoInicial;
import com.unaj.proyectofinal.backend.apirest.models.entity.Variaciones;

public interface IRelevamientoInicialDao extends CrudRepository<RelevamientoInicial, Long>  {

}
