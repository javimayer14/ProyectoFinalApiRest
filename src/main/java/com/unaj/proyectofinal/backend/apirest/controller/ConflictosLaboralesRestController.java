package com.unaj.proyectofinal.backend.apirest.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.unaj.proyectofinal.backend.apirest.models.entity.ConflictosLaborales;

import com.unaj.proyectofinal.backend.apirest.models.service.IConflictosLaboralesService;
@CrossOrigin(origins={"http://localhost:8100","http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ConflictosLaboralesRestController {
	@Autowired
	private IConflictosLaboralesService conflictosService;
	
	@GetMapping("/conflictosLaborales")
	public List<ConflictosLaborales> index(){
		return conflictosService.findAll();
		
	}
	
	@GetMapping("/conflictosLaborales/{id}")
	public ConflictosLaborales show(@PathVariable Long id) {
		return conflictosService.findById(id);
	}
	
	@PostMapping("/conflictosLaborales")
	@ResponseStatus(HttpStatus.CREATED)
	public ConflictosLaborales create (@RequestBody ConflictosLaborales conflictosLaborales) {
		return conflictosService.save(conflictosLaborales);
	}
	@PutMapping("conflictosLaborales/{id}")
	public ConflictosLaborales update(@RequestBody ConflictosLaborales conflictosLaborales, @PathVariable Long id) {
		ConflictosLaborales conflictosActual =  conflictosService.findById(id);
		
		conflictosActual.setDescripcion(conflictosLaborales.getDescripcion());
		
		return conflictosService.save(conflictosLaborales);
		
		
	}
	@DeleteMapping("conflictosLaborales/{id}")
	public void delete (@PathVariable Long id) {
		conflictosService.delete(id);
	}
	
	@GetMapping("conflictos/busqueda")
	public List buscarConflictoLaboral(@RequestParam String tipoBusqueda, @RequestParam String descripcionBusqueda,@RequestParam Date fechaDesde,@RequestParam Date fechaHasta) {
		return conflictosService.buscarConflictoLaboralUsuario(descripcionBusqueda, fechaDesde, fechaHasta );
		//return conflictosService.buscarConflictoLaboralEmpresa();
		//return conflictosService.buscarConflictoLaboralEcho();
	}

}
