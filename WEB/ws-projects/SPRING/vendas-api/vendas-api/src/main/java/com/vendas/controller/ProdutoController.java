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
import com.vendas.entity.Produto;
import com.vendas.service.ProdutoService;


@RestController
@RequestMapping("/vendas-api")
public class ProdutoController {
	
	@Autowired
	private ProdutoService service;
	
	@PostMapping("/produto")
	public Produto salvar(@RequestBody Produto produto) {
		return service.saveOrUpdate(produto);
	}
	
	@GetMapping("/produtos")
	public List<Produto> listar(){
		return service.findAll();
	}
	
	@GetMapping("/produto/{id}")
	public Optional<Produto> getCategoria(@PathVariable(value = "id") Long id){
		return service.findById(id);
	}
	
	@PutMapping("/produto")
	public Produto alterar(@RequestBody Produto produto) {
		return service.saveOrUpdate(produto);
	}
	
	@DeleteMapping("/produto/{id}")
	public void deletar(@PathVariable(value = "id") Long id) {
		service.deleteById(id);
	}
}
