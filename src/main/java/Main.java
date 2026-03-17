import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TimeDeFutebol time = new TimeDeFutebol("Flamengo", "Rio de Janeiro");

        System.out.println("Cadastro do time Flamengo");

        System.out.println("\nDigite os dados do jogador 1:");
        System.out.print("Nome: ");
        String nomeJogador1 = scanner.nextLine();
        System.out.print("Idade: ");
        int idadeJogador1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Posicao: ");
        String posicaoJogador1 = scanner.nextLine();
        System.out.print("Numero da camisa: ");
        int camisaJogador1 = scanner.nextInt();
        scanner.nextLine();

        Jogador jogador1 = new Jogador(nomeJogador1, idadeJogador1, posicaoJogador1, camisaJogador1);
        time.cadastrarJogador1(jogador1);

        System.out.println("\nDigite os dados do jogador 2:");
        System.out.print("Nome: ");
        String nomeJogador2 = scanner.nextLine();
        System.out.print("Idade: ");
        int idadeJogador2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Posicao: ");
        String posicaoJogador2 = scanner.nextLine();
        System.out.print("Numero da camisa: ");
        int camisaJogador2 = scanner.nextInt();
        scanner.nextLine();

        Jogador jogador2 = new Jogador(nomeJogador2, idadeJogador2, posicaoJogador2, camisaJogador2);
        time.cadastrarJogador2(jogador2);

        System.out.println("\nDigite os dados do titulo 1:");
        System.out.print("Nome do titulo: ");
        String nomeTitulo1 = scanner.nextLine();
        System.out.print("Ano: ");
        int anoTitulo1 = scanner.nextInt();
        scanner.nextLine();

        Premiacao titulo1 = new Premiacao(nomeTitulo1, anoTitulo1);
        time.cadastrarTitulo1(titulo1);

        System.out.println("\nDigite os dados do titulo 2:");
        System.out.print("Nome do titulo: ");
        String nomeTitulo2 = scanner.nextLine();
        System.out.print("Ano: ");
        int anoTitulo2 = scanner.nextInt();

        Premiacao titulo2 = new Premiacao(nomeTitulo2, anoTitulo2);
        time.cadastrarTitulo2(titulo2);

        System.out.println("\n----------------------------------");
        System.out.println("DADOS DO TIME CADASTRADOS");
        System.out.println("----------------------------------");
        time.exibirDadosDoTime();
        scanner.close();
    }
}
