package com.unaj.proyectofinal.backend.apirest.models.service;

import java.sql.Date;
import java.util.List;

import com.unaj.proyectofinal.backend.apirest.models.entity.ConflictosLaborales;


public interface IConflictosLaboralesService {
	
	public List<ConflictosLaborales> findAll();

	public ConflictosLaborales findById(Long id);

	public ConflictosLaborales save(ConflictosLaborales conflictosLaborales);

	public void delete(Long id);
	
	

	public List buscarConflictoLaboralEmpresa(String descripcionBusqueda,Date fechaDesde,Date fechaHasta);

	public List buscarConflictoLaboralUsuario(String descripcionBusqueda, Date fechaDesde, Date fechaHasta);
	
//	public List buscarConflictoLaboralEcho();
}
