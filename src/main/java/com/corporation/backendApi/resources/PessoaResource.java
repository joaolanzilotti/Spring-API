package com.corporation.backendApi.resources;

import java.sql.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/pessoas")
public class PessoaResource {

    private Date dataHoje;

    // @GetMapping
    // public ResponseEntity<Pessoa> findAll(){
         
    //     Pessoa pessoa = new Pessoa(1L, "Joao", dataHoje);
    //     return ResponseEntity.ok().body(pessoa);
    // }
    
}
