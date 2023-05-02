package com.example.iniciandospringangular.persistence.reposiotry;

import com.example.iniciandospringangular.persistence.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
