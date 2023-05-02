package com.example.iniciandospringangular.controller;

import com.example.iniciandospringangular.persistence.model.Aluno;
import com.example.iniciandospringangular.service.AlunoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlunoController {

    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @PostMapping("/cadastrarAluno")
    public ResponseEntity<Aluno> cadastrandoAluno(@RequestBody Aluno aluno){
        return new ResponseEntity<>(alunoService.salvar(aluno), HttpStatus.CREATED);
    }

}
