package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.MaquinaRegistradora;

public interface IMaquinaRegistradoraService {

	public List<MaquinaRegistradora> findAll();

	public MaquinaRegistradora findById(Long id);

	public MaquinaRegistradora update(MaquinaRegistradora maquinaRegistradora);

	public MaquinaRegistradora save(MaquinaRegistradora maquinaRegistradora);

	public void delete(Long id);

}
