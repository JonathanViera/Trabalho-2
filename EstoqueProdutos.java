package modelo;
import java.util.*;
import excecao.*;


public class EstoqueProdutos {
    private List<ProdutoEstoque> produtos;
    

    public EstoqueProdutos() {
        this.produtos = new ArrayList<>();
    }
    public void adicionaProduto(ProdutoEstoque produto ){
        produtos.add(produto);

    }
    public ProdutoEstoque buscaProduto(String nome) throws ProdutoNaoEncontradoException{
        for (ProdutoEstoque produto : produtos){
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }

        }
        throw new ProdutoNaoEncontradoException("Produto não encontrado: " + nome);
    }

    public void atualizaEstoque(String nome, int quantidadeVendida)
        throws ProdutoNaoEncontradoException{
        ProdutoEstoque produto = buscaProduto(nome);
        int novaQuantidade = produto.getQuantidade() - quantidadeVendida;
        if(novaQuantidade < 0){
            throw new IllegalArgumentException("Quantidade insuficiente em estoque para " + nome);
        }
        produto.setQuantidade(novaQuantidade);
        }
    }
