package ex4;

public class Main {
    public static void main(String[] args) {

        Produto p1 = new Produto("Camiseta", 29.99);
        Produto p2 = new Produto("Calça Jeans", 79.99);
        Produto p3 = new Produto("Tênis", 99.99);
        Produto p4 = new Produto("Cueca", 49.99);

        LojaVirtual loja = new LojaVirtual("Minha Loja", "Rua Principal, 123");
        loja.adicionarProdutoCatalogo(p1);
        loja.adicionarProdutoCatalogo(p2);
        loja.adicionarProdutoCatalogo(p3);
        loja.adicionarProdutoCatalogo(p4);

        Cliente cliente = new Cliente("João", "Rua das Flores, 456");
        cliente.adicionarProdutoCarrinho(p1);
        cliente.adicionarProdutoCarrinho(p2);
        cliente.adicionarProdutoCarrinho(p3);
        cliente.adicionarProdutoCarrinho(p4);
        cliente.finalizarCompra();

        double valorTotal = cliente.calcularValorTotalCompra();
        System.out.println("Valor total da compra: R$ " + valorTotal);
    }
}
