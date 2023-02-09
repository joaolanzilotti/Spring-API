package com.corporation.backendApi.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corporation.backendApi.entities.Pessoa;
import com.corporation.backendApi.services.PessoaService;

@RestController
@RequestMapping(value="/pessoas")
public class PessoaResource {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping
    public ResponseEntity<List<Pessoa>> findAll(){
         List<Pessoa> listaPessoas = pessoaService.findAllPessoas();
        
        return ResponseEntity.ok().body(listaPessoas);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Pessoa> findById(@PathVariable Long id){

        Pessoa pessoa = pessoaService.findById(id);
        return ResponseEntity.ok().body(pessoa);

    }
    
}
