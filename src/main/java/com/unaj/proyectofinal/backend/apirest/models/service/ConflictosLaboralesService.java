package com.unaj.proyectofinal.backend.apirest.models.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.unaj.proyectofinal.backend.apirest.models.dao.IConflictosLaboralesDao;
import com.unaj.proyectofinal.backend.apirest.models.entity.ConflictosLaborales;

@Service
public class ConflictosLaboralesService implements IConflictosLaboralesService {

	@Autowired
	private IConflictosLaboralesDao conflictosDao;

	@Override
	@Transactional
	public List<ConflictosLaborales> findAll() {
		// TODO Auto-generated method stub
		return (List<ConflictosLaborales>) conflictosDao.findAll();
	}

	@Override
	@Transactional
	public ConflictosLaborales findById(Long id) {
		// TODO Auto-generated method stub
		return conflictosDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public ConflictosLaborales save(ConflictosLaborales conflictosLaborales) {
		// TODO Auto-generated method stub
		return conflictosDao.save(conflictosLaborales);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		conflictosDao.deleteById(id);

	}

	@Override
	@Transactional
	public List<?> buscarConflictoLaboralUsuario(String date, Date fechaDesde, Date fechaHasta) {

		return conflictosDao.buscarConflictoLaboralUsuario(fechaDesde, fechaHasta, date);
	}

	@Override
	@Transactional
	public List<?> buscarConflictoLaboralEmpresa(String date, Date fechaDesde, Date fechaHasta) {
		// TODO Auto-generated method stub

		return conflictosDao.buscarConflictoLaboralEmpresa(fechaDesde, fechaHasta, date);
	}

}
