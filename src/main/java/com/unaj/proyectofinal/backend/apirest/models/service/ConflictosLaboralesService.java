package com.unaj.proyectofinal.backend.apirest.models.service;


import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.unaj.proyectofinal.backend.apirest.models.dao.IConflictosLaboralesDao;
import com.unaj.proyectofinal.backend.apirest.models.entity.ConflictosLaborales;

@Service
public class ConflictosLaboralesService implements IConflictosLaboralesService{

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
	public List buscarConflictoLaboralUsuario() {
		Date fd = java.sql.Date.valueOf( "2000-01-31" );
		Date fh = java.sql.Date.valueOf( "2020-01-31" );
		String dato  = "pe";
		return conflictosDao.buscarConflictoLaboralUsuario(fd,fh,dato);
	}

	@Override
	@Transactional
	public List buscarConflictoLaboralEmpresa() {
		// TODO Auto-generated method stub
		Date fd = java.sql.Date.valueOf( "2000-01-31" );
		Date fh = java.sql.Date.valueOf( "2020-01-31" );
		String dato  = "me";
		return conflictosDao.buscarConflictoLaboralEmpresa(fd, fh,dato);
	}

//	@Override
//	@Transactional
//	public List buscarConflictoLaboralEcho() {
//		Date fd = java.sql.Date.valueOf( "2000-01-31" );
//		Date fh = java.sql.Date.valueOf( "2020-01-31" );
//		String dato  = "ba";
//		return conflictosDao.buscarConflictoLaboralHecho(fd, fh, dato);
//	}

}
