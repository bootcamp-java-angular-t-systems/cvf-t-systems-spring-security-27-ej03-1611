package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IMaquinaRegistradoraDAO;
import com.example.demo.dto.MaquinaRegistradora;

@Service
public class MaquinaRegistradoraServiceImpl implements IMaquinaRegistradoraService{

	@Autowired
	IMaquinaRegistradoraDAO maquinaRegistradoraDAO;
	
	public List<MaquinaRegistradora> findAll() {
		return maquinaRegistradoraDAO.findAll();
	}
	
	public MaquinaRegistradora findById(Long id) {
		return maquinaRegistradoraDAO.findById(id).get();
	}
	
	public MaquinaRegistradora save(MaquinaRegistradora maquinaRegistradora) {
		return maquinaRegistradoraDAO.save(maquinaRegistradora);
	}
	
	public MaquinaRegistradora update(MaquinaRegistradora maquinaRegistradora) {
		return maquinaRegistradoraDAO.save(maquinaRegistradora);
	}
	
	public void delete(Long id) {
		maquinaRegistradoraDAO.deleteById(id);
	}
}
