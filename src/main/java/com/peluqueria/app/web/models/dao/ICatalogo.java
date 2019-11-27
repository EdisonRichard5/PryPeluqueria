package com.peluqueria.app.web.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.peluqueria.app.web.models.entities.Catalogo;

public interface ICatalogo  extends CrudRepository<Catalogo, Integer> {

}
