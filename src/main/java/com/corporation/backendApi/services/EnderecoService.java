package com.corporation.backendApi.services;

import com.corporation.backendApi.entities.Endereco;
import com.corporation.backendApi.repositories.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public List<Endereco> findAllEnderecos(){
        return enderecoRepository.findAll();
    }

    public List<Endereco> findByIdEnderecoPessoa(Long id){
        List<Endereco> endereco = enderecoRepository.findAllEnderecosPessoa(id);
        return endereco;
    }
    
}
