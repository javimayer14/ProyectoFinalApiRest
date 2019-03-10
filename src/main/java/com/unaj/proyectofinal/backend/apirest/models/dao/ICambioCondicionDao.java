package com.unaj.proyectofinal.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.unaj.proyectofinal.backend.apirest.models.entity.CambioCondiciones;


public interface ICambioCondicionDao extends CrudRepository<CambioCondiciones, Long>{

}
