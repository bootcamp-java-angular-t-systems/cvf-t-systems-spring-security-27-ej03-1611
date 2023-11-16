package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Producto;

public interface IProductoService {

	public List<Producto> findAll();

	public Producto findById(Long id);

	public Producto update(Producto producto);

	public Producto save(Producto producto);

	public void delete(Long id);

}
