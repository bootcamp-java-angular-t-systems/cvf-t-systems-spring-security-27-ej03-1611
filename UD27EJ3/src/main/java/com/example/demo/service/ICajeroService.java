package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Cajero;

public interface ICajeroService {

	public List<Cajero> findAll();

	public Cajero findById(Long id);

	public Cajero update(Cajero cajero);

	public Cajero save(Cajero cajero);

	public void delete(Long id);

}
