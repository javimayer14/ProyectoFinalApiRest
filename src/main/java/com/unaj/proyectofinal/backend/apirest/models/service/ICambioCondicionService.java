package com.unaj.proyectofinal.backend.apirest.models.service;

import java.util.List;

import com.unaj.proyectofinal.backend.apirest.models.entity.CambioCondiciones;


public interface ICambioCondicionService {
	public List<CambioCondiciones> findAll();
	
	
	public CambioCondiciones findById(Long id);
	
	public CambioCondiciones save(CambioCondiciones cambioCondicion);
	
	public void delete(Long id);
}
