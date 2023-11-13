package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IVentaDAO;
import com.example.demo.dto.Venta;

@Service
public class VentaServiceImpl implements IVentaService{
	
	@Autowired
	IVentaDAO ventaDAO;
	
	public List<Venta> findAll() {
		return ventaDAO.findAll();
	}
	
	public Venta findById(int id) {
		return ventaDAO.findById(id).get();
	}
	
	public Venta save(Venta venta) {
		return ventaDAO.save(venta);
	}
	
	public Venta update(Venta venta) {
		return ventaDAO.save(venta);
	}
	
	public void delete(int id) {
		ventaDAO.deleteById(id);
	}

}
