package com.unaj.proyectofinal.backend.apirest.models.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.unaj.proyectofinal.backend.apirest.models.dao.ICambioCondicionDao;
import com.unaj.proyectofinal.backend.apirest.models.entity.CambioCondiciones;
@Service
public class CambioCondicionService implements ICambioCondicionService{

	@Autowired
	private ICambioCondicionDao cambioCondicion;
	@Override
	@Transactional(readOnly=true)
	public List<CambioCondiciones> findAll() {
		// TODO Auto-generated method stub
		return (List<CambioCondiciones>) cambioCondicion.findAll();
	}

	@Override
	@Transactional
	public CambioCondiciones findById(Long id) {
		// TODO Auto-generated method stub
		return cambioCondicion.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public CambioCondiciones save(CambioCondiciones cambioCondiciones) {
		// TODO Auto-generated method stub
		return cambioCondicion.save(cambioCondiciones);
	}

	@Override
	public void delete(Long id) {
		cambioCondicion.deleteById(id);
		
	}

	@Override
	@Transactional
	public  List buscarCambioCondicionUsuario(String date , Date fechaDesde, Date fechaHasta) {
		// TODO Auto-generated method stub
		Date fd = java.sql.Date.valueOf( "2000-01-31" );
		Date fh = java.sql.Date.valueOf( "2020-01-31" );
		String dato  = "pe";
		return cambioCondicion.buscarCambioCondicionUsuario(fechaDesde, fechaHasta, date);
		
	}

	@Override
	@Transactional
	public List buscarCambioCondicionEmpresa(String date , Date fechaDesde, Date fechaHasta) {
		Date fd = java.sql.Date.valueOf( "2000-01-31" );
		Date fh = java.sql.Date.valueOf( "2020-01-31" );
		String dato  = "me";
		return cambioCondicion.buscarCambioCondicionEmpresa(fechaDesde, fechaHasta, date);
	}
	

}
