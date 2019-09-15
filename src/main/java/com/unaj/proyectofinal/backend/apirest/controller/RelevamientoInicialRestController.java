package com.unaj.proyectofinal.backend.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.unaj.proyectofinal.backend.apirest.models.entity.CambioCondiciones;
import com.unaj.proyectofinal.backend.apirest.models.entity.RelevamientoInicial;
import com.unaj.proyectofinal.backend.apirest.models.service.ICambioCondicionService;
import com.unaj.proyectofinal.backend.apirest.models.service.IRelevamientoInicialService;

@CrossOrigin(origins = { "http://localhost:8100", "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class RelevamientoInicialRestController {
	
	@Autowired
	private IRelevamientoInicialService relevamientoService;
	
	@Secured({ "ROLE_ADMIN", "ROLE_USER" })
	@PostMapping("/relevamientoInicial")
	@ResponseStatus(HttpStatus.CREATED)
	public RelevamientoInicial create(@RequestBody RelevamientoInicial relevamientoInicial) {
		return relevamientoService.save(relevamientoInicial);
	}
	
	
	@GetMapping("/relevamientoInicialUsuario")
	public RelevamientoInicial findByIdUser(@RequestParam Long  idUser) {
		return relevamientoService.findByIdUser(idUser);
	}
}
