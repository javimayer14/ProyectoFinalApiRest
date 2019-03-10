package com.unaj.proyectofinal.backend.apirest.models.service;

import java.util.List;

import com.unaj.proyectofinal.backend.apirest.models.entity.Delegado;

public interface IDelegadoService{
	
	public List<Delegado> findAll();
	
	
	public Delegado findById(Long id);
	
	public Delegado save(Delegado delegado);
	
	public void delete(Long id);
	
	
}
