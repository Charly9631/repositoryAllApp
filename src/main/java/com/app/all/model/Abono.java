package com.app.all.model;

import java.util.Date;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "abonos")
public class Abono {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idAbono;
	private double cantidad;
	private Date fecha;
	private String nombreCliente;
	
	@ManyToOne
	private Cliente cliente;
	
	public Abono() {
		super();
	}

	public Abono(Integer idAbono, double cantidad, Date fecha, String nombreCliente) {
		super();
		this.idAbono = idAbono;
		this.cantidad = cantidad;
		this.fecha = fecha;
		this.nombreCliente = nombreCliente;
	}

	public Integer getIdAbono() {
		return idAbono;
	}

	public void setIdAbono(Integer idAbono) {
		this.idAbono = idAbono;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Abonos [idAbono=" + idAbono + ", cantidad=" + cantidad + ", fecha=" + fecha + ", nombreCliente="
				+ nombreCliente + "]";
	}

	
}

