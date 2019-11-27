package com.peluqueria.app.web.models.services; 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import com.peluqueria.app.web.models.dao.IDetalle_Proforma;
import com.peluqueria.app.web.models.entities.Detalle_Proforma;

@Service
public class Detalle_Proforma_Service implements IDetalle_Proforma_Service{

	@Autowired
	private IDetalle_Proforma dao;
	
	@Override
	@Transactional
	public void save(Detalle_Proforma detalleProforma) {
		dao.save(detalleProforma);
	}

	@Override
	@Transactional
	public Detalle_Proforma findById(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	@Transactional
	public void delete(Integer id) {
		dao.deleteById(id);
		
	}

	@Override
	@Transactional
	public List<Detalle_Proforma> findAll() {
		return (List<Detalle_Proforma>)dao.findAll();
	}
	
}
