package com.app.all.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProducto;
	private String codigo;
	private String nombre;
	private double precio;
	private String propiedades;
	private Integer stock;
	
	@ManyToOne
	private Admin admin;
	
	@ManyToOne
	private Venta venta;
	
	@ManyToOne
	private Contado contado;
	
	public Producto() {
		super();
	}

	

	public Producto(Integer idProducto, String codigo, String nombre, double precio, String propiedades, Integer stock,
			Admin admin) {
		super();
		this.idProducto = idProducto;
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.propiedades = propiedades;
		this.stock = stock;
		this.admin = admin;
	}



	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getPropiedades() {
		return propiedades;
	}

	public void setPropiedades(String propiedades) {
		this.propiedades = propiedades;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}
	

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}
	



	public Contado getContado() {
		return contado;
	}



	public void setContado(Contado contado) {
		this.contado = contado;
	}



	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio
				+ ", propiedades=" + propiedades + ", stock=" + stock + ", admin=" + admin + ", venta=" + venta + "]";
	}

	
	
	
	
}

