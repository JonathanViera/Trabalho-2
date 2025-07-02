package modelo;
import excecao.*;
import java.util.*;

public class CarrinhoCompra {
    private EstoqueProdutos estoque;
    private List<Item> itens;
    
    public CarrinhoCompra(EstoqueProdutos estoque) {
        this.estoque = estoque;
        this.itens = new ArrayList<>();
    }
    
    public void adicionaItem(Item item) {
        itens.add(item);
    }
    
    public double calculaTotal() {
        double total = 0;
        for (Item item : itens) {
        try {
                ProdutoEstoque produto = estoque.buscaProduto(item.getNomeProduto());
                total+= produto.getValor() * item.getQuantidade();
            }
         catch (ProdutoNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }
        return total;
    }

    public void finalizaCompra(){
        for (Item item : itens) {
            try {
                estoque.atualizaEstoque(item.getNomeProduto(), item.getQuantidade());
            } catch (ProdutoNaoEncontradoException e) {
                System.out.println(e.getMessage());

            }
        }
 
    }

    
    

}
