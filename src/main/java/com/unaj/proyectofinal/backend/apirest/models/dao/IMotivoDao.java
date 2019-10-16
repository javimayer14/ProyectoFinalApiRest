package com.unaj.proyectofinal.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;
import com.unaj.proyectofinal.backend.apirest.models.entity.Motivo;

public interface IMotivoDao extends CrudRepository<Motivo, Long>{

}
