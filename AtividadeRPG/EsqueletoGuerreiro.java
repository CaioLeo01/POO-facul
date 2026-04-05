package AtividadeRPG;

public class EsqueletoGuerreiro extends Inimigo {

    public EsqueletoGuerreiro() {
        super("Esqueleto Guerreiro", 35, 12, 8);
    }

    @Override
    public void exibirDesenho() {
        System.out.println("      .-.");
        System.out.println("     (o.o)");
        System.out.println("      |=|");
        System.out.println("     __|__");
        System.out.println("   //.=|=.\\\\");
        System.out.println("  // .=|=. \\\\");
        System.out.println("  \\\\ .=|=. //");
        System.out.println("   \\\\(_=_)//");
        System.out.println("    (:| |:)");
        System.out.println("     || ||");
        System.out.println("     () ()");
        System.out.println("     || ||");
        System.out.println("     || ||");
        System.out.println("    ==' '==");
    }
}
