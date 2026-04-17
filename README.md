# FiapRide

Projeto desenvolvido nas aulas de Programacao Orientada a Objetos com Java.

## O que o projeto representa

O `FiapRide` simula um sistema simples de mobilidade urbana. A classe `Passageiro` representa uma pessoa usuaria do sistema, com nome, CPF e saldo para pagar viagens.

O projeto tambem possui a hierarquia `Sapato`, criada como desafio pessoal para praticar modelagem de objetos, associacao e heranca.

## Funcionalidades

### Passageiro

- Criar passageiros com nome e CPF
- Adicionar saldo com validacao
- Pagar viagem com validacao de saldo e valor
- Consultar nome, CPF e saldo com getters
- Relacionar `Passageiro` e `Veiculo` por meio da classe `Viagem`
- Especializar `Veiculo` nas subclasses `Carro` e `Moto`

### Sapato

- Relacionar cada sapato com um `Dono`
- Definir tamanho e uso de cadarco
- Validar tamanho maior que zero
- Consultar os atributos com getters
- Especializar `Sapato` nas subclasses `Tenis` e `Bota`

## Como usar

### SistemaPrincipal

Arquivo: `src/br/com/fiapride/main/SistemaPrincipal.java`

Executa os testes principais do `FiapRide`, criando passageiros, adicionando saldo, exibindo uma `Viagem` e testando a heranca de `Veiculo`.

### TesteSapato

Arquivo: `src/br/com/fiapride/main/TesteSapato.java`

Executa os testes do objeto pessoal `Sapato`, incluindo associacao com `Dono` e heranca com `Tenis` e `Bota`.
