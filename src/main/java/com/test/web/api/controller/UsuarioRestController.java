/**
 * 
 */
package com.test.web.api.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.test.web.api.service.IUsuarioService;
import com.test.web.api.entity.Usuario;

/**
 * @author RONALD
 *
 */
@RestController
@RequestMapping("/api")
public class UsuarioRestController
{
	@Autowired
	private IUsuarioService _usuarioService;
	
	@GetMapping("/usuarios")
	public List<Usuario> getUsuarios()
	{
		return _usuarioService.findAll();
	}
	
	@PostMapping("/usuario/crear")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario guardar(@RequestBody Usuario data)
	{	
		data.setUltimoCambio(new Date());
		return _usuarioService.guardar(data);
	}
}