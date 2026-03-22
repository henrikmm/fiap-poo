# FiapRide

Projeto desenvolvido nas aulas de Programacao Orientada a Objetos com Java.

## O que o projeto representa

O `FiapRide` simula um sistema simples de mobilidade urbana. A classe `Passageiro` representa uma pessoa usuaria do sistema, com nome, CPF e saldo para pagar viagens.

O projeto tambem possui a classe `Sapato`, criada como desafio pessoal para praticar modelagem de objetos, metodos e encapsulamento.

## Funcionalidades

### Passageiro

- Criar passageiros com nome e CPF
- Adicionar saldo com validacao
- Pagar viagem com validacao de saldo e valor
- Consultar nome, CPF e saldo com getters

### Sapato

- Definir tamanho, tipo e uso de cadarco
- Validar tamanho maior que zero
- Bloquear sandalia com cadarco
- Consultar os atributos com getters

## Como usar

### SistemaPrincipal

Arquivo: `src/br/com/fiapride/main/SistemaPrincipal.java`

Executa os testes principais do `FiapRide`, criando passageiros, adicionando saldo e simulando o pagamento de viagens.

### TesteSapato

Arquivo: `src/br/com/fiapride/main/TesteSapato.java`

Executa os testes do objeto pessoal `Sapato`, incluindo cenarios validos e invalidos para provar as regras da classe.
