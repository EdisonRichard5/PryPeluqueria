package com.peluqueria.app.web.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.peluqueria.app.web.models.entities.Empleado;

public interface IEmpleado extends CrudRepository<Empleado, Integer> {

}
