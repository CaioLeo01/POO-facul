public class Premiacao {
    private String nomeTitulo;
    private int ano;

    public Premiacao(String nomeTitulo, int ano) {
        this.nomeTitulo = nomeTitulo;
        this.ano = ano;
    }

    public String getNomeTitulo() {
        return nomeTitulo;
    }

    public int getAno() {
        return ano;
    }

    public void exibirDados() {
        System.out.println("Titulo: " + nomeTitulo);
        System.out.println("Ano: " + ano);
    }
}
