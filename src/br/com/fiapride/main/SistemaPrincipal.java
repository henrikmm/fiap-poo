package br.com.fiapride.main;

import br.com.fiapride.model.Carro;
import br.com.fiapride.model.Moto;
import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.Veiculo;
import br.com.fiapride.model.Viagem;

public class SistemaPrincipal {

    public static void main(String[] args) {
        System.out.println("--- Iniciando o Sistema FiapRide ---\n");

        Passageiro ana = new Passageiro("Ana Silva", "222.222.222-22");
        System.out.println(">>> Recarga Passageiro Ana:");
        ana.adicionarSaldo(50.0);

        Passageiro carlos = new Passageiro("Carlos Souza", "333.333.333-33");
        System.out.println(">>> Recarga Passageiro Carlos:");
        carlos.adicionarSaldo(12.5);

        Veiculo corolla = new Veiculo("ABC-1234", "Toyota Corolla");
        Viagem viagemCentro = new Viagem("Avenida Paulista", ana, corolla);

        System.out.println("\n--- Status dos Passageiros ---");
        System.out.println("Passageiro: " + ana.getNome() + " | Saldo: R$ " + ana.getSaldo() + " | CPF: " + ana.getCpf());
        System.out.println("Passageiro: " + carlos.getNome() + " | Saldo: R$ " + carlos.getSaldo() + " | CPF: " + carlos.getCpf());

        viagemCentro.exibirResumo();

        System.out.println("\n--- Realizando Viagens ---");
        System.out.println("Pagando viagem do passageiro 1 (Ana)...");
        ana.pagarViagem(20.0);

        System.out.println("\nPagando viagem do passageiro 2 (Carlos)...");
        carlos.pagarViagem(20.0);

        System.out.println("\n--- FIAPRIDE: Teste de Frota ---");
        Carro uberX = new Carro("BRA-2026", "Chevrolet Onix", 4);
        Moto mottu = new Moto("MOT-0101", "Caloi City", true);

        System.out.println("Carro modelo: " + uberX.getModelo() + " | Placa: " + uberX.getPlaca());
        System.out.println("Vagas para passageiros: " + uberX.getCapacidadePassageiros());

        System.out.println("\nMoto modelo: " + mottu.getModelo() + " | Placa: " + mottu.getPlaca());
        if (mottu.isEletrica()) {
            System.out.println("Atencao: Esta moto e eletrica e atinge maiores velocidades!");
        }

        // ana.saldo = 999999.0;
        // O acesso direto ao saldo agora nao compila, porque o atributo esta private.
    }
}
