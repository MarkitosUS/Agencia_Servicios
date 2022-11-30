package com.registro.usuarios.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.registro.usuarios.controlador.dto.UsuarioRegistroDTO;
import com.registro.usuarios.modelo.Usuario;

public interface UsuarioServicio extends UserDetailsService{


	public Usuario guardar(UsuarioRegistroDTO registroDTO);

	public List<Usuario> listarUsuarios();


	Optional<Usuario> listarId(int id);

	void delete(int id);
}