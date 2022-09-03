import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { environment } from 'src/environments/environment';
import { Produto } from '../models/produto.model';

@Injectable({
  providedIn: 'root'
})
export class ProdutoService {

  private baseUrl = environment.baseUrl;

  constructor(
    private http: HttpClient,
    private snackBar: MatSnackBar
  ) { }

  showMessage(msg: string): void{
    this.snackBar.open(msg, 'X', {
      duration: 5000,
      horizontalPosition: 'right',
      verticalPosition: 'top'
    });
  }

  read(): Observable<Produto[]>{
    return this.http.get<Produto[]>(`${this.baseUrl}/produtos`);
  }

  create(produto: Produto): Observable<Produto>{
    return this.http.post<Produto>(`${this.baseUrl}/produto`, produto);
  }

  update(produto: Produto): Observable<Produto>{
    return this.http.put<Produto>(`${this.baseUrl}/produto`, produto);
  }

  readById(id: number): Observable<Produto>{
    return this.http.get<Produto>(`${this.baseUrl}/produto/${id}`);
  }

  deleteById(id: number): Observable<Produto>{
    return this.http.delete<Produto>(`${this.baseUrl}/produto/${id}`);
  }
}
