package com.app.all.model;

import java.util.Arrays;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "credito")
public class Credito {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCredito;
	private String [] idProducto;
	private Integer idCliente;
	private double saldoTotal;
	private Date fecha;
	
	@ManyToOne
	private Cliente cliente;
	
	public Credito() {
		super();
	}

	

	public Credito(Integer idCredito, String[] idProducto, Integer idCliente, double saldoTotal, Date fecha) {
		super();
		this.idCredito = idCredito;
		this.idProducto = idProducto;
		this.idCliente = idCliente;
		this.saldoTotal = saldoTotal;
		this.fecha = fecha;
	}



	public Integer getIdCredito() {
		return idCredito;
	}

	public void setIdCredito(Integer idCredito) {
		this.idCredito = idCredito;
	}

	public String[] getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(String[] idProducto) {
		this.idProducto = idProducto;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public double getSaldoTotal() {
		return saldoTotal;
	}

	public void setSaldoTotal(double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	

	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	@Override
	public String toString() {
		return "Credito [idCredito=" + idCredito + ", idProducto=" + Arrays.toString(idProducto) + ", idCliente="
				+ idCliente + ", saldoTotal=" + saldoTotal + ", fecha=" + fecha + ", cliente=" + cliente + "]";
	}





	

		
	
}
