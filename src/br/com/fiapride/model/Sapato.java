package br.com.fiapride.model;
public class Sapato { // <-- Use o nome do SEU objeto    
    // As características que você pensou    
    public int tamanho;
    public String marca;
    public String material;
    
    public enum TipoSapato {
    	TENIS,
    	BOTA,
    	SAPATO_SOCIAL,
    	SANDALIA
    }
    
    public TipoSapato tipo;
    public boolean  cadarco;
    
    public void alterarTipo(TipoSapato novoTipo) {
        if (novoTipo == null) {
            System.out.println("Erro: o tipo do sapato não pode ser nulo.");
            return;
        }

        if (novoTipo == TipoSapato.SANDALIA && this.cadarco == true) {
            System.out.println("Erro: sandália não pode possuir cadarço.");
            return;
        }

        this.tipo = novoTipo;
        System.out.println("Tipo alterado com sucesso para: " + this.tipo);
    }
    
    public void alterarCadarco(boolean possuiCadarco) {
        if (this.tipo == TipoSapato.SANDALIA && possuiCadarco == true) {
            System.out.println("Erro: sandália não pode possuir cadarço.");
            return;
        }

        this.cadarco = possuiCadarco;
        System.out.println("Cadarço alterado com sucesso para: " + this.cadarco);
    }
}
    
   
    