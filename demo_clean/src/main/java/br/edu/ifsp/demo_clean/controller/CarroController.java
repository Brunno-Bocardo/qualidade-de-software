package br.edu.ifsp.demo_clean.controller;

import org.springframework.web.bind.annotation.*;

import br.edu.ifsp.demo_clean.model.Cliente;
import br.edu.ifsp.demo_clean.service.ServicoBaguncado;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.*;

@RestController
@RequestMapping("/api")
@Tag(name = "Carro ", description = " ")
public class CarroController {

    private ServicoBaguncado s;

    public CarroController(ServicoBaguncado s){this.s=s;}

    @PostMapping("/cli")
    public String salvaCli(@RequestBody Cliente c){s.addCli(c); return "ok cliente";}

    @GetMapping("/cli")
    public List<Cliente> todosCli(){return s.tdsCli();}    

    
}