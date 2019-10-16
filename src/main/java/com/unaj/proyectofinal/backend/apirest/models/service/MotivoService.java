package com.unaj.proyectofinal.backend.apirest.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.unaj.proyectofinal.backend.apirest.models.dao.IMotivoDao;
import com.unaj.proyectofinal.backend.apirest.models.entity.Motivo;
@Service
public class MotivoService implements IMotivoService {
	
	@Autowired
	private IMotivoDao motivoDao;
	@Override
	@Transactional
	public List<Motivo> findAll() {
		return (List<Motivo>) motivoDao.findAll();
	}

	@Override
	@Transactional
	public Motivo findById(Long id) {
		return motivoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Motivo save(Motivo motivo) {
		return motivoDao.save(motivo);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		motivoDao.deleteById(id);
		
	}

}
