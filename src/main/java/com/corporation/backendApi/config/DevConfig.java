package com.corporation.backendApi.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.corporation.backendApi.entities.Endereco;
import com.corporation.backendApi.entities.Pessoa;
import com.corporation.backendApi.repositories.PessoaRepository;

@Configuration
@Profile("dev")
public class DevConfig implements CommandLineRunner{

    @Autowired
    private PessoaRepository pessoaRepository;
    
    @Override
    public void run(String... args) throws Exception {
        
        Endereco endereco = new Endereco(1L, "Rua Maranhão", 11695108, 50, "Ubatuba", null);
        Pessoa pessoa = new Pessoa(1L, "João", null, null);
        Pessoa pessoa2 = new Pessoa(2L, "Joana", null, null);

        pessoaRepository.saveAll(Arrays.asList(pessoa, pessoa2));
    }
    
}
