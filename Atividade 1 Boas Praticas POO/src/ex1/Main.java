package ex1;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("12345");

        conta.depositar(100.0);
        conta.sacar(50.0);
        conta.exibirSaldo();
        conta.exibirHistoricoTransacoes();
    }
}

