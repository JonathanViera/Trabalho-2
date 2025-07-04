import modelo.ProdutoEstoque;
import modelo.CarrinhoCompra;
import modelo.EstoqueProdutos;
import modelo.Item;


public class App {
    public static void main(String[] args) throws Exception {
        EstoqueProdutos estoque = new EstoqueProdutos();
            estoque.adicionaProduto(new ProdutoEstoque ("monitor", 500, 100));
            estoque.adicionaProduto(new ProdutoEstoque ("telefone", 150, 300));
            estoque.adicionaProduto(new ProdutoEstoque ("teclado", 70, 50));
            estoque.adicionaProduto(new ProdutoEstoque ("mouse", 50, 50));

            CarrinhoCompra carrinho = new CarrinhoCompra(estoque);
             carrinho.adicionaItem(new Item("monitor", 2));
             carrinho.adicionaItem(new Item("telefone", 5));
             carrinho.adicionaItem(new Item("teclado", 2));
             
             carrinho.finalizaCompra();
             
             System.out.println("A soma dos produtos : " + carrinho.calculaTotal());
             
 }
}
