package com.app.spring.orm.SpringORMMyibatis;

import java.util.Date;

public class User {

	private int id_user;
	private String nombre_user;
	private String rut_user;
	private String email_user;
	private Date fecha_registro;
	private int flag_habilitado;
	
	
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public String getNombre_user() {
		return nombre_user;
	}
	public void setNombre_user(String nombre_user) {
		this.nombre_user = nombre_user;
	}
	public String getRut_user() {
		return rut_user;
	}
	public void setRut_user(String rut_user) {
		this.rut_user = rut_user;
	}
	public String getEmail_user() {
		return email_user;
	}
	public void setEmail_user(String email_user) {
		this.email_user = email_user;
	}
	public Date getFecha_registro() {
		return fecha_registro;
	}
	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}
	public int getFlag_habilitado() {
		return flag_habilitado;
	}
	public void setFlag_habilitado(int flag_habilitado) {
		this.flag_habilitado = flag_habilitado;
	}
	
	public User() {
		
	}
}
