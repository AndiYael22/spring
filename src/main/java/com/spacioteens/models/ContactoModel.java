package com.spacioteens.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name= "contactanos")
public class ContactoModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true,nullable=false)
private Long id;
private String asunto;
private String mensaje;
@ManyToOne
private PerfilModel perfil;



public PerfilModel getPerfil() {
	return perfil;
}

public void setPerfil(PerfilModel perfil) {
	this.perfil = perfil;
}

public ContactoModel() {
	super();
}

public ContactoModel(Long id, String asunto, String mensaje) {
	super();
	this.id = id;
	this.asunto = asunto;
	this.mensaje = mensaje;

}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getAsunto() {
	return asunto;
}

public void setAsunto(String asunto) {
	this.asunto = asunto;
}

public String getMensaje() {
	return mensaje;
}

public void setMensaje(String mensaje) {
	this.mensaje = mensaje;
}





}
