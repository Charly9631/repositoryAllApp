package com.app.all.model;

import java.util.List;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCliente;
	private String nombre;
	private double saldo;
	private String status;
	private String telefono;
	
	@OneToMany(mappedBy="cliente")
	private List<Abono> abonos;
	
	@OneToMany(mappedBy="cliente")
	private List<Credito> credito;
	
	
	public Cliente() {
		super();
	}

	public Cliente(Integer idCliente, String nombre, double saldo, String status, String telefono) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.saldo = saldo;
		this.status = status;
		this.telefono = telefono;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	

	public List<Abono> getAbonos() {
		return abonos;
	}

	public void setAbonos(List<Abono> abonos) {
		this.abonos = abonos;
	}
	

	public List<Credito> getCredito() {
		return credito;
	}

	public void setCredito(List<Credito> credito) {
		this.credito = credito;
	}

	
	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nombre=" + nombre + ", saldo=" + saldo + ", status=" + status
				+ ", telefono=" + telefono + ", abonos=" + abonos + ", credito=" + credito + "]";
	}
}
