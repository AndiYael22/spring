package com.spacioteens.models;

import java.sql.Date;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table (name= "Orden")
public class OrdenModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true,nullable=false)
	Long id;
	Double precio;
	String cantidad;
	@Column(name="FECHACREACION")
	@JsonFormat(pattern="ddMMyyyy")
	private Date fechacreacion;
	@ManyToOne
	private PerfilModel perfil;
	
	
	@OneToMany(mappedBy = "Orden")
	private  ArrayList <PagoModel> Pagos;
	
	@ManyToOne
	private ProductoModel Producto;
	public ProductoModel getProductos() {
		return Producto;
	}
	public void setProductos(ProductoModel productos) {
		Producto = productos;
	}
	public OrdenModel(ProductoModel productos) {
		super();
		Producto = productos;
	}
	public OrdenModel() {
		super();
	}
	public OrdenModel(Long id, Double precio, String cantidad, PerfilModel perfil) {
		super();
		this.id = id;
		this.precio = precio;
		this.cantidad = cantidad;
		this.perfil = perfil;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public PerfilModel getPerfil() {
		return perfil;
	}
	public void setPerfil(PerfilModel perfil) {
		this.perfil = perfil;
	}
	

}
