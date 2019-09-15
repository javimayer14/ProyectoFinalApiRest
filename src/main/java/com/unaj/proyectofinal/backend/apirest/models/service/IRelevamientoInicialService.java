package com.unaj.proyectofinal.backend.apirest.models.service;

import com.unaj.proyectofinal.backend.apirest.models.entity.RelevamientoInicial;

public interface IRelevamientoInicialService {
	
		public RelevamientoInicial save(RelevamientoInicial relevamientoInicial) ;
		
		public RelevamientoInicial findByIdUser(Long id) ;

		
}
