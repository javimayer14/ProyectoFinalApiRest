package com.unaj.proyectofinal.backend.apirest.models.dao;

import java.sql.Date;
import java.util.List;

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
	
	@Modifying 
	@Query(value = "SELECT * FROM historial WHERE id_usuario = :idUsuario ORDER BY fecha desc; ", nativeQuery = true)
	@Transactional
	public List<?> historial(@Param("idUsuario") Long idUsuario);
	
	@Modifying
	@Query(value = "DELETE FROM cambio_laboral cl WHERE cl.id_usuario = :idUsuario AND\n" + 
			"									cl.fecha = :fecha AND\n" + 
			"									cl.descripcion = :desc ", nativeQuery = true)
	@Transactional
	public void deleteCambio(@Param("idUsuario") String idUsuario,@Param("fecha") Date fecha,@Param("desc") String desc);
	
	@Modifying
	@Query(value = "DELETE FROM conflicto_laboral conf WHERE conf.id_usuario = :idUsuario AND conf.fecha= :fecha AND conf.descripcion= :desc ;", nativeQuery = true)
	@Transactional
	public void deleteConflicto(@Param("idUsuario") String idUsuario,@Param("fecha") Date fecha,@Param("desc") String desc);

	
	@Modifying
	@Query(value = "DELETE FROM variacion_laboral var WHERE var.id_usuario = :idUsuario AND\n" + 
			"										var.fecha= :fecha AND\n" + 
			"                                        var.descripcion = :desc", nativeQuery = true)
	@Transactional
	public void deleteVariacion(@Param("idUsuario") String idUsuario,@Param("fecha") Date fecha,@Param("desc") String desc);

	
}
