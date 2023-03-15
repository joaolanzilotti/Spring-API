
Requisições: *Java 17* - *JSON*

*Spring API*
-----------------------------------------------------------------------------

Buscar Todas Pessoas -> localhost:8080/pessoas

-----------------------------------------------------------------------------

Buscar Pessoas Por Id -> localhost:8080/pessoas/1

-----------------------------------------------------------------------------

Buscar Todos Endereços -> localhost:8080/enderecos

-----------------------------------------------------------------------------

Buscar Endereço por Pessoa -> localhost:8080/enderecos/3

-----------------------------------------------------------------------------

Criar Endereço -> localhost:8080/enderecos/4/add

{
    "logradouro": "Rua Rondonia",
    "cep": "11695108",
    "numero": "50",
    "cidade": "Ubatuba",
    "principal": "true"
}

-----------------------------------------------------------------------------

Inserir Usuário -> localhost:8080/pessoas/add

  {
    "nome": "Joao3",
    "dataNascimento": "2023-02-10"
}

-----------------------------------------------------------------------------

Deletar Usuário por Id-> localhost:8080/pessoas/1

-----------------------------------------------------------------------------

Atualizar Usuário -> localhost:8080/pessoas/1

{
    "nome": "pedro joao",
    "dataNascimento": "2023-02-10"
}

-----------------------------------------------------------------------------
<a href="https://github.com/joaosinho2/Spring-API" target="_blank"><img align="center" alt="JP-HTML" height="500" width="800" src="https://user-images.githubusercontent.com/71307203/218142885-cf8e98bd-3185-4b42-a482-bb07262ff8f2.png"></a>
