/**
 * 
 */
package com.test.web.api.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author RONALD
 *
 */
@Entity
@Table(name="rol")
public class Rol implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false)
	private String codigo;
	
	@Column(nullable=false)
	private String nombre;
	
	@OneToMany(mappedBy="rolData", fetch=FetchType.LAZY)
	@JsonIgnore
	private List<Usuario> lUsuario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Usuario> getlUsuario() {
		return lUsuario;
	}

	public void setlUsuario(List<Usuario> lUsuario) {
		this.lUsuario = lUsuario;
	}
}