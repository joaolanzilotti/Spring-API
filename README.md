# Spring-API

Requisições:

*Java 17*

*Formato JSON*

Buscar Todas Pessoas -> localhost:8080/pessoas

Buscar Pessoas Por Id -> localhost:8080/pessoas/1

Buscar Todos Endereços -> localhost:8080/enderecos

Buscar Endereço por Pessoa -> localhost:8080/enderecos/3

Criar Endereço -> localhost:8080/enderecos/4/add
{
    "logradouro": "Rua Rondonia",
    "cep": "11695108",
    "numero": "50",
    "cidade": "Ubatuba",
    "principal": "true"
}

Inserir Usuário -> localhost:8080/pessoas/add
  {
    "nome": "Joao3",
    "dataNascimento": "2023-02-10"
}

Deletar Usuário por Id-> localhost:8080/pessoas/1

Atualizar Usuário -> localhost:8080/pessoas/1
{
    "nome": "pedro joao",
    "dataNascimento": "2023-02-10"
}
