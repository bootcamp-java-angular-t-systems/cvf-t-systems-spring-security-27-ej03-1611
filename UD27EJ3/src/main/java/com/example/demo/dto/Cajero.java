package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "cajeros")
public class Cajero {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private Long id;
	private String nomApels;

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cajero", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Venta> ventas;

	public Cajero() {
		super();
	}

	public Cajero(String nomApels, List<Venta> ventas) {
		super();
		this.nomApels = nomApels;
		this.ventas = ventas;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomApels() {
		return nomApels;
	}

	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
	}

	public List<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(List<Venta> ventas) {
		this.ventas = ventas;
	}

	@Override
	public String toString() {
		return "Cajero [id=" + id + ", nomApels=" + nomApels + ", ventas=" + ventas + "]";
	}

}
