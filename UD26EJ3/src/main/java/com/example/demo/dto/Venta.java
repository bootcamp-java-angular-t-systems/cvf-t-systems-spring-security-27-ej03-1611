package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "ventas")
public class Venta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JsonIgnoreProperties("ventas")
	@JoinColumn(name = "cajero_id")
	private Cajero cajero;
	
	@ManyToOne
	@JsonIgnoreProperties("ventas")
	@JoinColumn(name = "producto_id")
	private Producto producto;
	
	@ManyToOne
	@JsonIgnoreProperties("ventas")
	@JoinColumn(name = "maquina_registradora_id")
	private MaquinaRegistradora maquinaRegistradora;

	
	public Venta() {
		super();
	}

	public Venta(Cajero cajero, Producto producto, MaquinaRegistradora maquinaRegistradora) {
		super();
		this.cajero = cajero;
		this.producto = producto;
		this.maquinaRegistradora = maquinaRegistradora;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cajero getCajero() {
		return cajero;
	}

	public void setCajero(Cajero cajero) {
		this.cajero = cajero;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public MaquinaRegistradora getMaquinaRegistradora() {
		return maquinaRegistradora;
	}

	public void setMaquinaRegistradora(MaquinaRegistradora maquinaRegistradora) {
		this.maquinaRegistradora = maquinaRegistradora;
	}

}
