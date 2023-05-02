package com.example.iniciandospringangular.service;

import com.example.iniciandospringangular.persistence.model.Aluno;
import com.example.iniciandospringangular.persistence.reposiotry.AlunoRepository;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public Aluno salvar(Aluno aluno) {
        return alunoRepository.save(aluno);
    }
}
