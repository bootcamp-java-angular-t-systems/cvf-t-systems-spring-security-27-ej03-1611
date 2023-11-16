package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Producto;
import com.example.demo.service.ProductoServiceImpl;

@RestController
@RequestMapping("/producto")
public class ProductoController {

	@Autowired
	ProductoServiceImpl productoService;
	
	@GetMapping("/all")
	public List<Producto> getAll() {
		return productoService.findAll();
	}
	
	@GetMapping("/{id}")
	public Producto getById(@PathVariable(name="id") Long id) {
		return productoService.findById(id);
	}
	
	
	@PostMapping("")
	public Producto createProducto(@RequestBody Producto producto) {
		return productoService.save(producto);
	}
	
	@PutMapping("/{id}")
	public Producto updateProducto(@PathVariable(name="id")Long id,@RequestBody Producto producto) {
		
		Producto productoSeleccionada= new Producto();
		
		productoSeleccionada= productoService.findById(id);
		
		productoSeleccionada.setPrecio(producto.getPrecio());
		productoSeleccionada.setVentas(producto.getVentas());
		
		productoSeleccionada = productoService.update(productoSeleccionada);
		
		return productoSeleccionada;
	}
	
	@DeleteMapping("/{id}")
	public void deleteProducto(@PathVariable(name="id") Long id) {
		productoService.delete(id);
	}
}
