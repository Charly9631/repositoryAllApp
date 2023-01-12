package com.app.all.model;

import java.util.Arrays;
import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "contado")
public class Contado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idContado;
	private String [] idProducto;
	private double ganancia;
	
	@OneToMany(mappedBy = "contado")
	private List<Producto> productos;
	
	
	public Contado() {
		super();
	}

	public Contado(Integer idContado, String[] idProducto, double ganancia) {
		super();
		this.idContado = idContado;
		this.idProducto = idProducto;
		this.ganancia = ganancia;
	}

	public Integer getIdContado() {
		return idContado;
	}

	public void setIdContado(Integer idContado) {
		this.idContado = idContado;
	}

	public String[] getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(String[] idProducto) {
		this.idProducto = idProducto;
	}

	public double getGanancia() {
		return ganancia;
	}

	public void setGanancia(double ganancia) {
		this.ganancia = ganancia;
	}
	

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	@Override
	public String toString() {
		return "Contado [idContado=" + idContado + ", idProducto=" + Arrays.toString(idProducto) + ", ganancia="
				+ ganancia + "]";
	}
	
	
	
}

