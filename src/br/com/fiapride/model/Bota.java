package br.com.fiapride.model;

public class Bota extends Sapato {
    private boolean canoAlto;

    public Bota(int tamanho, boolean cadarco, Dono dono, boolean canoAlto) {
        super(tamanho, cadarco, dono);
        this.canoAlto = canoAlto;
    }

    public boolean isCanoAlto() {
        return this.canoAlto;
    }
}
