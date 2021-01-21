package com.anddas.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.anddas.api.model.Aluno;
import com.anddas.api.repository.AlunoRepository;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

	@Autowired
	private AlunoRepository alunoRepo;

	@Autowired

	@GetMapping
	public List<Aluno> getAlunos() {
		return alunoRepo.findAll();
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Aluno salvar(@RequestBody Aluno aluno) {
		return alunoRepo.save(aluno);
		
	}
	
	@PutMapping
	public ResponseEntity<Aluno> atualizar(@RequestBody Aluno aluno){
		Optional<Aluno> a = alunoRepo.findById(aluno.getCodAluno());
		if(a.isPresent()) {
			
			return ResponseEntity.ok(alunoRepo.save(aluno));
		}
		
		return ResponseEntity.notFound().build();
	}
	
	@DeleteMapping("/{idAluno}")
	public ResponseEntity<Void> deletar(@PathVariable("idAluno") Integer id){
		Optional<Aluno> aluno = alunoRepo.findById(id);
		if(aluno.isPresent()) {
			alunoRepo.deleteById(id);
			return ResponseEntity.ok().build();
		}
		
		return ResponseEntity.noContent().build();
		
	}
	

	
	
}
