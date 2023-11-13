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

import com.example.demo.dto.Cajero;
import com.example.demo.service.CajeroServiceImpl;

@RestController
@RequestMapping("/cajero")
public class CajeroController {

	@Autowired
	CajeroServiceImpl cajeroService;


	@GetMapping("/all")
	public List<Cajero> getAll() {
		return cajeroService.findAll();
	}

	@GetMapping("/{id}")
	public Cajero getById(@PathVariable(name = "id") Long id) {
		return cajeroService.findById(id);
	}

	@PostMapping("")
	public Cajero createCajero(@RequestBody Cajero cajero) {
		return cajeroService.save(cajero);
	}

	@PutMapping("/{id}")
	public Cajero updateCajero(@PathVariable(name = "id") Long id, @RequestBody Cajero cajero) {

		Cajero cajeroSeleccionada = new Cajero();

		cajeroSeleccionada = cajeroService.findById(id);

		cajeroSeleccionada.setNomApels(cajero.getNomApels());
		cajeroSeleccionada.setVentas(cajero.getVentas());

		cajeroSeleccionada = cajeroService.update(cajeroSeleccionada);

		return cajeroSeleccionada;
	}

	@DeleteMapping("/{id}")
	public void deleteCajero(@PathVariable(name = "id") Long id) {
		cajeroService.delete(id);
	}
}
