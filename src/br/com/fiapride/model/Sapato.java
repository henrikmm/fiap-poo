package br.com.fiapride.model;

public class Sapato {
    private int tamanho;
    private TipoSapato tipo;
    private boolean cadarco;

    public enum TipoSapato {
        TENIS,
        BOTA,
        SAPATO_SOCIAL,
        SANDALIA
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(int tamanho) {
        if (tamanho <= 0) {
            System.out.println("Erro: o tamanho do sapato deve ser maior que zero.");
            return;
        }

        this.tamanho = tamanho;
    }

    public TipoSapato getTipo() {
        return this.tipo;
    }

    public void setTipo(TipoSapato novoTipo) {
        if (novoTipo == null) {
            System.out.println("Erro: o tipo do sapato nao pode ser nulo.");
            return;
        }

        if (novoTipo == TipoSapato.SANDALIA && this.cadarco) {
            System.out.println("Erro: sandalia nao pode possuir cadarco.");
            return;
        }

        this.tipo = novoTipo;
        System.out.println("Tipo alterado com sucesso para: " + this.tipo);
    }

    public boolean isCadarco() {
        return this.cadarco;
    }

    public void setCadarco(boolean possuiCadarco) {
        if (this.tipo == TipoSapato.SANDALIA && possuiCadarco) {
            System.out.println("Erro: sandalia nao pode possuir cadarco.");
            return;
        }

        this.cadarco = possuiCadarco;
        System.out.println("Cadarco alterado com sucesso para: " + this.cadarco);
    }
}
