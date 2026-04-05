package AtividadeAnimais;

public class Pardal extends Ave {

    public Pardal(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Animal: Pardal");
        super.exibirInformacoes();
    }

    @Override
    public void emitirSom() {
        System.out.println("Som: Piu piu");
        System.out.println();
    }
}
