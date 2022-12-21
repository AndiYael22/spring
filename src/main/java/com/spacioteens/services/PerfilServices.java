package com.spacioteens.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spacioteens.models.PerfilModel;
import com.spacioteens.repositories.PerfilRepository;

@Service
public class PerfilServices {
	@Autowired
	PerfilRepository perfilRepositorio;
	public ArrayList <PerfilModel> ObtenerContactos(){
		return (ArrayList <PerfilModel>)perfilRepositorio.findAll();
		
	}
	
	public PerfilModel  guardarContactos(PerfilModel perfiles ) {
		return perfilRepositorio.save(perfiles);
		
	}
	
	public Optional <PerfilModel> ObtenerPorId(Long id){
		return perfilRepositorio.findById(id);}	
	

public boolean eliminarContacto(Long id) {
	try {
		perfilRepositorio.deleteById(id);
		return true;
		
	} catch (Exception e) {
		return false;
	}
	 
}
}
