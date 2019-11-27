package com.peluqueria.app.web.models.services;

import java.util.List;
import com.peluqueria.app.web.models.entities.Detalle_Proforma;

public interface IDetalle_Proforma_Service {
	public void save(Detalle_Proforma detalleProforma);
	public Detalle_Proforma findById(Integer id);
	public void delete(Integer id);
	public List<Detalle_Proforma> findAll();

}
