package br.com.fiapride.model;

public class Carro extends Veiculo {
    private int capacidadePassageiros;

    public Carro(String placa, String modelo, int capacidadePassageiros) {
        super(placa, modelo);
        this.setCapacidadePassageiros(capacidadePassageiros);
    }

    public int getCapacidadePassageiros() {
        return this.capacidadePassageiros;
    }

    private void setCapacidadePassageiros(int capacidadePassageiros) {
        if (capacidadePassageiros <= 0) {
            System.out.println("Erro: a capacidade de passageiros deve ser maior que zero.");
            return;
        }

        this.capacidadePassageiros = capacidadePassageiros;
    }
}
