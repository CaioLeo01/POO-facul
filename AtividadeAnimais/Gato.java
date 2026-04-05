package AtividadeAnimais;

public class Gato extends Mamifero {

    public Gato(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Animal: Gato");
        super.exibirInformacoes();
    }

    @Override
    public void emitirSom() {
        System.out.println("Som: Miau");
        System.out.println();
    }
}
