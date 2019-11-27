package com.peluqueria.app.web.models.services;
import java.util.List;
import com.peluqueria.app.web.models.entities.Catalogo;

public interface ICatalogoService {
	public void save(Catalogo catalogo);
	public Catalogo findById(Integer id);
	public void delete(Integer id);
	public List<Catalogo> findAll();
}
