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

import com.unaj.proyectofinal.backend.apirest.models.entity.Delegado;
import com.unaj.proyectofinal.backend.apirest.models.service.IDelegadoService;

@RestController
@RequestMapping("/api")
public class DelegadoRestController {
		@Autowired
		private IDelegadoService delegadoService;
		
		@GetMapping("/delegados")
		public List<Delegado> index(){
			return delegadoService.findAll();
			
		}
		
		@GetMapping("/delegados/{id}")
		public Delegado show(@PathVariable Long id) {
			return delegadoService.findById(id);
		}
		
		@PostMapping("/delegados")
		@ResponseStatus(HttpStatus.CREATED)
		public Delegado create (@RequestBody Delegado delegado) {
			return delegadoService.save(delegado);
		}
		
		@PutMapping("delegados/{id}")
		public Delegado update(@RequestBody Delegado delegado, @PathVariable Long id) {
			Delegado delegadoActual = delegadoService.findById(id);
			
			delegadoActual.setApellido(delegado.getApellido());
			delegadoActual.setNombre(delegado.getNombre());
			
			return delegadoService.save(delegadoActual);
			
			
		}
		
		@DeleteMapping("delegados/{id}")
		public void delete (@PathVariable Long id) {
			delegadoService.delete(id);
		}
}
