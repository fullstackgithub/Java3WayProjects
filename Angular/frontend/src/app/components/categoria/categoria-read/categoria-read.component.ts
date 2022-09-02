import { Categoria } from './../../../models/categoria.model';
import { CategoriaService } from './../../../services/categoria.service';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-categoria-read',
  templateUrl: './categoria-read.component.html',
  styleUrls: ['./categoria-read.component.css']
})
export class CategoriaReadComponent implements OnInit {

  categorias: Categoria[] = [];
  displayedColumns: string[] = ['id', 'categoria', 'actions'];

  constructor(
    private categoriaService: CategoriaService,
    private router: Router
  ) { }

  ngOnInit(): void {
    this.readCategorias();
  }

  readCategorias(): void {
    this.categoriaService.read().subscribe(categorias => {
      this.categorias = categorias;
    })
  }

  deleteCategoriaById(id: number): void {
    if (window.confirm('Confirma a exclusão da categoria?')) {
      this.categoriaService.deleteById(id).subscribe(() => {
        this.categoriaService.showMessage('Categoria excluída com sucesso!');
        this.readCategorias();
        this.router.navigate(['/categoria']);
      });
    }
  }
}
