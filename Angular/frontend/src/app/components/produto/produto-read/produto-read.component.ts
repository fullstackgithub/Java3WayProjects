import { ProdutoService } from './../../../services/produto.service';
import { Component, OnInit } from '@angular/core';
import { Produto } from 'src/app/models/produto.model';
import { Router } from '@angular/router';

@Component({
  selector: 'app-produto-read',
  templateUrl: './produto-read.component.html',
  styleUrls: ['./produto-read.component.css']
})
export class ProdutoReadComponent implements OnInit {

  produtos: Produto[] = [];
  displayedColumns: string[] = ["id", "categoria", "nome", "preco", "quantidadeEstoque", "ativo", "actions"];

  constructor(
    private produtoService: ProdutoService,
    private router: Router
  ) { }

  ngOnInit(): void {
    this.readProdutos();
  }

 readProdutos(): void{
  this.produtoService.read().subscribe(produtos => {
    this.produtos = produtos;
  });
 }

}
