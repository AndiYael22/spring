package com.spacioteens.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spacioteens.models.PerfilModel;
import com.spacioteens.services.PerfilServices;

@RestController
@RequestMapping("/perfiles")
public class PerfilControllers {
	@Autowired
	PerfilServices perfilServicios;
	
	@GetMapping()
	public ArrayList <PerfilModel> ObtenerContactos(){
		return perfilServicios.ObtenerContactos();
	};
	
	@PostMapping()
	public PerfilModel guardarContactos(@RequestBody PerfilModel perfiles) {
		return this.perfilServicios.guardarContactos(perfiles);
	};
	

@GetMapping(path="/{id}")
public Optional <PerfilModel> obtenerUsuarioPorId(@PathVariable("id")Long id){
	return this.perfilServicios.ObtenerPorId(id);
}

@DeleteMapping("/{id}")
public String eliminarPorId(@PathVariable("id") Long id) {
	boolean check=this.perfilServicios.eliminarContacto(id);
	if(check) {
		return "se elimino el usuario"+id;
	}else {
	return "no se elimino el usuario"+id; 
	}
}

}
