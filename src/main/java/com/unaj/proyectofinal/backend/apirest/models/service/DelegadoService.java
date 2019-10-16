package com.unaj.proyectofinal.backend.apirest.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.unaj.proyectofinal.backend.apirest.models.dao.IDelegadoDao;
import com.unaj.proyectofinal.backend.apirest.models.entity.Delegado;
@Service
public class DelegadoService implements IDelegadoService{

	@Autowired
	private IDelegadoDao delegadoDao;
	@Transactional(readOnly=true)
	public List<Delegado> findAll() {
		// TODO Auto-generated method stub
		return (List<Delegado>) delegadoDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Delegado findById(Long id) {
		// TODO Auto-generated method stub
		return delegadoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Delegado save(Delegado delegado) {
		// TODO Auto-generated method stub
		return delegadoDao.save(delegado);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		delegadoDao.deleteById(id);
	}



}
