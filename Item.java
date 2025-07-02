package modelo;

public class Item {
    private String nomeProduto;
    private int quantidade;
 
    public Item(String nomeProduto, int quantidade){
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
    }

    public String getNomeProduto(){
        return nomeProduto;
    }
    public int getQuantidade(){
        return quantidade;
    }
}
