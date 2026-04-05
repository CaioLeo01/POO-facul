package AtividadeHeranca;

public class Main {
    public static void main(String[] args) {
        Forma[] formas = new Forma[4];

        formas[0] = new Circulo(5);
        formas[1] = new Triangulo(6, 4, 6, 5, 5);
        formas[2] = new Quadrado(4);
        formas[3] = new Retangulo(8, 3);

        System.out.println("Informacoes das formas geometricas:");
        System.out.println();

        for (Forma forma : formas) {
            forma.exibirInformacoes();
        }
    }
}
