# Introdução

## O que é arquitetura de software?

- Definição de como os componentes estão organizados, suas propriedades externos e relacionamentos com as interfaces e
  serviços
- Conjunto de decisões de projeto principais que governam um sistema
- Possui 4 aspectos: (Estrutura, características, decisões de projeto, princípios de projeto)
- A estrutura consiste no estilo arquitetural utilizada no sistema (microserviços, monolitico, microkernel, etc)
- As características define quanto escalável é (escalibilidade), quão confiável é (confiabilidade) quão estável é (
  testabilidade)
- Decisões arquitetônicas do projeto consistem em, por exemplo, somente as camadas de negócio e serviço se comunicarão
  com o banco de dados
- O quarto aspecto refere-se aos príncipios de projeto adotados para guiar o desenvolvimento da arquitetura (decisões
  que envolvem equipes de desenvolvimentos)
  ![file2](https://user-images.githubusercontent.com/43495376/174696508-376103f8-9b5d-45db-8ec6-5e8ebe7cd645.png)

## Qual objetivo da arquitetura de software?

- Reduzir custos com pessoal;
- Faciltiar o processo de alteração de software;
- Minimizar o lead time de maneira sustetável (Tempo para encontrar solução de um problema)
- Desenvolver sistemas com uma arquitetura de componentes plugáveis

## Arquitetura Hexagonal

- Possibilitar que por um lado, uma aplicação seja executada a partir de usuários, programas, testes automatizados ou
  scripts
- Por outro lado, seja desenvolvida e testada isolada de seus dispositivos e bancos de dados necessários
- Possibilitar o desacoplamento entre a execução e conexão com outros dispositivos
  ![file3](https://user-images.githubusercontent.com/43495376/176062327-a3bf2d04-ab7a-44be-90c7-3f561d1c4306.png)

## Caracterísiticas de uma arquitetura limpa

- [x] Independente de frameworks
- [x] Testável
- [x] Independente de interfaces gráficas
- [x] Independente de banco de dados

![file4](https://user-images.githubusercontent.com/43495376/176062998-1e0f89d9-46fb-4318-a032-607026ee9a7d.png)

### Camada de Entidades

- Encapsulam as regras mais gerais e de mais alto nível. São as partes do sistema com menor probabilidade de serem
  alteradas.
- Nenhuma modificação operacional deverá afetar a camada de entidades

### Camada de Casos de Uso

- Contém as regras de negócio específicas da aplicação
- Camada que implementa todos os casos de uso do sistema, as operações de mais alto nível que os usuários ou outros do
  sistema realizam.

### Camada de Adaptadores de Interface

- Conjunto de adaptadores que convertem os dados no formato mais conveniente para os casos de uso e entidades.
- Contém, por exemplo, a implementação de todo o padrão MVC, os presenters, views e controllers, repositórios etc.

### Camada de Frameworks e Drivers

- Camada mais externa que contém os frameworks, bibliotecas e outras ferramentas

### Camada Principal e de Configuração

- Camada opcional onde pode conter os módulos principais e configurações da aplicação
