package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IProductoDAO;
import com.example.demo.dto.Producto;

@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	IProductoDAO productoDAO;
	
	public List<Producto> findAll() {
		return productoDAO.findAll();
	}
	
	public Producto findById(Long id) {
		return productoDAO.findById(id).get();
	}
	
	public Producto save(Producto producto) {
		return productoDAO.save(producto);
	}
	
	public Producto update(Producto producto) {
		return productoDAO.save(producto);
	}
	
	public void delete(Long id) {
		productoDAO.deleteById(id);
	}
}
