package com.peluqueria.app.web.models.entities;
import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.*;
import javax.validation.constraints.*;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="PROFORMA")
public class Proforma implements Serializable {
	private static final long serialVersionUID=1L;
 
	public Proforma() {
		super();
	}
	public Proforma(Integer id) {
		super();
		this.idproforma=id;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="IDPROFORMA")
	private Integer idproforma;
	@Column(name="FECHA")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Past
	private Calendar fechaproforma;
	@JoinColumn(name="IDCLIENTE",referencedColumnName="IDCLIENTE")
	@OneToOne
	private Cliente cliente;
	@JoinColumn(name="IDEMPLEADO",referencedColumnName="IDEMPLEADO")
	@OneToOne
	private Empleado empleado;
	@Column(name="ESTADO")
	private Boolean estado;
	
	@JoinColumn(name="IDDETALLE",referencedColumnName="IDDETALLE")
	@OneToOne
	private Detalle_Proforma detalle_proforma;
	@Column(name="IVA")
	@Size(max=5)
	private Float iva;
	@Column(name="TOTAL")
	@Size(max=5)
	private Float total;

	public Integer getIdproforma() {
		return idproforma;
	}
	public void setIdproforma(Integer idproforma) {
		this.idproforma = idproforma;
	}
	public Calendar getFechaproforma() {
		return fechaproforma;
	}
	public void setFechaproforma(Calendar fechaproforma) {
		this.fechaproforma = fechaproforma;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	public Detalle_Proforma getDetalle_proforma() {
		return detalle_proforma;
	}
	public void setDetalle_proforma(Detalle_Proforma detalle_proforma) {
		this.detalle_proforma = detalle_proforma;
	}
	public Float getIva() {
		return iva;
	}
	public void setIva(Float iva) {
		this.iva = iva;
	}
	public Float getTotal() {
		return total;
	}
	public void setTotal(Float total) {
		this.total = total;
	}
	
}