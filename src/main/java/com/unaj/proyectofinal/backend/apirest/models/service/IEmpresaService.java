package com.unaj.proyectofinal.backend.apirest.models.service;

import java.util.List;

import com.unaj.proyectofinal.backend.apirest.models.entity.Empresa;

public interface IEmpresaService {
	public List<Empresa> findAll();

	public Empresa findById(Long id);

	public Empresa save(Empresa empresa);

	public void delete(Long id);

}
