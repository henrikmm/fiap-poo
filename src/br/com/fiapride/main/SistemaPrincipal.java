package br.com.fiapride.main;

// Importamos a classe Passageiro para que o sistema a reconheça
import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.Sapato;
import br.com.fiapride.model.Sapato.TipoSapato;


public class SistemaPrincipal {

    public static void main(String[] args) {
        // INSTANCIAÇÃO
        // O comando 'new' aloca memória para um novo objeto.
        // Criando o primeiro passageiro (Objeto 1)
    //  Passageiro passageiro1 = new Passageiro();
    //  passageiro1.nome = "Ana Silva";
    //  passageiro1.saldo = 50.0;

        // Criando o segundo passageiro (Objeto 2)
    //  Passageiro passageiro2 = new Passageiro();
    //  passageiro2.nome = "Carlos Souza";
    //  passageiro2.saldo = 12.50;
        
        //  Instaciação
        // Criando o primeiro sapato (objeto1)
        Sapato sapato1 = new Sapato();
       sapato1.tamanho = 40;
       sapato1.tipo = Sapato.TipoSapato.TENIS;
       sapato1.cadarco = true;
        
        // objeto 2
        
        
        Sapato sapato2 = new Sapato();
        sapato2.tamanho = 42;
        sapato2.tipo = Sapato.TipoSapato.SANDALIA;
        sapato2.cadarco = false;
        
        
        

        // Exibindo os dados no Console
        System.out.println("--- Sistema FiapRide ---");
        System.out.println("Tipo do sapato: " + sapato1.tipo + " | tamanho: " + sapato1.tamanho + " | possui cadarço: " + sapato1.cadarco);
        System.out.println("Tipo do sapato: " + sapato2.tipo + " | tamanho: " + sapato2.tamanho + " | possui cadarço: " + sapato2.cadarco);
        
        
        // Teste mental: Se eu mudar o nome do passageiro1, o passageiro2 muda?
    }
}