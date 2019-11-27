package com.peluqueria.app.web.models.entities;
import java.io.Serializable;
import javax.persistence.*; 


@Entity
@Table(name="EMPLEADO")
public class Empleado implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="IDEMPLEADO")
	private Integer idempleado;
	@Column(name="NOMBRE")
	private String nombre;
	@Column(name="CORREO")
	private String correo; 
	@Column(name="CELULAR")
	private String celular;
	public Integer getIdempleado() {
		return idempleado;
	}
	public void setIdempleado(Integer idempleado) {
		this.idempleado = idempleado;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	
}
