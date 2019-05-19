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

import com.unaj.proyectofinal.backend.apirest.models.entity.CambioCondiciones;
import com.unaj.proyectofinal.backend.apirest.models.entity.Delegado;
import com.unaj.proyectofinal.backend.apirest.models.service.CambioCondicionService;
import com.unaj.proyectofinal.backend.apirest.models.service.ICambioCondicionService;
@CrossOrigin(origins={"http://localhost:8100","http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class CambioCondicionRestController {
	
	@Autowired
	private ICambioCondicionService cambioCondicion;
	
	
	@GetMapping("/cambioCondiciones")
	public List<CambioCondiciones> index(){
		return cambioCondicion.findAll();
		
	}
	
	@GetMapping("/cambioCondiciones/{id}")
	public CambioCondiciones show(@PathVariable Long id) {
		return cambioCondicion.findById(id);
	}
	
	@PostMapping("/cambioCondiciones")
	@ResponseStatus(HttpStatus.CREATED)
	public CambioCondiciones create (@RequestBody CambioCondiciones cambioCondicioes) {
		return cambioCondicion.save(cambioCondicioes);
	}
	
	@DeleteMapping("cambioCondiciones/{id}")
	public void delete (@PathVariable Long id) {
		cambioCondicion.delete(id);
	}
	
	@GetMapping("cambioCondiciones/busqueda")
	public List buscarConflictoLaboral(@RequestParam String tipoBusqueda, @RequestParam String descripcionBusqueda,@RequestParam Date fechaDesde,@RequestParam Date fechaHasta) {
		return cambioCondicion.buscarCambioCondicionUsuario(descripcionBusqueda, fechaDesde, fechaHasta);
		//return cambioCondicion.buscarCambioCondicionEmpresa(descripcionBusqueda, fechaDesde, fechaHasta );
	}

}
