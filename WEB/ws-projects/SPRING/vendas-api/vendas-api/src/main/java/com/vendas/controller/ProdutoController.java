package com.vendas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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

import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("/vendas-api")
@CrossOrigin(origins = "*")
public class ProdutoController {
	
	@Autowired
	private ProdutoService service;
	
	@PostMapping("/produto")
	@ApiOperation(value = "Inclui um novo produto")
	public Produto salvar(@RequestBody Produto produto) {
		return service.saveOrUpdate(produto);
	}
	
	@GetMapping("/produtos")
	@ApiOperation(value = "Listar os produtos")
	public List<Produto> listar(){
		return service.findAll();
	}
	
	@GetMapping("/produto/{id}")
	@ApiOperation(value = "Retornar o produto através do id")
	public Optional<Produto> getCategoria(@PathVariable(value = "id") Long id){
		return service.findById(id);
	}
	
	@PutMapping("/produto")
	@ApiOperation(value = "Alterar o produto")
	public Produto alterar(@RequestBody Produto produto) {
		return service.saveOrUpdate(produto);
	}
	
	@DeleteMapping("/produto/{id}")
	@ApiOperation(value = "Deletar o produto pelo id")
	public void deletar(@PathVariable(value = "id") Long id) {
		service.deleteById(id);
	}
}
