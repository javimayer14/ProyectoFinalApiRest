package com.unaj.proyectofinal.backend.apirest.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unaj.proyectofinal.backend.apirest.models.dao.IRelevamientoInicialDao;
import com.unaj.proyectofinal.backend.apirest.models.dao.IVariacionesDao;
import com.unaj.proyectofinal.backend.apirest.models.entity.RelevamientoInicial;

@Service
public class RelevamientoInicialService implements IRelevamientoInicialService {

	@Autowired
	private IRelevamientoInicialDao relevamientoDao;

	@Override
	public RelevamientoInicial save(RelevamientoInicial relevamientoInicial) {
		return relevamientoDao.save(relevamientoInicial);
		
	}
}
