package com.unaj.proyectofinal.backend.apirest.models.service;

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

}
