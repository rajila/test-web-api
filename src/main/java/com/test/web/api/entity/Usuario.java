package com.test.web.api.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author RONALD
 *
 */
@Entity
@Table(name="usuario")
public class Usuario implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false)
	private String nombre;
	
	@Column(nullable=false)
	private String apellido;
	
	@Column(nullable=false)
	private String usuario;
	
	@Column(nullable=false)
	private String password;
	
	@Column(nullable=false)
	private String correo;
	
	@Column(nullable=false)
	private boolean activo;
	
	@Column(name="ultimo_cambio", nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date ultimoCambio;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="rol_default_id",nullable=true)
	@JsonIgnoreProperties({"handler", "hibernateLazyInitializer"})
	private Rol rolData;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="modulo_default_id",nullable=false)
	@JsonIgnoreProperties({"handler", "hibernateLazyInitializer"})
	private Modulo moduloData;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Date getUltimoCambio() {
		return ultimoCambio;
	}

	public void setUltimoCambio(Date ultimoCambio) {
		this.ultimoCambio = ultimoCambio;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public Rol getRolData() {
		return rolData;
	}

	public void setRolData(Rol rolData) {
		this.rolData = rolData;
	}

	public Modulo getModuloData() {
		return moduloData;
	}

	public void setModuloData(Modulo moduloData) {
		this.moduloData = moduloData;
	}
}