package com.spacioteens.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spacioteens.models.PerfilModel;

@Repository
public interface PerfilRepository extends CrudRepository <PerfilModel, Long>{

}
