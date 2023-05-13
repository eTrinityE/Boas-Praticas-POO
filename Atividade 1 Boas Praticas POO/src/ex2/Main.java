package ex2;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.adicionarContato("João", "123456789", "joao@example.com");
        agenda.adicionarContato("Maria", "987654321", "maria@example.com");

        agenda.buscarContato("João");
        agenda.buscarContato("Pedro");

        agenda.atualizarContato("Maria", "999999999", "maria@gmail.com");

        agenda.excluirContato("Pedro");
        agenda.excluirContato("João");

        agenda.buscarContato("Maria");
    }
}
