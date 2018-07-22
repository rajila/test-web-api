package com.test.web.api.dao;

import org.springframework.data.repository.CrudRepository;
import com.test.web.api.entity.Usuario;

/**
 * @author RONALD
 *
 */
public interface IUsuarioDao extends CrudRepository<Usuario, Long>
{}