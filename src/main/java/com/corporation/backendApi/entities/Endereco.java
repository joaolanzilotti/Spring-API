package com.corporation.backendApi.entities;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name= "tb_Endereco")
public class Endereco implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String logradouro;
    private int cep;
    private int numero;
    private String cidade;
    @ManyToOne
    @JoinColumn(name = "pessoa_id")
    private Pessoa pessoa;

    
}
