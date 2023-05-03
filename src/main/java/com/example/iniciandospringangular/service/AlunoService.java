package com.example.iniciandospringangular.service;

import com.example.iniciandospringangular.exceptions.ObjectNotFoundException;
import com.example.iniciandospringangular.persistence.model.Aluno;
import com.example.iniciandospringangular.persistence.reposiotry.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    private final AlunoRepository alunoRepository;
    private final Aluno aluno;

    @Autowired
    public AlunoService(AlunoRepository alunoRepository, Aluno aluno) {
        this.alunoRepository = alunoRepository;
        this.aluno = aluno;
    }

    public Aluno salvar(Aluno aluno) throws Exception {
        Aluno save = alunoRepository.save(aluno);
        if(save.getNome().startsWith("0") || save.getNome().startsWith("1")|| save.getNome().startsWith("2")
                || save.getNome().startsWith("3")|| save.getNome().startsWith("4")|| save.getNome().startsWith("5")
                || save.getNome().startsWith("6")|| save.getNome().startsWith("7")|| save.getNome().startsWith("8")
                || save.getNome().startsWith("9")){
            System.out.println("Nao pode salvar nome com zero.");
            save.setNome("");
        }else if(save.getNome().equals(" ")){
            System.out.println("Nao pode salvar nome vazio");
            save.setNome(" ");
        }else if(save.getNome().length()<2){
            throw new ObjectNotFoundException("Nao pode ter poucos caracteres no nome" + save.getNome());
        }
        return aluno;
    }

    public List<Aluno> mostrar() {
        return alunoRepository.findAll();
    }
}
