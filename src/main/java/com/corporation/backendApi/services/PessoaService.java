package com.corporation.backendApi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corporation.backendApi.entities.Pessoa;
import com.corporation.backendApi.repositories.PessoaRepository;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<Pessoa> findAllPessoas(){
        return pessoaRepository.findAll();
    }

    public Pessoa findById(Long id){
        Optional<Pessoa> pessoa = pessoaRepository.findById(id);
        return pessoa.get();
    }

    public Pessoa addPessoa(Pessoa pessoa){
        return pessoaRepository.save(pessoa);

    }

    public void deletePessoa(Long id){
        pessoaRepository.deleteById(id);
    }

    public Pessoa updatePessoa(Long id, Pessoa pessoa){
        Pessoa entity = pessoaRepository.getReferenceById(id);
        updateData(entity, pessoa);
        return pessoaRepository.save(entity);
    }

    private void updateData(Pessoa entity, Pessoa pessoa) {

        entity.setNome(pessoa.getNome());
        entity.setDataNascimento(pessoa.getDataNascimento());

    }


}
