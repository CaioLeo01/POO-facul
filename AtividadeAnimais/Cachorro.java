package AtividadeAnimais;

public class Cachorro extends Mamifero {

    public Cachorro(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Animal: Cachorro");
        super.exibirInformacoes();
    }

    @Override
    public void emitirSom() {
        System.out.println("Som: Au au");
        System.out.println();
    }
}
