package br.com.fiapride.model;

public class Tenis extends Sapato {
    private boolean amortecimento;

    public Tenis(int tamanho, boolean cadarco, Dono dono, boolean amortecimento) {
        super(tamanho, cadarco, dono);
        this.amortecimento = amortecimento;
    }

    public boolean isAmortecimento() {
        return this.amortecimento;
    }
}
