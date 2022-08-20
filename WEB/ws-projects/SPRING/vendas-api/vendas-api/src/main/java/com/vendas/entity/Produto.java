package com.vendas.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.TableGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@TableGenerator(name = "produtos")
@Entity
public class Produto {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private BigDecimal preco;
	private Boolean ativo;
	
	@Column(name = "qtd_estoque")
	private Integer quantidadeEstoque;
	
	// Muitos produtos para uma categoria
	@ManyToOne
	@JoinColumn(name = "categoria_id")
	private Categoria categoria;
	
}
