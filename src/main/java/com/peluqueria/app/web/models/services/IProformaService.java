package com.peluqueria.app.web.models.services;

import java.util.List;
import com.peluqueria.app.web.models.entities.Proforma;

public interface IProformaService {
	public void save(Proforma proforma);
	public Proforma findById(Integer id);
	public void delete(Integer id);
	public List<Proforma> findAll();
}
