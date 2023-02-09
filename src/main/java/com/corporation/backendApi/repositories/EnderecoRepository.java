package com.corporation.backendApi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.corporation.backendApi.entities.Endereco;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface EnderecoRepository extends JpaRepository<Endereco, Long>{

    @Query("SELECT e from Endereco e INNER JOIN e.pessoa p where p.id = :idPessoa")
    List<Endereco> findAllEnderecosPessoa(@Param("idPessoa") Long id);
    
}
