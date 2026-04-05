package AtividadeRPG;

public class Goblin extends Inimigo {

    public Goblin() {
        super("Goblin", 30, 10, 5);
    }

    @Override
    public void exibirDesenho() {
        System.out.println("   ,      ,");
        System.out.println("  /(.-\"\"-.)\\\\");
        System.out.println("  |\\\\/      \\\\/|");
        System.out.println("  | \\ / =\\\\ / |");
        System.out.println("  \\\\( \\_o_/ )//");
        System.out.println("   /'-.U.-'\\\\");
        System.out.println("  / /|   |\\\\ \\\\");
        System.out.println("  \\\\ \\\\|_|// /");
        System.out.println("   '\"'   '\"'");
    }
}
