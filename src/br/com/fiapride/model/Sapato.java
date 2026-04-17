package br.com.fiapride.model;

public class Sapato {
    private int tamanho;
    private boolean cadarco;
    private Dono dono;

    public Sapato(int tamanho, boolean cadarco, Dono dono) {
        this.setTamanho(tamanho);
        this.setCadarco(cadarco);
        this.setDono(dono);
        System.out.println(
            "Sapato criado com tamanho " + this.tamanho
                + ", cadarco " + this.cadarco
                + " e dono " + (this.dono != null ? this.dono.getNome() : "nao informado") + "."
        );
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public boolean isCadarco() {
        return this.cadarco;
    }

    public Dono getDono() {
        return this.dono;
    }

    public void ajustarCadarco(boolean possuiCadarco) {
        this.setCadarco(possuiCadarco);
    }

    private void setTamanho(int tamanho) {
        if (tamanho <= 0) {
            System.out.println("Erro: o tamanho do sapato deve ser maior que zero.");
            return;
        }

        this.tamanho = tamanho;
    }

    private void setCadarco(boolean possuiCadarco) {
        this.cadarco = possuiCadarco;
        System.out.println("Cadarco alterado com sucesso para: " + this.cadarco);
    }

    private void setDono(Dono dono) {
        if (dono == null) {
            System.out.println("Erro: o dono do sapato nao pode ser nulo.");
            return;
        }

        this.dono = dono;
    }
}
