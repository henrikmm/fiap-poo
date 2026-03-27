package br.com.fiapride.main;

import br.com.fiapride.model.Veiculo;

public class Principal {

    public static void main(String[] args) {
        System.out.println("--- Aula 4: Teste da classe Veiculo ---\n");

        Veiculo veiculo1 = new Veiculo("ABC-1234", "Toyota Corolla");

        System.out.println("\nSolicitando uma troca valida de placa:");
        veiculo1.atualizarPlaca("BRA-2026");

        System.out.println("\nSolicitando uma troca invalida de placa:");
        veiculo1.atualizarPlaca("   ");

        System.out.println("\n--- Estado final do veiculo ---");
        System.out.println(
            "Modelo: " + veiculo1.getModelo()
                + " | Placa: " + veiculo1.getPlaca()
        );
    }
}
