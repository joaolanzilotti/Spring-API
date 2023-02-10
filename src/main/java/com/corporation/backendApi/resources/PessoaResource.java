package com.corporation.backendApi.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.corporation.backendApi.entities.Pessoa;
import com.corporation.backendApi.services.PessoaService;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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

    @PostMapping
    public ResponseEntity<Pessoa> addPessoa(@RequestBody Pessoa pessoa){

        pessoa = pessoaService.addPessoa(pessoa);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(pessoa.getId()).toUri();

        return ResponseEntity.created(uri).body(pessoa);

    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){

        pessoaService.deletePessoa(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Pessoa> updatePessoa(@PathVariable Long id, @RequestBody Pessoa pessoa){

        pessoa = pessoaService.updatePessoa(id, pessoa);
        return ResponseEntity.ok().body(pessoa);

    }

    
}
