package com.DispositivosUNPA.Parcial.Interface;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.DispositivosUNPA.Parcial.Model.Persona;

@Repository
public interface Ipersona extends CrudRepository<Persona, Integer> {

}
