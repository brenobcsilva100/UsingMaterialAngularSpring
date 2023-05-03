import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Aluno} from "./Aluno";

@Injectable({
  providedIn: 'root'
})
export class AlunoService {

  private baseUrl = "localhost:8080/mostrarAluno";
  constructor(private http: HttpClient) { }

  getAluno(): Observable<Aluno[]>{
    return this.http.get<Aluno[]>(`${this.baseUrl}`);
  }
}
