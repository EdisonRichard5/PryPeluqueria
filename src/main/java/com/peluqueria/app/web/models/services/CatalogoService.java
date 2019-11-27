package com.peluqueria.app.web.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.peluqueria.app.web.models.dao.ICatalogo;
import com.peluqueria.app.web.models.entities.Catalogo;

@Service
public class CatalogoService implements ICatalogoService{

	@Autowired
	private ICatalogo dao;
	
	@Override
	@Transactional
	public void save(Catalogo catalogo) {
		dao.save(catalogo);
	}

	@Override
	@Transactional
	public Catalogo findById(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	@Transactional
	public void delete(Integer id) {
		dao.deleteById(id);
		
	}

	@Override
	@Transactional
	public List<Catalogo> findAll() {
		return (List<Catalogo>)dao.findAll();
	}
	
}
