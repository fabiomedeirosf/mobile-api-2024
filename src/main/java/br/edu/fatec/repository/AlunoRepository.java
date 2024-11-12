package br.edu.fatec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.fatec.model.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer>{

}
