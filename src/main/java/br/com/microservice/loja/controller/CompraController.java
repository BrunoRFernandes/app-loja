package br.com.microservice.loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.microservice.loja.controller.dto.CompraDTO;
import br.com.microservice.loja.model.Compra;
import br.com.microservice.loja.service.CompraService;

@RestController
@RequestMapping("/compra")
public class CompraController {
	
	@Autowired
	private CompraService compraService;
	
	@PostMapping
	public Compra criarCompra(@RequestBody CompraDTO compra) {
		return compraService.realizaCompra(compra);
	}
	
	@GetMapping
	public void lista() {
		System.out.println("teste");
	}
	
	
}