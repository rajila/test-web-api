/**
 * 
 */
package com.test.web.api.entitymanager;

import com.test.web.api.entity.Usuario;

/**
 * @author RONALD
 *
 */
public class UsuarioManager extends Usuario
{
	private static final long serialVersionUID = 1L;
	
	private Long rol_default_id;
	
	private Long modulo_default_id;

	public Long getRol_default_id() {
		return rol_default_id;
	}

	public void setRol_default_id(Long rol_default_id) {
		this.rol_default_id = rol_default_id;
	}

	public Long getModulo_default_id() {
		return modulo_default_id;
	}

	public void setModulo_default_id(Long modulo_default_id) {
		this.modulo_default_id = modulo_default_id;
	}
}