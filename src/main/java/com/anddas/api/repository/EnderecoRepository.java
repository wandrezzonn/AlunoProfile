package com.anddas.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.anddas.api.model.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer>{
	
	@Query(value = "from Endereco where cod_aluno =:id")
	public List<Endereco> buscarEndPorIdAluno(@Param(value = "id") Integer id);

}
