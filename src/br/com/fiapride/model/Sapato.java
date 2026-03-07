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
    
   
    
}