package com.unaj.proyectofinal.backend.apirest.models.service;

import java.sql.Date;
import java.util.List;

import com.unaj.proyectofinal.backend.apirest.models.entity.Usuario;

public interface IUsuarioService {

	public List<Usuario> findAll();

	public Usuario findById(Long id);

	public void save(Usuario usuario);

	public void delete(Long id);

	public void save(Usuario usuario, int role);

	public Usuario findByUsername(String username);

	void deleteRoleByIdUsuario(Long id);

	public List<?> historial(String nombreUsuario);

//	void deleteRegistroHistorial(String tipo, String idUsuario, String fecha, String desc);

	void deleteRegistroHistorial(String tipo, String idUsuario, Date fecha, String desc);
}
