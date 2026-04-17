package br.com.fiapride.model;

public class Dono {
    private String nome;
    private String cpf;

    public Dono(String nome, String cpf) {
        this.setNome(nome);
        this.setCpf(cpf);
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    private void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Erro: o nome do dono nao pode ser vazio.");
            return;
        }

        this.nome = nome;
    }

    private void setCpf(String cpf) {
        if (cpf == null || cpf.trim().isEmpty()) {
            System.out.println("Erro: o CPF do dono nao pode ser vazio.");
            return;
        }

        this.cpf = cpf;
    }
}
