package ex4;

import java.util.ArrayList;
import java.util.List;

class LojaVirtual {
    private String nome;
    private String endereco;
    private List<Produto> catalogo;
    private List<Produto> vendas;

    public LojaVirtual(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.catalogo = new ArrayList<>();
        this.vendas = new ArrayList<>();
    }

    public void adicionarProdutoCatalogo(Produto produto) {
        catalogo.add(produto);
    }

    public void registrarVenda(List<Produto> produtos) {
        vendas.addAll(produtos);
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

    public List<Produto> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(List<Produto> catalogo) {
        this.catalogo = catalogo;
    }

    public List<Produto> getVendas() {
        return vendas;
    }

    public void setVendas(List<Produto> vendas) {
        this.vendas = vendas;
    }
}
