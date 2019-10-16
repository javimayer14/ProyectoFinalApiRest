package com.unaj.proyectofinal.backend.apirest.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.unaj.proyectofinal.backend.apirest.models.dao.IEmpresaDao;
import com.unaj.proyectofinal.backend.apirest.models.entity.Empresa;
@Service
public class EmpresaService implements IEmpresaService{
	@Autowired
	private IEmpresaDao empresaDao;
	@Override
	@Transactional
	public List<Empresa> findAll() {
		// TODO Auto-generated method stub
		return (List<Empresa>) empresaDao.findAll();
	}

	@Override
	@Transactional
	public Empresa findById(Long id) {
		// TODO Auto-generated method stub
		return empresaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Empresa save(Empresa empresa) {
		// TODO Auto-generated method stub
		return empresaDao.save(empresa);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		empresaDao.deleteById(id);
		
	}

}
