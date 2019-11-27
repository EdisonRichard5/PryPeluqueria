package com.peluqueria.app.web.models.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table; 

@Entity
@Table(name="DETALLE_PROFORMA")

public class Detalle_Proforma implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="IDDETALLE")
	private Integer iddetalle;
	

	@Column(name="CANTIDAD")
	private Float cantidad; 
	public List<Catalogo> getCatalogo() {
		return catalogo;
	}
	public void setCatalogo(List<Catalogo> catalogo) {
		this.catalogo = catalogo;
	}
	@Column(name="SUBTOTAL")
	private Float subtotal;

	
	@OneToMany(mappedBy="detalle",fetch= FetchType.LAZY)
	private List<Catalogo>catalogo;
	

	public Detalle_Proforma() {
		super();
	}
	public Detalle_Proforma(Integer id) {
		super();
		this.iddetalle=id;
	}
	public Integer getIddetalle() {
		return iddetalle;
	}
	public void setIddetalle(Integer iddetalle) {
		this.iddetalle = iddetalle;
	}
	
	public Float getCantidad() {
		return cantidad;
	}
	public void setCantidad(Float cantidad) {
		this.cantidad = cantidad;
	}
	public Float getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(Float subtotal) {
		this.subtotal = subtotal;
	}
	 
	
}