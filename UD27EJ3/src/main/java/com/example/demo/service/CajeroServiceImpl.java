package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ICajeroDAO;
import com.example.demo.dto.Cajero;

@Service
public class CajeroServiceImpl implements ICajeroService{

	@Autowired
	ICajeroDAO cajeroDAO;
	
	public List<Cajero> findAll() {
		return cajeroDAO.findAll();
	}
	
	public Cajero findById(Long id) {
		return cajeroDAO.findById(id).get();
	}
	
	public Cajero save(Cajero cajero) {
		return cajeroDAO.save(cajero);
	}
	
	public Cajero update(Cajero cajero) {
		return cajeroDAO.save(cajero);
	}
	
	public void delete(Long id) {
		cajeroDAO.deleteById(id);
	}
}
