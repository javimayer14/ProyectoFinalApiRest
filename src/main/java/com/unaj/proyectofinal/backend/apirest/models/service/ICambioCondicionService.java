package com.unaj.proyectofinal.backend.apirest.models.service;

import java.sql.Date;
import java.util.List;

import com.unaj.proyectofinal.backend.apirest.models.entity.CambioCondiciones;

public interface ICambioCondicionService {

	public List<CambioCondiciones> findAll();

	public CambioCondiciones findById(Long id);

	public CambioCondiciones save(CambioCondiciones cambioCondiciones);

	public void delete(Long id);

	public List<?> buscarCambioCondicionUsuario(String descripcionBusqueda, Date fechaDesde, Date fechaHasta);

	public List<?> buscarCambioCondicionEmpresa(String descripcionBusqueda, Date fechaDesde, Date fechaHasta);
}
