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

import com.test.web.api.service.IModuloService;
import com.test.web.api.service.IRolService;
import com.test.web.api.service.IUsuarioService;
import com.test.web.api.entity.Usuario;
import com.test.web.api.entitymanager.UsuarioManager;

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
	
	@Autowired
	private IRolService _rolService;
	
	@Autowired
	private IModuloService _moduloService;
	
	@GetMapping("/usuarios")
	public List<Usuario> getUsuarios()
	{
		return _usuarioService.findAll();
	}
	
	@PostMapping("/usuario/crear")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario guardar(@RequestBody UsuarioManager data)
	{	
		Usuario _data = new Usuario();
		_data.setUltimoCambio(new Date());
		_data.setActivo(data.isActivo());
		_data.setApellido(data.getApellido());
		_data.setCorreo(data.getCorreo());
		_data.setNombre(data.getNombre());
		_data.setPassword(data.getPassword());
		_data.setUsuario(data.getUsuario());
		
		_data.setModuloData(_moduloService.findById(data.getModulo_default_id()));
		_data.setRolData(_rolService.findById(data.getRol_default_id()));
		
		return _usuarioService.guardar(_data);
	}
}