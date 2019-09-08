package com.unaj.proyectofinal.backend.apirest.models.service;

import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.unaj.proyectofinal.backend.apirest.models.dao.IUsuarioDao;
import com.unaj.proyectofinal.backend.apirest.models.entity.Usuario;

@Service
public class UsuarioService implements UserDetailsService, IUsuarioService {

	private Logger logger = LoggerFactory.getLogger(UsuarioService.class);
	@Autowired
	private IUsuarioDao usuarioDao;

	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = usuarioDao.findByUsername(username);

		if (usuario == null) {
			logger.error("eerror no existe el usuario '" + username + " en el sistema !'");
			throw new UsernameNotFoundException("Error en el login: no existe el usuario:'" + username + "'");
		}

		List<GrantedAuthority> authorities = usuario.getRoles().stream()
				.map(role -> new SimpleGrantedAuthority(role.getNombre()))
				.peek(authority -> logger.info("Role" + authority.getAuthority())).collect(Collectors.toList());

		return new User(usuario.getUsername(), usuario.getPassword(), usuario.getEnabled(), true, true, true,
				authorities);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return (List<Usuario>) usuarioDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Usuario findById(Long id) {
		// TODO Auto-generated method stub
		return usuarioDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void save(Usuario usuario, int role) {
		// TODO Auto-generated method stub
		usuarioDao.save(usuario);
		Usuario usuarioinsertadoUltimo = usuarioDao.findByUsername(usuario.getUsername());
		usuarioDao.saveUsuarioRole(usuarioinsertadoUltimo.getId(), role);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		usuarioDao.deleteById(id);

	}

	@Override
	@Transactional
	public void deleteRoleByIdUsuario(Long id) {
		// TODO Auto-generated method stub
		usuarioDao.deleteRoleByIdUsuario(id);

	}

	@Override
	public void save(Usuario usuario) {
		// TODO Auto-generated method stub

	}

	@Override
	public Usuario findByUsername(String username) {
		return usuarioDao.findByUsername(username);
	}

	@Override
	@Transactional
	public List<?> historial(String nombreUsusario) {
		Usuario usuario = usuarioDao.findByUsername(nombreUsusario);
		return usuarioDao.historial(usuario.getId());
	}
	

	@Override
	@Transactional
	public void deleteRegistroHistorial(String tipo, String idUsuario, Date fecha, String desc) {
		
		if(Integer.parseInt(tipo)== 3) {
			usuarioDao.deleteVariacion(idUsuario, fecha, desc);
		}
		else if (Integer.parseInt(tipo)== 2){
			usuarioDao.deleteCambio(idUsuario, fecha, desc);
		}  
		else if (Integer.parseInt(tipo)== 1) {
			System.out.println(tipo.toString());
			System.out.println(fecha.toString());
			System.out.println(idUsuario.toString());
			System.out.println(desc.toString());

			
			usuarioDao.deleteConflicto(idUsuario, fecha, desc); 
		}
		
	}

}
