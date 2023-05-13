package ex3;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemMenu> itens;

    public Pedido() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemMenu item) {
        itens.add(item);
    }

    public double getValorTotal() {
        double valorTotal = 0.0;
        for (ItemMenu item : itens) {
            valorTotal += item.getPreco();
        }
        return valorTotal;
    }

    public List<ItemMenu> getItens() {
        return itens;
    }

    // Outros métodos, se necessário
}

