package com.unaj.proyectofinal.backend.apirest.models.service;

import java.sql.Date;
import java.util.List;

import com.unaj.proyectofinal.backend.apirest.models.entity.Variaciones;

public interface IVariacionesService {

	public List<Variaciones> findAll();

	public Variaciones findById(Long id);

	public Variaciones save(Variaciones variacion, String contrato);

	public void delete(Long id);

	public List<?> buscarVariacionesUsuario(String descripcionBusqueda, Date FechaDesde, Date FechaHasta,
			String tipoVariacion);

	public List<?> buscarVariacionesEmpresa(String descripcionBusqueda, Date FechaDesde, Date FechaHasta,
			String tipoVariacion);

}
