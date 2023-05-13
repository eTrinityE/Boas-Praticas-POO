package ex1;

import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
    private String numeroConta;
    private double saldo;
    private List<String> historicoTransacoes;

    public ContaBancaria(String numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
        this.historicoTransacoes = new ArrayList<>();
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            historicoTransacoes.add("Depósito: +" + valor);
            System.out.println("Depósito de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0) {
            if (saldo >= valor) {
                saldo -= valor;
                historicoTransacoes.add("Saque: -" + valor);
                System.out.println("Saque de " + valor + " realizado com sucesso.");
            } else {
                System.out.println("Saldo insuficiente para saque.");
            }
        } else {
            System.out.println("Valor inválido para saque.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }

    public void exibirHistoricoTransacoes() {
        System.out.println("Histórico de transações:");
        for (String transacao : historicoTransacoes) {
            System.out.println(transacao);
        }
    }
}

