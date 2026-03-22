package br.com.fiapride.main;

import br.com.fiapride.model.Veiculo;

public class Principal {

    public static void main(String[] args) {
        System.out.println("--- CP1: Missao Refatoracao do Modulo de Frota ---\n");

        Veiculo veiculo1 = new Veiculo();

        // Cadastro inicial do veiculo.
        veiculo1.definirDono("Carlos");
        veiculo1.definirPlaca("ABC-1234");

        System.out.println("Tentando abastecer com valor invalido:");
        veiculo1.adicionarGasolina(-10);

        System.out.println("\nAbastecendo o veiculo:");
        veiculo1.adicionarGasolina(50);

        System.out.println("\nTentando gastar mais gasolina do que o disponivel:");
        veiculo1.gastarGasolina(100);

        System.out.println("\nRegistrando um consumo valido:");
        veiculo1.gastarGasolina(20);

        System.out.println("\n--- Estado final do veiculo ---");
        System.out.println(
            "Dono: " + veiculo1.getDono()
                + " | Placa: " + veiculo1.getPlaca()
                + " | Gasolina: " + veiculo1.getGasolina()
        );
    }
}
