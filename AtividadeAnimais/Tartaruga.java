package AtividadeAnimais;

public class Tartaruga extends Reptil {

    public Tartaruga(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Animal: Tartaruga");
        super.exibirInformacoes();
    }

    @Override
    public void emitirSom() {
        System.out.println("Som: Tartaruga nao emite som alto");
        System.out.println();
    }
}
