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

import com.example.demo.dto.Venta;
import com.example.demo.service.VentaServiceImpl;

@RestController
@RequestMapping("/venta")
public class VentaController {

	@Autowired
	VentaServiceImpl ventaService;
	
	@GetMapping("/all")
	public List<Venta> getAll() {
		return ventaService.findAll();
	}
	
	@GetMapping("/{id}")
	public Venta getById(@PathVariable(name="id") int id) {
		return ventaService.findById(id);
	}
	
	
	@PostMapping("")
	public Venta createVenta(@RequestBody Venta venta) {
		return ventaService.save(venta);
	}
	
	@PutMapping("/{id}")
	public Venta updateVenta(@PathVariable(name="id")int id,@RequestBody Venta venta) {
		
		Venta ventaSeleccionada= new Venta();
		
		ventaSeleccionada= ventaService.findById(id);
		
		ventaSeleccionada.setCajero(venta.getCajero());
		ventaSeleccionada.setMaquinaRegistradora(venta.getMaquinaRegistradora());
		ventaSeleccionada.setProducto(venta.getProducto());
		
		
		ventaSeleccionada = ventaService.update(ventaSeleccionada);
		
		return ventaSeleccionada;
	}
	
	@DeleteMapping("/{id}")
	public void deleteVenta(@PathVariable(name="id") int id) {
		ventaService.delete(id);
	}
}
