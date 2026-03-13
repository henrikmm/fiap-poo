package br.com.fiapride.main;

import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.Sapato;

public class SistemaPrincipal {

    public static void main(String[] args) {
        // PASSAGEIROS
    	
    	/*
        Passageiro passageiro1 = new Passageiro("Ana Silva", "222");
        System.out.println("Recarga passageiro 1");
        passageiro1.adicionarSaldo(50.0);

        Passageiro passageiro2 = new Passageiro("Carlos Souza", "333");
        System.out.println("Recarga passageiro 2");
        passageiro2.adicionarSaldo(12.5);

        System.out.println("--- Sistema FiapRide ---");
        
        System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$ " + passageiro1.saldo + " | CPF: " + passageiro1.cpf);
        System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$ " + passageiro2.saldo + " | CPF: " + passageiro2.cpf);
       
        
        
        System.out.println("Pagando viagem do passageiro 1");
        passageiro1.pagarViagem(20);
		
        System.out.println("Pagando viagem do passageiro 2");
        passageiro2.pagarViagem(20);
       	*/

        // SAPATOS
        Sapato sapato1 = new Sapato();
        sapato1.tamanho = 40;
        sapato1.tipo = Sapato.TipoSapato.TENIS;
        sapato1.cadarco = true;

        Sapato sapato2 = new Sapato();
        sapato2.tamanho = 42;
        sapato2.tipo = Sapato.TipoSapato.SANDALIA;
        sapato2.cadarco = false;

        System.out.println("--- Testes dos métodos da classe Sapato ---");

        // teste válido
        sapato1.alterarTipo(Sapato.TipoSapato.BOTA);
        sapato1.alterarCadarco(false);

        // teste inválido
        sapato2.alterarCadarco(true);

        // teste inválido
        sapato1.alterarTipo(null);

        System.out.println("--- Estado final dos sapatos ---");
        System.out.println("Tipo do sapato: " + sapato1.tipo + " | tamanho: " + sapato1.tamanho + " | possui cadarço: " + sapato1.cadarco);
        System.out.println("Tipo do sapato: " + sapato2.tipo + " | tamanho: " + sapato2.tamanho + " | possui cadarço: " + sapato2.cadarco);
    }
}
