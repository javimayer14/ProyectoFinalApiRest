package com.unaj.proyectofinal.backend.apirest.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.unaj.proyectofinal.backend.apirest.models.dao.IVariacionesDao;
import com.unaj.proyectofinal.backend.apirest.models.entity.Variaciones;
@Service
public class VariacionesService implements IVariacionesService{
	
	@Autowired
	private IVariacionesDao variacionesDao;
	@Override
	@Transactional
	public List<Variaciones> findAll() {
		return (List<Variaciones>) variacionesDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Variaciones findById(Long id) {
		// TODO Auto-generated method stub
		return variacionesDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Variaciones save(Variaciones variacion) {
		// TODO Auto-generated method stub
		return variacionesDao.save(variacion);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		variacionesDao.deleteById(id);
		
	}

}
