package ex4;

import java.util.ArrayList;
import java.util.List;

class Cliente {
    private String nome;
    private String endereco;
    private List<Produto> carrinho;
    private List<Produto> historicoCompras;

    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.carrinho = new ArrayList<>();
        this.historicoCompras = new ArrayList<>();
    }

    public void adicionarProdutoCarrinho(Produto produto) {
        carrinho.add(produto);
    }

    public void finalizarCompra() {
        historicoCompras.addAll(carrinho);
        carrinho.clear();
    }

    public double calcularValorTotalCompra() {
        double total = 0;
        for (Produto produto : carrinho) {
            total += produto.getPreco();
        }
        return total;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Produto> getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(List<Produto> carrinho) {
        this.carrinho = carrinho;
    }

    public List<Produto> getHistoricoCompras() {
        return historicoCompras;
    }

    public void setHistoricoCompras(List<Produto> historicoCompras) {
        this.historicoCompras = historicoCompras;
    }
}
