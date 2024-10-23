package br.edu.fatec.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fatec.model.Aluno;

@RestController
public class AlunoController {

	@GetMapping(path = "/alunos")
	public Aluno getAlunos() {
		
		Aluno aluno = new Aluno();
		aluno.setCodigo(123);
		aluno.setNome("Joao da Silva");
		aluno.setCurso("Analise e Desenvolvimento Sistemas");
		
		return aluno;
	}
}
