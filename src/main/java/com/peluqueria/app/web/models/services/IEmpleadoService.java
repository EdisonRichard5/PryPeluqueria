package com.peluqueria.app.web.models.services;
import java.util.List;
import com.peluqueria.app.web.models.entities.Empleado;

public interface IEmpleadoService {
	public void save(Empleado empleado);
	public Empleado findById(Integer id);
	public void delete(Integer id);
	public List<Empleado> findAll();
}
