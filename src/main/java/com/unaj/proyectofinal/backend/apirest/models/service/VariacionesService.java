package com.unaj.proyectofinal.backend.apirest.models.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.unaj.proyectofinal.backend.apirest.models.dao.ITipoContratoDao;
import com.unaj.proyectofinal.backend.apirest.models.dao.IVariacionesDao;
import com.unaj.proyectofinal.backend.apirest.models.entity.Variaciones;

@Service
public class VariacionesService implements IVariacionesService {

	@Autowired
	private IVariacionesDao variacionesDao;
	@Autowired
	private ITipoContratoDao tipoContratoDao;

	@Override
	@Transactional
	public List<Variaciones> findAll() {
		return (List<Variaciones>) variacionesDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Variaciones findById(Long id) {
		// TODO Auto-generated method stub
		return variacionesDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Variaciones save(Variaciones variacion, String contrato) {
		// TODO Auto-generated method stub
		Integer idContrato = tipoContratoDao.buscarIdContratoPorNommbre(contrato);
		variacion.setId_tipo_contrato(idContrato);
		return variacionesDao.save(variacion);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		variacionesDao.deleteById(id);

	}

	@Override
	@Transactional
	public List<?> buscarVariacionesUsuario(String date, Date fechaDesde, Date fechaHasta, String tipoVariacion) {
		return variacionesDao.buscarVariacionesUsuario(fechaDesde, fechaHasta, date, tipoVariacion);
	}

	@Override
	@Transactional
	public List<?> buscarVariacionesEmpresa(String date, Date fechaDesde, Date fechaHasta, String tipoVariacion) {
		Date fd = java.sql.Date.valueOf("2000-01-31");
		Date fh = java.sql.Date.valueOf("2020-01-31");
		String dato = "me";
		return variacionesDao.buscarVariacionesEmpresa(fd, fh, dato, tipoVariacion);
	}

}
