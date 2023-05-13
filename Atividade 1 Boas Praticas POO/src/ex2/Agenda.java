package ex2;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(String nome, String telefone, String email) {
        Contato novoContato = new Contato(nome, telefone, email);
        contatos.add(novoContato);
        System.out.println("Contato adicionado com sucesso: " + novoContato);
    }

    public void buscarContato(String nome) {
        List<Contato> contatosEncontrados = new ArrayList<>();

        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contatosEncontrados.add(contato);
            }
        }

        if (contatosEncontrados.isEmpty()) {
            System.out.println("Nenhum contato encontrado com o nome: " + nome);
        } else {
            System.out.println("Contatos encontrados com o nome " + nome + ":");
            for (Contato contato : contatosEncontrados) {
                System.out.println(contato);
            }
        }
    }

    public void atualizarContato(String nome, String novoTelefone, String novoEmail) {
        boolean contatoAtualizado = false;

        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setTelefone(novoTelefone);
                contato.setEmail(novoEmail);
                contatoAtualizado = true;
                System.out.println("Contato atualizado com sucesso: " + contato);
                break;
            }
        }

        if (!contatoAtualizado) {
            System.out.println("Nenhum contato encontrado com o nome: " + nome);
        }
    }

    public void excluirContato(String nome) {
        boolean contatoRemovido = false;

        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contatos.remove(contato);
                contatoRemovido = true;
                System.out.println("Contato removido com sucesso: " + contato);
                break;
            }
        }

        if (!contatoRemovido) {
            System.out.println("Nenhum contato encontrado com o nome: " + nome);
        }
    }
}

