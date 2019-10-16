package com.unaj.proyectofinal.backend.apirest.controller;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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

import com.unaj.proyectofinal.backend.apirest.models.entity.Usuario;
import com.unaj.proyectofinal.backend.apirest.models.service.IUsuarioService;

@CrossOrigin(origins = { "*" })

@RestController
@RequestMapping("/api")
public class UsuarioRestController {

	@Autowired
	private IUsuarioService usuarioService;
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	@PersistenceContext
	private EntityManager entityManager;

	@Secured({ "ROLE_ADMIN" })
	@GetMapping("/usuarios")
	public List<Usuario> index() {
		return usuarioService.findAll();
	}

	@Secured({ "ROLE_ADMIN" })
	@GetMapping("/usuarios/{id}")
	public Usuario show(@PathVariable Long id) {
		return usuarioService.findById(id);
	}
	
	@Secured({ "ROLE_ADMIN" })
	@GetMapping("/usuarios/nombreusuario")
	public Usuario findByUsername(@RequestParam String nombreUsuario) {
		return usuarioService.findByUsername(nombreUsuario);
	}

	@Secured("ROLE_ADMIN")
	@PostMapping("/usuarios")
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@RequestBody Usuario usuario, @RequestParam int role) {
		System.out.println("hola");
		System.out.println(usuario);
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

	@Secured("ROLE_ADMIN")
	@DeleteMapping("usuarios/{id}")
	public void delete(@PathVariable Long id) {
		usuarioService.deleteRoleByIdUsuario(id);
		usuarioService.delete(id);
	}
	
	@Secured("ROLE_ADMIN")
	@GetMapping("usuarios/historial/delete")
	public void deleteRegistroHistorial(@RequestParam String tipo,
										@RequestParam String idUsuario,
										@RequestParam Date fecha,
										@RequestParam String desc) {
		usuarioService.deleteRegistroHistorial(tipo, idUsuario, fecha , desc);
	}

	@Secured({ "ROLE_ADMIN", "ROLE_USER" })
	@GetMapping("/usuarios/historial")
	public List<?> historial(@RequestParam String nombreUsuario) {
		return usuarioService.historial(nombreUsuario);
	}
	
	

}
