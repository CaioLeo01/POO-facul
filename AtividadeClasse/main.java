package AtividadeClasse;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Contato[] contatos = new Contato[3];
        Integer indice = 0;

        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite o nome do contato %d: ", i + 1);
            String nome = scanner.nextLine();

            System.out.printf("Digite o telefone do contato %d: ", i + 1);
            String telefone = scanner.nextLine();

            contatos[i] = new Contato(nome, telefone);
        }

        System.out.println("\nQual contato deseja alterar? (1, 2 ou 3)");
        indice = Integer.parseInt(scanner.nextLine()) - 1;

        System.out.print("Novo nome do contato " + (indice + 1) + ": ");
        contatos[indice].setNome(scanner.nextLine());
        System.out.print("Novo telefone do contato " + (indice + 1) + ": ");
        contatos[indice].setTelefone(scanner.nextLine());

        System.out.println("\nContatos cadastrados:");
        for (Contato contato : contatos) {
            System.out.println("Nome do contato: " + contato.getNome() + " - Telefone do contato: " + contato.getTelefone());
        }

        scanner.close();
    }
}
