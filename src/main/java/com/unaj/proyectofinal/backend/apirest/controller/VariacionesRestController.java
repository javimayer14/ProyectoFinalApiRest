package com.unaj.proyectofinal.backend.apirest.controller;


import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.unaj.proyectofinal.backend.apirest.models.entity.Delegado;
import com.unaj.proyectofinal.backend.apirest.models.entity.Variaciones;
import com.unaj.proyectofinal.backend.apirest.models.service.IDelegadoService;
import com.unaj.proyectofinal.backend.apirest.models.service.IVariacionesService;

@CrossOrigin(origins={"http://localhost:8100","http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class VariacionesRestController {
	
	@Autowired
	private IVariacionesService variacionesService;
	
	@GetMapping("/variaciones")
	public List<Variaciones> index(){
		return variacionesService.findAll();
		
	}
	
	@PostMapping("/variaciones")
	@ResponseStatus(HttpStatus.CREATED)
	public Variaciones create (@RequestBody Variaciones variacion) {
		return variacionesService.save(variacion);
	}
	
	@PutMapping("variaciones/{id}")
	public Variaciones update(@RequestBody Variaciones variaciones, @PathVariable Long id) {
		Variaciones variacionActual = variacionesService.findById(id);
		
		variacionActual.setDescripcion(variaciones.getDescripcion());
		variacionActual.setId_tipo_contrato(variaciones.getId_tipo_contrato());
		
		return variacionesService.save(variaciones);
		
		
	}
	
	@GetMapping("variaciones/busqueda")
	@ResponseBody()
	public List buscarVariacionLaboral(@RequestParam String tipoBusqueda, @RequestParam String descripcionBusqueda,@RequestParam Date fechaDesde,@RequestParam Date fechaHasta) {
		
			return variacionesService.buscarVariacionesUsuario(descripcionBusqueda, fechaDesde, fechaHasta );
		
			//return variacionesService.buscarVariacionesEmpresa(descripcionBusqueda, fechaDesde, fechaHasta);
		
		
	}
	
}
