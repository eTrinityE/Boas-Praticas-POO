package ex3;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private String nome;
    private String endereco;
    private List<ItemMenu> menu;
    private List<Pedido> pedidos;

    public Restaurante(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.menu = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }

    public void adicionarItemAoMenu(ItemMenu item) {
        menu.add(item);
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public double calcularValorTotalPedidos() {
        double valorTotal = 0.0;
        for (Pedido pedido : pedidos) {
            valorTotal += pedido.getValorTotal();
        }
        return valorTotal;
    }

    public void exibirMenu() {
        System.out.println("Menu do Restaurante " + nome + ":");

        for (ItemMenu item : menu) {
            System.out.println(item.getNome() + " - R$ " + item.getPreco());
        }
    }

}
