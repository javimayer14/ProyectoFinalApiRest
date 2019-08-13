package com.unaj.proyectofinal.backend.apirest.models.dao;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.unaj.proyectofinal.backend.apirest.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {

	public Usuario findByUsername(String username);

	@Modifying
	@Query(value = "INSERT INTO usuarios_roles (usuario_id, roles_id) VALUES (:idUsuario , :role)", nativeQuery = true)
	@Transactional
	public void saveUsuarioRole(@Param("idUsuario") Long idUsuario, @Param("role") int role);

	@Modifying
	@Query(value = "DELETE FROM usuarios_roles  WHERE usuario_id = :idUsuario ", nativeQuery = true)
	@Transactional
	public void deleteRoleByIdUsuario(@Param("idUsuario") Long idUsuario);

}
