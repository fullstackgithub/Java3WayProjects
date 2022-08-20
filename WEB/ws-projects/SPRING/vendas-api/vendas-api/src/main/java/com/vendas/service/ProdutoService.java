package com.vendas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.vendas.entity.Produto;
import com.vendas.repository.ProdutoRepository;



@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repository;

	public Produto saveOrUpdate(Produto produto) {
		return repository.save(produto);
	}

	public void deleteById(Long id) {
		repository.deleteById(id);
	}

	public List<Produto> findAll() {
		return repository.findAll(Sort.by(Sort.Direction.ASC, "nome"));
	}

	public Optional<Produto> findById(Long id){
		return repository.findById(id);
	}

}
