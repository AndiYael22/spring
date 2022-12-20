package com.spacioteens.models;

import java.util.*;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table (name= "usuario")
public class UsuarioModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true,nullable=false)
private Long id;
private String nombre;
private String apellido;
private String nombreUsuario;
private String email;
private String contrasenia;

@OneToOne(mappedBy = "usuario")
private PerfilModel idperfil;

public UsuarioModel() {
	super();
}

public UsuarioModel(Long id, String nombre, String apellido, String nombreUsuario, String email, String contrasenia,
		PerfilModel idperfil) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.apellido = apellido;
	this.nombreUsuario = nombreUsuario;
	this.email = email;
	this.contrasenia = contrasenia;
	this.idperfil = idperfil;
}

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

public String getNombreUsuario() {
	return nombreUsuario;
}

public void setNombreUsuario(String nombreUsuario) {
	this.nombreUsuario = nombreUsuario;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getContrasenia() {
	return contrasenia;
}

public void setContrasenia(String contrasenia) {
	this.contrasenia = contrasenia;
}

public PerfilModel getIdperfil() {
	return idperfil;
}

public void setIdperfil(PerfilModel idperfil) {
	this.idperfil = idperfil;
}

}