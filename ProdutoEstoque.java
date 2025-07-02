package modelo;

public class ProdutoEstoque {
    private String nome;
    private float valor;
    private int quantidade;


    public ProdutoEstoque(String nome, float valor, int quantidade){
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
        
    }
    public String getNome() { return nome; }
    public float getValor(){return valor;}
    public int getQuantidade(){return quantidade;}

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    @Override
    public String toString() {
        return quantidade + " unidades" +  nome + " - R$" + valor;
    }

}
