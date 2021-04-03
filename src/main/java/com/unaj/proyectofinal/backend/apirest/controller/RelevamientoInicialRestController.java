package com.unaj.proyectofinal.backend.apirest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.unaj.proyectofinal.backend.apirest.models.entity.RelevamientoInicial;
import com.unaj.proyectofinal.backend.apirest.models.service.IRelevamientoInicialService;

@CrossOrigin(origins = { "*" })
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
	public RelevamientoInicial findByIdUser(@RequestParam Long idUser) {
		return relevamientoService.findByIdUser(idUser);
	}

	@Secured({ "ROLE_ADMIN", "ROLE_USER" })
	@PutMapping("/relevamientoInicial/user/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public RelevamientoInicial update(@RequestBody RelevamientoInicial relevamientoInicial, @PathVariable Long id) {
		RelevamientoInicial relevamientoActual = relevamientoService.findByIdUser(id);

		if (relevamientoActual == null) {
			ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
			return relevamientoActual;
		}
		relevamientoActual.setCant_agencia(relevamientoInicial.getCant_agencia());
		relevamientoActual.setCant_agencia_uom(relevamientoActual.getCant_agencia_uom());
		relevamientoActual.setCant_contratos_temporarios(relevamientoInicial.getCant_contratos_temporarios());
		relevamientoActual.setCant_contratos_temporarios_uom((relevamientoInicial.getCant_contratos_temporarios_uom()));
		relevamientoActual.setCant_directos(relevamientoInicial.getCant_directos());
		relevamientoActual.setCant_directos_uom(relevamientoInicial.getCant_directos_uom());
		relevamientoActual.setCant_jubilados(relevamientoInicial.getCant_jubilados());
		relevamientoActual.setCant_jubilados_uom(relevamientoInicial.getCant_jubilados_uom());
		relevamientoActual.setCant_monotributistas(relevamientoInicial.getCant_monotributistas());
		relevamientoActual.setCant_monotributistas_uom(relevamientoInicial.getCant_monotributistas_uom());
		relevamientoActual.setCant_no_registrados(relevamientoInicial.getCant_no_registrados());
		relevamientoActual.setCant_no_registrados_uom(relevamientoInicial.getCant_no_registrados_uom());
		relevamientoInicial.setCant_pasantias_becas(relevamientoInicial.getCant_pasantias_becas());
		relevamientoInicial.setCant_pasantias_becas_uom(relevamientoInicial.getCant_pasantias_becas_uom());
		relevamientoInicial.setCant_personas_discapacidad(relevamientoInicial.getCant_personas_discapacidad());
		relevamientoInicial.setCant_personas_discapacidad_uom(relevamientoInicial.getCant_personas_discapacidad_uom());
		relevamientoActual.setCant_subcontratados(relevamientoInicial.getCant_subcontratados());
		relevamientoActual.setCant_subcontratados_uom(relevamientoInicial.getCant_subcontratados_uom());
		relevamientoActual.setCant_subvencionados(relevamientoInicial.getCant_subvencionados());
		relevamientoActual.setCant_subvencionados_uom(relevamientoInicial.getCant_subvencionados_uom());

		return relevamientoService.save(relevamientoInicial);
	}
}
