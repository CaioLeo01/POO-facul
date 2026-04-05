package AtividadeAnimais;

public class Main {
    public static void main(String[] args) {
        Animal[] animais = new Animal[9];

        animais[0] = new Cachorro("Rex", 4, 18.5);
        animais[1] = new Gato("Mimi", 3, 4.2);
        animais[2] = new Tartaruga("Casquinha", 12, 6.8);
        animais[3] = new Iguana("Iggy", 5, 3.1);
        animais[4] = new Galinha("Carijo", 2, 2.7);
        animais[5] = new Calopsita("Luna", 1, 0.9);
        animais[6] = new Pardal("Piu", 1, 0.2);
        animais[7] = new Arara("Loro", 6, 1.5);
        animais[8] = new Capivara("Costelinha", 6, 10.5);

        System.out.println("Informacoes dos animais:");
        System.out.println();

        for (Animal animal : animais) {
            animal.exibirInformacoes();
            animal.emitirSom();
        }
    }
}
