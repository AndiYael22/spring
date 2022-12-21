package com.spacioteens.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
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
@JoinColumn(name="id" )
private UsuarioModel usuario;


@OneToMany(mappedBy="perfil")
private ArrayList<ContactoModel>contacto;


@OneToMany(mappedBy="perfil")
private ArrayList<OrdenModel>orden;


public PerfilModel() {
	super();
}


public PerfilModel(Long id, String domicilio, String cP, String telefono, UsuarioModel usuario) {
	super();
	this.id = id;
	this.domicilio = domicilio;
	this.cP = cP;
	this.telefono = telefono;
	this.usuario = usuario;

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


}