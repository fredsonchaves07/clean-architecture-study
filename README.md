# clean-architecture-study
clean architecture study note repository

## O que é arquitetura de software?
- Definição de como os componentes estão organizados, suas propriedades externos e relacionamentos com as interfaces e serviços
- Conjunto de decisões de projeto principais que governam um sistema
- Possui 4 aspectos: (Estrutura, características, decisões de projeto, princípios de projeto)
- A estrutura consiste no estilo arquitetural utilizada no sistema (microserviços, monolitico, microkernel, etc)
- As características define quanto escalável é (escalibilidade), quão confiável é (confiabilidade) quão estável é (testabilidade)
- Decisões arquitetônicas do projeto consistem em, por exemplo, somente as camadas de negócio e serviço se comunicarão com o banco de dados
- O quarto aspecto refere-se aos príncipios de projeto adotados para guiar o desenvolvimento da arquitetura (decisões que envolvem equipes de desenvolvimentos)
![file2](https://user-images.githubusercontent.com/43495376/174696508-376103f8-9b5d-45db-8ec6-5e8ebe7cd645.png)

## Qual objetivo da arquitetura de software?
- Reduzir custos com pessoal;
- Faciltiar o processo de alteração de software;
- Minimizar o lead time de maneira sustetável (Tempo para encontrar solução de um problema)
- Desenvolver sistemas com uma arquitetura de componentes plugáveis
