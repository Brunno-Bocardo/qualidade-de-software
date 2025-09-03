package br.edu.ifsp.demo_clean.controller;

import org.springframework.web.bind.annotation.*;

import br.edu.ifsp.demo_clean.model.Venda;
import br.edu.ifsp.demo_clean.service.ServicoBaguncado;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.*;

@RestController
@RequestMapping("/api")
@Tag(name = "Venda ", description = " ")

public class VendaController {
	
	private ServicoBaguncado s;
	
	@PostMapping("/venda")
    public String salvaVenda(@RequestBody Venda v){s.addV(v); return "ok venda";}

    @GetMapping("/venda")
    public List<Venda> todasV(){return s.vnd();}
	
}
