/**
 * 
 */
package com.test.web.api.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author RONALD
 *
 */
@Entity
@Table(name="modulo")
public class Modulo implements Serializable
{	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false)
	private String codigo;
	
	@Column(nullable=false)
	private String nombre;
	
	@Column(name="ultimo_cambio",nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date ultimoCambio;

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

	public Date getUltimoCambio() {
		return ultimoCambio;
	}

	public void setUltimoCambio(Date ultimoCambio) {
		this.ultimoCambio = ultimoCambio;
	}
}