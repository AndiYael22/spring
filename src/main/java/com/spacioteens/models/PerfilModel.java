package com.spacioteens.models;

import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table (name= "perfil")
public class PerfilModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true,nullable=false)
private Long id;
private String domicilio;
private String cP;
private String telefono;

@OneToOne
private UsuarioModel usuario;

@OneToMany(mappedBy = "perfil")
private  ArrayList <ContactoModel> contactanos;
@OneToMany(mappedBy = "perfil")
private  ArrayList <OrdenModel> ordens;


public PerfilModel(ArrayList<OrdenModel> ordens) {
	super();
	this.ordens = ordens;
}



public PerfilModel() {
	super();
}



public PerfilModel(Long id, String domicilio, String cP, String telefono, UsuarioModel usuario,
		ArrayList<ContactoModel> contactanos) {
	super();
	this.id = id;
	this.domicilio = domicilio;
	this.cP = cP;
	this.telefono = telefono;
	this.usuario = usuario;
	this.contactanos = contactanos;
}



public ArrayList<OrdenModel> getOrdens() {
	return ordens;
}



public void setOrdens(ArrayList<OrdenModel> ordens) {
	this.ordens = ordens;
}



public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getDomicilio() {
	return domicilio;
}

public void setDomicilio(String domicilio) {
	this.domicilio = domicilio;
}

public String getcP() {
	return cP;
}

public void setcP(String cP) {
	this.cP = cP;
}

public String getTelefono() {
	return telefono;
}

public void setTelefono(String telefono) {
	this.telefono = telefono;
}

public UsuarioModel getUsuario() {
	return usuario;
}

public void setUsuario(UsuarioModel usuario) {
	this.usuario = usuario;
}



public ArrayList<ContactoModel> getContactanos() {
	return contactanos;
}



public void setContactanos(ArrayList<ContactoModel> contactanos) {
	this.contactanos = contactanos;
}





}