package com.vendas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping("/categorias")
	public List<Categoria> listar(){
		return service.findAll();
	}
	
	@GetMapping("/categoria/{id}")
	public Optional<Categoria> getCategoria(@PathVariable(value = "id") Long id){
		return service.findById(id);
	}
	
	@PutMapping("/categoria")
	public Categoria alterar(@RequestBody Categoria categoria) {
		return service.saveOrUpdate(categoria);
	}
	
	@DeleteMapping("/categoria/{id}")
	public void deletar(@PathVariable(value = "id") Long id) {
		service.deleteById(id);
	}
}
