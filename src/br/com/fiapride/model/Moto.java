package br.com.fiapride.model;

public class Moto extends Veiculo {
    private boolean eletrica;

    public Moto(String placa, String modelo, boolean eletrica) {
        super(placa, modelo);
        this.eletrica = eletrica;
    }

    public boolean isEletrica() {
        return this.eletrica;
    }
}
