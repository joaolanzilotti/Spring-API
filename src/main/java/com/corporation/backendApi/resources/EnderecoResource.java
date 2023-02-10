package com.corporation.backendApi.resources;

import com.corporation.backendApi.entities.Endereco;
import com.corporation.backendApi.entities.Pessoa;
import com.corporation.backendApi.services.EnderecoService;
import com.corporation.backendApi.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/enderecos")
public class EnderecoResource {

    @Autowired
    private EnderecoService enderecoService;

    @Autowired
    private PessoaService pessoaService;

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

    @PostMapping(value = "/{id}/add")
    public ResponseEntity<Endereco> addEndereco(@PathVariable Long id ,@RequestBody Endereco endereco){
        Pessoa pessoa = pessoaService.findById(id);
        endereco.setPessoa(pessoa);

        endereco = enderecoService.addEnderecoPessoa(endereco);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(endereco.getId()).toUri();

        return ResponseEntity.created(uri).body(endereco);

    }
    
}
