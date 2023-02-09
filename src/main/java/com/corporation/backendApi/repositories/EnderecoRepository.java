package com.corporation.backendApi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.corporation.backendApi.entities.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long>{
    
}
