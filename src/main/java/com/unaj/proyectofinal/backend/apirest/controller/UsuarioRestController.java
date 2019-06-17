package com.unaj.proyectofinal.backend.apirest.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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

import com.unaj.proyectofinal.backend.apirest.ProyectofinalBackendApirestApplication;
import com.unaj.proyectofinal.backend.apirest.models.entity.Delegado;
import com.unaj.proyectofinal.backend.apirest.models.entity.Usuario;
import com.unaj.proyectofinal.backend.apirest.models.service.IUsuarioService;
import com.unaj.proyectofinal.backend.apirest.models.service.UsuarioService;

@CrossOrigin(origins={"http://localhost:8100","http://localhost:4200"})

@RestController
@RequestMapping("/api")
public class UsuarioRestController {
	private Logger logger = LoggerFactory.getLogger(UsuarioService.class);
	@Autowired
	private IUsuarioService usuarioService;
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	 @PersistenceContext
	    private EntityManager entityManager;
	 
	 @Secured({"ROLE_ADMIN"})
	@GetMapping("/usuarios")
	public List<Usuario> index(){
		return usuarioService.findAll();
	}
	
	@Secured({"ROLE_ADMIN"})
	@GetMapping("/usuarios/{id}")
	public Usuario show(@PathVariable Long id) {
		return usuarioService.findById(id);
	}
	
	@Secured("ROLE_ADMIN")
	@PostMapping("/usuarios")
	@ResponseStatus(HttpStatus.CREATED)
	public void create (@RequestBody Usuario usuario,@RequestParam int role) {
		String passwordBcrypt = passwordEncoder.encode(usuario.getPassword());
		usuario.setPassword(passwordBcrypt);
		usuarioService.save(usuario, role);
	}
	
	@Secured("ROLE_ADMIN")
	@PutMapping("usuarios/{id}")
	public void update(@RequestBody Usuario usuario, @PathVariable Long id) {
		Usuario usuarioActual = usuarioService.findById(id);
		
		usuarioActual.setApellidoUsuario(usuario.getApellidoUsuario());
		usuarioActual.setNombreUsuario(usuario.getNombreUsuario());
		
		 usuarioService.save(usuarioActual);
		
		
	}
	

}
