package com.peluqueria.app.web.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.peluqueria.app.web.models.entities.Cliente;

public interface ICliente extends CrudRepository<Cliente, Integer> {

}
