/**
 * 
 */
package com.test.web.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.web.api.dao.IUsuarioDao;
import com.test.web.api.entity.Usuario;

/**
 * @author RONALD
 *
 */
@Service
public class UsuarioService implements IUsuarioService 
{
	@Autowired
	private IUsuarioDao _usuarioDao;
	
	/* (non-Javadoc)
	 * @see com.test.web.api.service.IUsuarioService#findAll()
	 */
	@Override
	@Transactional(readOnly=true)
	public List<Usuario> findAll() {
		return (List<Usuario>)_usuarioDao.findAll();
	}

	@Override
	@Transactional
	public Usuario guardar(Usuario data) {
		return _usuarioDao.save(data);
	}
}