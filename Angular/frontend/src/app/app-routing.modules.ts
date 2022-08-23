import { ProdutoComponent } from './components/views/produto/produto.component';
import { CategoriaComponent } from './components/views/categoria/categoria.component';
import { HomeComponent } from './components/views/home/home.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
  {
    path: '',
    component:  HomeComponent
  },
  {
    path: 'categoria',
    component:  CategoriaComponent
  },
  {
    path: 'produto',
    component:  ProdutoComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
