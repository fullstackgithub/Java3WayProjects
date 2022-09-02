import { HttpClient } from '@angular/common/http';
import { environment } from './../../environments/environment';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Categoria } from '../models/categoria.model';
import { MatSnackBar } from '@angular/material/snack-bar';

@Injectable({
  providedIn: 'root'
})
export class CategoriaService {

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

  read(): Observable<Categoria[]>{
    return this.http.get<Categoria[]>(`${this.baseUrl}/categorias`);
  }

  create(categoria: Categoria): Observable<Categoria>{
    return this.http.post<Categoria>(`${this.baseUrl}/categoria`, categoria);
  }

  update(categoria: Categoria): Observable<Categoria>{
    return this.http.put<Categoria>(`${this.baseUrl}/categoria`, categoria);
  }

  readById(id: number): Observable<Categoria>{
    return this.http.get<Categoria>(`${this.baseUrl}/categoria/${id}`);
  }

  deleteById(id: number): Observable<Categoria>{
    return this.http.delete<Categoria>(`${this.baseUrl}/categoria/${id}`);
  }
}
