package br.com.fiapride.model;

// A Classe define a estrutura. Ela nao e o passageiro real, e apenas o modelo.
public class Passageiro {
    // Agora os dados estao protegidos dentro da classe.
    private String nome;
    private String cpf;
    private double saldo;

    public Passageiro(String nome, String cpf) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setSaldo(0.0);
    }

    public String getNome() {
        return this.nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    private void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return this.saldo;
    }

    private void setSaldo(double valor) {
        if (valor >= 0) {
            this.saldo = valor;
        } else {
            System.out.println("Erro de seguranca: tentativa de definir saldo negativo bloqueada!");
        }
    }

    public void adicionarSaldo(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: O valor de recarga deve ser maior que zero.");
            return;
        }

        this.setSaldo(this.getSaldo() + valor);
        System.out.println("Recarga realizada. Novo saldo: " + this.getSaldo());
    }

    public void pagarViagem(double custo) {
        if (custo <= 0) {
            System.out.println("Erro: O custo da viagem e invalido.");
            return;
        }

        if (this.getSaldo() < custo) {
            System.out.println("Erro: Saldo insuficiente para realizar a viagem.");
            return;
        }

        this.setSaldo(this.getSaldo() - custo);
        System.out.println("Viagem paga. Saldo restante: " + this.getSaldo());
    }
}
