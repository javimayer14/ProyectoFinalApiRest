package com.unaj.proyectofinal.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;


import com.unaj.proyectofinal.backend.apirest.models.entity.Empresa;

public interface IEmpresaDao extends CrudRepository<Empresa, Long> {

}
