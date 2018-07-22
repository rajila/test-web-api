/**
 * 
 */
package com.test.web.api.service;

import java.util.List;
import com.test.web.api.entity.Usuario;

/**
 * @author RONALD
 *
 */
public interface IUsuarioService 
{
	public List<Usuario> findAll();
	public Usuario guardar(Usuario data);
}