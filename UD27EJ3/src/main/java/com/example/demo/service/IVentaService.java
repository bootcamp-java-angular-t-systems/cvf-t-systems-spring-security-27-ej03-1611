package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Venta;

public interface IVentaService {
	public List<Venta> findAll();

	public Venta findById(int id);

	public Venta update(Venta venta);

	public Venta save(Venta venta);

	public void delete(int id);

}
