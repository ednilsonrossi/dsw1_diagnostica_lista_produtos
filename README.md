# Lista de produtos

Este projeto faz parte da avaliação diagnóstica da disciplina Desenvolvimento de Software para Web 1, ministrada pelo prof. Ednilson Rossi, no IFSP, Campus Araraquara.

## Objetivo

O objetivo deste projeto é trabalhar o uso de objetos da interface List (java.util.List), compreender e implementar o Design Pattern Strategy e manipular dos utilizando comparações e ordenações.

## Enunciado

Desenvolva um sistema de gerenciamento de produtos que permite aos usuários adicionar produtos e exibir a lista de produtos de acordo com diferentes critérios de ordenação. O sistema deve utilizar uma lista para armazenar os produtos e permitir que o usuário escolha como deseja ordenar os produtos (por nome, preço ou quantidade). O padrão de projeto Strategy deve ser utilizado para implementar as diferentes estratégias de ordenação.

Requisitos:

- Crie uma classe `Produto` com os seguintes atributos:
    - `String nome`
    - `double preco`
    - `int quantidade`
  
- Crie uma interface `OrdenacaoStrategy` que defina um método:
    - `public void ordenar(List<Produto> produtos);`

- Implemente três classes concretas que implementam a interface `OrdenacaoStrategy`:
    - `OrdenarPorNome`: ordena os produtos pelo nome (ordem alfabética).
    - `OrdenarPorPreco`: ordena os produtos pelo preço (crescente).
    - `OrdenarPorQuantidade`: ordena os produtos pela quantidade (decrescente).

- Crie uma classe `ListaDeProdutos` que contém:
    - Uma lista de produtos (`List<Produto>`)
    - Um método `adicionarProduto(Produto produto)` para adicionar produtos à lista.
    - Um método `setOrdenacaoStrategy(OrdenacaoStrategy strategy)` para definir a estratégia de ordenação a ser utilizada.
    - Um método `ordenar()` que ordena os produtos de acordo com a estratégia definida.
    - Um método `exibirProdutos()` que imprime os produtos ordenados no console.


No método main, crie uma instância de ListaDeProdutos, adicione alguns produtos e permita que o usuário escolha como deseja ordená-los (por nome, preço ou quantidade).

Exemplo de saída no console:


```
Escolha a forma de ordenação:
1 - Ordenar por Nome
2 - Ordenar por Preço
3 - Ordenar por Quantidade
Opção: 2

Produtos ordenados por preço:
Nome: Cadeira, Preço: 150.0, Quantidade: 5
Nome: Mesa, Preço: 300.0, Quantidade: 2
Nome: Computador, Preço: 2000.0, Quantidade: 1
