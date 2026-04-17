package br.com.fiapride.main;

import br.com.fiapride.model.Bota;
import br.com.fiapride.model.Dono;
import br.com.fiapride.model.Tenis;

public class TesteSapato {

    public static void main(String[] args) {
        Dono dono1 = new Dono("Marina Costa", "444.444.444-44");
        Dono dono2 = new Dono("Pedro Lima", "555.555.555-55");

        Tenis tenisCorrida = new Tenis(40, true, dono1, true);
        Bota botaTrilha = new Bota(42, true, dono2, true);

        System.out.println("--- Testes da hierarquia de Sapato ---");

        tenisCorrida.ajustarCadarco(false);
        botaTrilha.ajustarCadarco(true);

        System.out.println("--- Estado final dos sapatos ---");
        System.out.println(
            "Tenis do dono " + tenisCorrida.getDono().getNome()
                + " | tamanho: " + tenisCorrida.getTamanho()
                + " | possui cadarco: " + tenisCorrida.isCadarco()
                + " | amortecimento: " + tenisCorrida.isAmortecimento()
        );
        System.out.println(
            "Bota do dono " + botaTrilha.getDono().getNome()
                + " | tamanho: " + botaTrilha.getTamanho()
                + " | possui cadarco: " + botaTrilha.isCadarco()
                + " | cano alto: " + botaTrilha.isCanoAlto()
        );
    }
}
