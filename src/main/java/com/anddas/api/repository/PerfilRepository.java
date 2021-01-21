package com.anddas.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anddas.api.model.Perfil;

@Repository
public interface PerfilRepository extends JpaRepository<Perfil, Integer>{

}
