package br.com.fiapride.main;

import br.com.fiapride.model.Sapato;

public class TesteSapato {

    public static void main(String[] args) {
        Sapato sapato1 = new Sapato(40, Sapato.TipoSapato.TENIS, true);
        Sapato sapato2 = new Sapato(42, Sapato.TipoSapato.SANDALIA, false);

        System.out.println("--- Testes dos metodos da classe Sapato ---");

        sapato1.ajustarCadarco(false);
        sapato2.ajustarCadarco(true);

        System.out.println("--- Estado final dos sapatos ---");
        System.out.println("Tipo do sapato: " + sapato1.getTipo() + " | tamanho: " + sapato1.getTamanho() + " | possui cadarco: " + sapato1.isCadarco());
        System.out.println("Tipo do sapato: " + sapato2.getTipo() + " | tamanho: " + sapato2.getTamanho() + " | possui cadarco: " + sapato2.isCadarco());
    }
}
