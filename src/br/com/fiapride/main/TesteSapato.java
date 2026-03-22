package br.com.fiapride.main;

import br.com.fiapride.model.Sapato;

public class TesteSapato {

    public static void main(String[] args) {
        Sapato sapato1 = new Sapato();
        sapato1.setTamanho(40);
        sapato1.setTipo(Sapato.TipoSapato.TENIS);
        sapato1.setCadarco(true);

        Sapato sapato2 = new Sapato();
        sapato2.setTamanho(42);
        sapato2.setTipo(Sapato.TipoSapato.SANDALIA);
        sapato2.setCadarco(false);

        System.out.println("--- Testes dos metodos da classe Sapato ---");

        sapato1.setTipo(Sapato.TipoSapato.BOTA);
        sapato1.setCadarco(false);

        sapato2.setCadarco(true);
        sapato1.setTipo(null);
        sapato2.setTamanho(-1);

        System.out.println("--- Estado final dos sapatos ---");
        System.out.println("Tipo do sapato: " + sapato1.getTipo() + " | tamanho: " + sapato1.getTamanho() + " | possui cadarco: " + sapato1.isCadarco());
        System.out.println("Tipo do sapato: " + sapato2.getTipo() + " | tamanho: " + sapato2.getTamanho() + " | possui cadarco: " + sapato2.isCadarco());
    }
}
