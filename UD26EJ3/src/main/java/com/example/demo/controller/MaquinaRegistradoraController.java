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

import com.example.demo.dto.MaquinaRegistradora;
import com.example.demo.service.MaquinaRegistradoraServiceImpl;

@RestController
@RequestMapping("/maquina-registradora")
public class MaquinaRegistradoraController {

	@Autowired
	MaquinaRegistradoraServiceImpl maquinaRegistradoraService;
	
	@GetMapping("/all")
	public List<MaquinaRegistradora> getAll() {
		return maquinaRegistradoraService.findAll();
	}
	
	@GetMapping("/{id}")
	public MaquinaRegistradora getById(@PathVariable(name="id") Long id) {
		return maquinaRegistradoraService.findById(id);
	}
	
	
	@PostMapping("")
	public MaquinaRegistradora createMaquinaRegistradora(@RequestBody MaquinaRegistradora maquinaRegistradora) {
		return maquinaRegistradoraService.save(maquinaRegistradora);
	}
	
	@PutMapping("/{id}")
	public MaquinaRegistradora updateMaquinaRegistradora(@PathVariable(name="id")Long id,@RequestBody MaquinaRegistradora maquinaRegistradora) {
		
		MaquinaRegistradora maquinaRegistradoraSeleccionada= new MaquinaRegistradora();
		
		maquinaRegistradoraSeleccionada= maquinaRegistradoraService.findById(id);
		
		maquinaRegistradoraSeleccionada.setPiso(maquinaRegistradora.getPiso());
		maquinaRegistradoraSeleccionada.setVentas(maquinaRegistradora.getVentas());
		
		maquinaRegistradoraSeleccionada = maquinaRegistradoraService.update(maquinaRegistradoraSeleccionada);
		
		return maquinaRegistradoraSeleccionada;
	}
	
	@DeleteMapping("/{id}")
	public void deleteMaquinaRegistradora(@PathVariable(name="id") Long id) {
		maquinaRegistradoraService.delete(id);
	}
}
