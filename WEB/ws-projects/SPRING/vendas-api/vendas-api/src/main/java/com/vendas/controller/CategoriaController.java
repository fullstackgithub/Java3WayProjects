package com.vendas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vendas.entity.Categoria;
import com.vendas.service.CategoriaService;


@RestController
@RequestMapping("/vendas-api")
public class CategoriaController {
	
	@Autowired
	private CategoriaService service;
	
	@PostMapping("/categoria")
	public Categoria salvar(@RequestBody Categoria categoria) {
		return service.saveOrUpdate(categoria);
	}
	
	@GetMapping("categorias")
	public List<Categoria> listar(){
		return service.findAll();
	}
	
	
}
