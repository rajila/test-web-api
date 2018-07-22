/**
 * 
 */
package com.test.web.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.web.api.dao.IModuloDao;
import com.test.web.api.entity.Modulo;

/**
 * @author RONALD
 *
 */
@Service
public class ModuloService implements IModuloService 
{
	@Autowired
	private IModuloDao _moduloDao;
	
	@Override
	@Transactional(readOnly=true)
	public Modulo findById(Long id) {
		return _moduloDao.findById(id).orElse(null);
	}
}