package com.unaj.proyectofinal.backend.apirest.models.service;

import java.util.List;

import com.unaj.proyectofinal.backend.apirest.models.entity.Delegado;
import com.unaj.proyectofinal.backend.apirest.models.entity.Variaciones;

public interface IVariacionesService {
	
	public List<Variaciones> findAll();
	
	public Variaciones findById(Long id);
	
	public Variaciones save(Variaciones variacion);
	
	public void delete(Long id);
}
