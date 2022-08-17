package com.vendas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.vendas.entity.Categoria;
import com.vendas.repository.CategoriaRepository;



@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repository;

	public Categoria saveOrUpdate(Categoria categoria) {
		return repository.save(categoria);
	}

	public void delete(Long id) {
		repository.deleteById(id);
	}

	public List<Categoria> findAll() {
		return repository.findAll(Sort.by(Sort.Direction.ASC, "nome"));
	}

	public Optional<Categoria> findAll(Long id){
		return repository.findById(id);
	}

}
