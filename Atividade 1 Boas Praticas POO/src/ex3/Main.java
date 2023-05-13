package ex3;

public class Main {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante("Meu Restaurante", "Rua Principal, 123");

        ItemMenu item1 = new ItemMenu("Hambúrguer", 15.0);
        ItemMenu item2 = new ItemMenu("Pizza", 25.0);
        ItemMenu item3 = new ItemMenu("Sorvete", 10.0);

        restaurante.adicionarItemAoMenu(item1);
        restaurante.adicionarItemAoMenu(item2);
        restaurante.adicionarItemAoMenu(item3);

        Pedido pedido1 = new Pedido();
        pedido1.adicionarItem(item1);
        pedido1.adicionarItem(item2);

        Pedido pedido2 = new Pedido();
        pedido2.adicionarItem(item3);

        restaurante.adicionarPedido(pedido1);
        restaurante.adicionarPedido(pedido2);

        restaurante.exibirMenu();

        double valorTotalPedidos = restaurante.calcularValorTotalPedidos();
        System.out.println("Valor total dos pedidos: R$ " + valorTotalPedidos);
    }
}

