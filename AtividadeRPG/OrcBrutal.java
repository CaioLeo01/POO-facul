package AtividadeRPG;

public class OrcBrutal extends Inimigo {

    public OrcBrutal() {
        super("Orc Brutal", 60, 15, 10);
    }

    @Override
    public void exibirDesenho() {
        System.out.println("      _,.---''````'-.");
        System.out.println("   ,-'      _,.--._  `.");
        System.out.println("  /    ,.-'`  _   \\\\   \\\\");
        System.out.println(" /   ,'    _,' `.  \\\\   \\\\");
        System.out.println("|   /   .-'  O   \\\\  |   |");
        System.out.println("|  |   /  .----.  || |   |");
        System.out.println("|  |   |  | () |  || |   |");
        System.out.println("|  |   \\\\  `----'  // |   |");
        System.out.println(" \\\\  \\\\   `-.___.-'  /   /");
        System.out.println("  `. `-.        _,'  ,'");
        System.out.println("    `-._`'----'`__.-'");
        System.out.println("        /  /\\\\  \\\\");
        System.out.println("       /__/  \\\\__\\\\");
    }
}
