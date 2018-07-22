/**
 * 
 */
package com.test.web.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.web.api.dao.IRolDao;
import com.test.web.api.entity.Rol;

/**
 * @author RONALD
 *
 */
@Service
public class RolService implements IRolService 
{
	@Autowired
	private IRolDao _rolDao;
	
	@Override
	@Transactional(readOnly=true)
	public Rol findById(Long id) {
		return _rolDao.findById(id).orElse(null);
	}
}