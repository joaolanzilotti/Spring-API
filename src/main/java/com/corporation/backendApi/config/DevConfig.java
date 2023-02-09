package com.corporation.backendApi.config;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.corporation.backendApi.repositories.EnderecoRepository;
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

    @Autowired
    private EnderecoRepository enderecoRepository;
    
    @Override
    public void run(String... args) throws Exception {
        
        Pessoa pessoa = new Pessoa(null, "Joao", new Date());
        Pessoa pessoa2 = new Pessoa(null, "Joana", new Date());
        Pessoa pessoa3 = new Pessoa(null, "Doido", new Date());

        Endereco endereco = new Endereco(null, "Rua Maranhao", 11695108, 50, "Ubatuba", pessoa);
        Endereco endereco2 = new Endereco(null, "Rua Maranhao", 116454108, 75, "Ubatuba", pessoa2);
        Endereco endereco3 = new Endereco(null, "Rua Merda", 116454108, 75, "Ubatuba", pessoa3);
        Endereco endereco4 = new Endereco(null, "Rua Doida", 116454108, 75, "Ubatuba", pessoa3);
        Endereco endereco5 = new Endereco(null, "Rua Aguia", 116454108, 75, "Ubatuba", pessoa3);

        pessoaRepository.saveAll(Arrays.asList(pessoa, pessoa2, pessoa3));
        enderecoRepository.saveAll(Arrays.asList(endereco, endereco2,endereco3, endereco4, endereco5));


    }
    
}
