package com.anddas.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anddas.api.model.Endereco;
import com.anddas.api.repository.EnderecoRepository;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {
	
	@Autowired
	private EnderecoRepository endRepor;
	
	@GetMapping
	public List<Endereco> enderecos(){
		return endRepor.findAll();
	}

	
	@GetMapping("/aluno/{id}")
	public ResponseEntity<List<Endereco>> alunoEnd(@RequestBody  @PathVariable("id") Integer id) {
		List<Endereco> end = endRepor.buscarEndPorIdAluno(id);
		if(end.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(end);
	}
}
