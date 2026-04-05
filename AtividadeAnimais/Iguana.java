package AtividadeAnimais;

public class Iguana extends Reptil {

    public Iguana(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Animal: Iguana");
        super.exibirInformacoes();
    }

    @Override
    public void emitirSom() {
        System.out.println("Som: Iguana nao costuma emitir som");
        System.out.println();
    }
}
