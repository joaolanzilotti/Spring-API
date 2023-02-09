package com.corporation.backendApi.resources;

import com.corporation.backendApi.entities.Endereco;
import com.corporation.backendApi.entities.Pessoa;
import com.corporation.backendApi.services.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/enderecos")
public class EnderecoResource {

    @Autowired
    private EnderecoService enderecoService;

    @GetMapping
    public ResponseEntity<List<Endereco>> findAll(){
         List<Endereco> listaEnderecos = enderecoService.findAllEnderecos();
        
        return ResponseEntity.ok().body(listaEnderecos);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<List<Endereco>> findByIdEnderecoPessoa(@PathVariable Long id){

        List<Endereco> listaEndereco = enderecoService.findByIdEnderecoPessoa(id);
        return ResponseEntity.ok().body(listaEndereco);

    }
    
}
