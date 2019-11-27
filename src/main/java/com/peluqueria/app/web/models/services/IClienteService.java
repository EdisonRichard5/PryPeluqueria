package com.peluqueria.app.web.models.services;
import java.util.List;
import com.peluqueria.app.web.models.entities.Cliente;


public interface IClienteService {
	public void save(Cliente cliente);
	public Cliente findById(Integer id);
	public void delete(Integer id);
	public List<Cliente> findAll();
	
}
