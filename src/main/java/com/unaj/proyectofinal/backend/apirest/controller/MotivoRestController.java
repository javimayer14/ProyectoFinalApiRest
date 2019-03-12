package com.unaj.proyectofinal.backend.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.unaj.proyectofinal.backend.apirest.models.entity.Motivo;
import com.unaj.proyectofinal.backend.apirest.models.service.IMotivoService;

@RestController
@RequestMapping("/api")
public class MotivoRestController {

	@Autowired
	private IMotivoService motivoService;
	
	@GetMapping("/motivos")
	public List<Motivo> index(){
		return motivoService.findAll();
		
	}
	
	@GetMapping("/motivos/{id}")
	public Motivo show(@PathVariable Long id) {
		return motivoService.findById(id);
	}
	
	@PostMapping("/motivos")
	@ResponseStatus(HttpStatus.CREATED)
	public Motivo create (@RequestBody Motivo motivo) {
		return motivoService.save(motivo);
	}
	@DeleteMapping("motivos/{id}")
	public void delete (@PathVariable Long id) {
		motivoService.delete(id);
	}
}
