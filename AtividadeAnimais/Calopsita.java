package AtividadeAnimais;

public class Calopsita extends Ave {

    public Calopsita(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Animal: Calopsita");
        super.exibirInformacoes();
    }

    @Override
    public void emitirSom() {
        System.out.println("Som: Fiu fiu");
        System.out.println();
    }
}
