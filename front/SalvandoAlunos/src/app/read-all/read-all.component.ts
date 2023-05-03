import {Component, OnInit} from '@angular/core';
import {AlunoService} from "../aluno.service";
import {Aluno} from "../Aluno";

@Component({
  selector: 'app-read-all',
  templateUrl: './read-all.component.html',
  styleUrls: ['./read-all.component.css']
})
export class ReadAllComponent implements OnInit{

  public aluno: Aluno[] | undefined;
  constructor(private alunoService: AlunoService) {
  }
  ngOnInit(): void {
    this.alunoService.getAluno().subscribe((data: Aluno[])=>{
      console.log(data);
      this.aluno=data;
    })
  }

}
