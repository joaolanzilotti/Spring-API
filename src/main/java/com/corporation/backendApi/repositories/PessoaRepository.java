package com.corporation.backendApi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.corporation.backendApi.entities.Pessoa;

public interface  PessoaRepository extends JpaRepository<Pessoa, Long> {
    
}
