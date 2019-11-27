package com.peluqueria.app.web.models.entities;
import java.io.Serializable; 
import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name="CATALOGO")
public class Catalogo implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="IDCATALOGO")
	private Integer id; 
	@Column(name="NOMBRE")
	@Size(max=450)
	private String nombre;
	@Column(name="IMAGEN")
	@Size(max=350)
	private String imagen;
	@Column(name="PRECIO")
	@Size(max=250)
	private Float precio;
	@Column(name="TIPO")
	private Boolean tipo;
	@Column(name="DESCRIPCIÓN")
	@Size(max=250)
	private String descripcion;
	

	@JoinColumn(name="IDDETALLE",referencedColumnName="IDDETALLE")
	@ManyToOne
	private Detalle_Proforma detalle;
	
	
	
	
	
}