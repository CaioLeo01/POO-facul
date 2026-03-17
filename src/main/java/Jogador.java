public class Jogador {
    private String nome;
    private int idade;
    private String posicao;
    private int numeroCamisa;

    public Jogador(String nome, int idade, String posicao, int numeroCamisa) {
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
        this.numeroCamisa = numeroCamisa;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getPosicao() {
        return posicao;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Posicao: " + posicao);
        System.out.println("Numero da camisa: " + numeroCamisa);
    }
}
