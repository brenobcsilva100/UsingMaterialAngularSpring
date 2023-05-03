package com.example.iniciandospringangular.controller;

import com.example.iniciandospringangular.persistence.model.Aluno;
import com.example.iniciandospringangular.service.AlunoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class AlunoController {

    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @PostMapping("/cadastrarAluno")
    public ResponseEntity<Aluno> cadastrandoAluno(@RequestBody Aluno aluno) throws Exception {
        alunoService.salvar(aluno);
        return new ResponseEntity<>(alunoService.salvar(aluno), HttpStatus.CREATED);
    }

    @GetMapping("/mostrarAluno")
    public ResponseEntity<List<Aluno>> cadastrandoAluno(){
        return new ResponseEntity<>(alunoService.mostrar(), HttpStatus.OK);
    }

}
