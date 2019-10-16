package com.unaj.proyectofinal.backend.apirest.models.service;

import java.util.List;

import com.unaj.proyectofinal.backend.apirest.models.entity.Motivo;

public interface IMotivoService {
	
	public List<Motivo> findAll();

	public Motivo findById(Long id);

	public Motivo save(Motivo motivo);

	public void delete(Long id);

}
