package AtividadeAnimais;

public class Galinha extends Ave {

    public Galinha(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Animal: Galinha");
        super.exibirInformacoes();
    }

    @Override
    public void emitirSom() {
        System.out.println("Som: Cocorico");
        System.out.println();
    }
}
