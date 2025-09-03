package br.edu.ifsp.demo_clean.controller;

import org.springframework.web.bind.annotation.*;

import br.edu.ifsp.demo_clean.model.Carro;
import br.edu.ifsp.demo_clean.service.ServicoBaguncado;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.*;

@RestController
@RequestMapping("/api")
@Tag(name = "Carro ", description = " ")

public class ClienteController {
	
	private ServicoBaguncado s;

	@PostMapping("/carro")
    public String salvaCarro(@RequestBody Carro c){s.addCar(c);return "ok carro";}

    @GetMapping("/carro")
    public List<Carro> todosCar(){return s.tudoCarro();}
	
}
