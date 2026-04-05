package AtividadeAnimais;

public class Arara extends Ave {

    public Arara(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Animal: Arara");
        super.exibirInformacoes();
    }

    @Override
    public void emitirSom() {
        System.out.println("Som: Cra cra");
        System.out.println();
    }
}
