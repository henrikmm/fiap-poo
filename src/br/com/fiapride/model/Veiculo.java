package br.com.fiapride.model;

public class Veiculo {
    // Atributos privados para proteger o estado do objeto.
    private String dono;
    private String placa;
    private double gasolina;

    public String getDono() {
        return this.dono;
    }

    public void definirDono(String dono) {
        if (dono == null || dono.trim().isEmpty()) {
            System.out.println("Erro: o nome do dono nao pode ser vazio.");
            return;
        }

        this.dono = dono;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void definirPlaca(String placa) {
        if (placa == null || placa.trim().isEmpty()) {
            System.out.println("Erro: a placa nao pode ser vazia.");
            return;
        }

        this.placa = placa;
    }

    public double getGasolina() {
        return this.gasolina;
    }

    public void adicionarGasolina(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: a quantidade de gasolina deve ser maior que zero.");
            return;
        }

        this.setGasolina(this.getGasolina() + valor);
        System.out.println("Abastecimento realizado. Gasolina atual: " + this.getGasolina());
    }

    public void gastarGasolina(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: o gasto de gasolina deve ser maior que zero.");
            return;
        }

        if (this.getGasolina() < valor) {
            System.out.println("Erro: gasolina insuficiente para realizar o gasto.");
            return;
        }

        this.setGasolina(this.getGasolina() - valor);
        System.out.println("Consumo registrado. Gasolina restante: " + this.getGasolina());
    }

    // Apenas a propria classe altera o combustivel diretamente.
    private void setGasolina(double gasolina) {
        if (gasolina >= 0) {
            this.gasolina = gasolina;
        } else {
            System.out.println("Erro de seguranca: tentativa de definir gasolina negativa bloqueada.");
        }
    }
}
