package com.unaj.proyectofinal.backend.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.unaj.proyectofinal.backend.apirest.models.entity.Empresa;
import com.unaj.proyectofinal.backend.apirest.models.service.IEmpresaService;
@RestController
@RequestMapping("/api")
public class EmpresaRestController {
	@Autowired
	private IEmpresaService empresaService;
	
	@GetMapping("/empresas")
	public List<Empresa> index(){
		return empresaService.findAll();
		
	}
	@GetMapping("/empresas/{id}")
	public Empresa show(@PathVariable Long id) {
		return empresaService.findById(id);
	}
	
	@PostMapping("/empresas")
	@ResponseStatus(HttpStatus.CREATED)
	public Empresa create (@RequestBody Empresa empresa) {
		return empresaService.save(empresa);
	}
	

	
	@DeleteMapping("empresas/{id}")
	public void delete (@PathVariable Long id) {
		empresaService.delete(id);
	}

}
