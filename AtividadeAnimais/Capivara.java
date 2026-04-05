package AtividadeAnimais;

public class Capivara extends Mamifero {

    public Capivara(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Animal: Capivara");
        super.exibirInformacoes();
    }

    @Override
    public void emitirSom() {
        System.out.println("Som: Cri Cri Cri");
        System.out.println();
    }
}
