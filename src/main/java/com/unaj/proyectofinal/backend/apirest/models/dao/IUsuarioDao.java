package com.unaj.proyectofinal.backend.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.unaj.proyectofinal.backend.apirest.models.entity.Role;
import com.unaj.proyectofinal.backend.apirest.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario,Long>{
	
	
	public Usuario findByUsername (String username);
	
	
	
	@Modifying
    @Query(value = "INSERT INTO usuarios_roles (usuario_id, roles_id) VALUES (:idUsuario , :role)", nativeQuery = true)
    @Transactional
    public void saveUsuarioRole (@Param("idUsuario") Long idUsuario, @Param("role") int role);
	
 //   void logURI(@Param("insertLink") String insertLink, @Param("id") Long id);
//	@Query("INSERT INTO usuarios_roles (usuarios_roles, roles_id) VALUES (4,4)")
//	public Usuario saveUsuarioRole ();
	
}
