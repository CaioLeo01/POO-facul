public class TimeDeFutebol {
    private String nome;
    private String cidade;
    private Jogador jogador1;
    private Jogador jogador2;
    private Premiacao titulo1;
    private Premiacao titulo2;

    public TimeDeFutebol(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    public void cadastrarJogador1(Jogador jogador1) {
        this.jogador1 = jogador1;
    }

    public void cadastrarJogador2(Jogador jogador2) {
        this.jogador2 = jogador2;
    }

    public void cadastrarTitulo1(Premiacao titulo1) {
        this.titulo1 = titulo1;
    }

    public void cadastrarTitulo2(Premiacao titulo2) {
        this.titulo2 = titulo2;
    }

    public void exibirDadosDoTime() {
        System.out.println("Time: " + nome);
        System.out.println("Cidade: " + cidade);

        System.out.println("\nJogador 1:");
        if (jogador1 != null) {
            jogador1.exibirDados();
        } else {
            System.out.println("Nao cadastrado.");
        }

        System.out.println("\nJogador 2:");
        if (jogador2 != null) {
            jogador2.exibirDados();
        } else {
            System.out.println("Nao cadastrado.");
        }

        System.out.println("\nTitulo 1:");
        if (titulo1 != null) {
            titulo1.exibirDados();
        } else {
            System.out.println("Nao cadastrado.");
        }

        System.out.println("\nTitulo 2:");
        if (titulo2 != null) {
            titulo2.exibirDados();
        } else {
            System.out.println("Nao cadastrado.");
        }
    }
}
