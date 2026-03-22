package br.com.fiapride.main;

import br.com.fiapride.model.veiculos;

public class principal {

    public static void main(String[] args) {

        veiculos v1 = new veiculos();

        v1.individuo = "Carlos";

        v1.pl = "ABC-1234";

        v1.gas = -10;

        v1.adicionar(50);

        v1.gasta(100);

        System.out.println("Dono: " + v1.individuo + " | Placa: " + v1.pl + " | Gasolina: " + v1.gas);

    }
}
