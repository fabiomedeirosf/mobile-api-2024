package br.edu.fatec.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fatec.model.Aluno;

@RestController
public class AlunoController {

	private List<Aluno> listaAlunos = new ArrayList<>();
	
	@GetMapping(path = "/alunos")
	public List<Aluno> getAlunos() {
		
		return this.listaAlunos;
	}
	
	@PostMapping(path = "/alunos")
	public ResponseEntity<?> save(@RequestBody Aluno aluno) {
		
		for(Aluno a : this.listaAlunos) {
			
			if(a.getCpf().equals(aluno.getCpf())) {
				return ResponseEntity
						.status(HttpStatus.CONFLICT)
						.body(null);
			}
		}
		
		Integer codigo = (int) (Math.random() * 1000);
		aluno.setCodigo(codigo);
		
		this.listaAlunos.add(aluno);
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(aluno);
	}
}
