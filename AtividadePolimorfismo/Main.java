package AtividadePolimorfismo;

public class Main {
    public static void main(String[] args) {
        Forma[] formas = new Forma[5];

        formas[0] = new Triangulo(6, 4, 6, 5, 5);
        formas[1] = new Retangulo(8, 3);
        formas[2] = new Circunferencia(5);
        formas[3] = new Pentagono(4, 2.75);
        formas[4] = new Elipse(6, 3);

        FormaArredondada[] formasArredondadas = new FormaArredondada[2];
        formasArredondadas[0] = new Circunferencia(5);
        formasArredondadas[1] = new Elipse(6, 3);

        exibirFormas(formas);
        exibirFormas(formas, 3);
        exibirDiametros(formasArredondadas);
    }

    public static void exibirFormas(Forma[] formas) {
        System.out.println("Informacoes das formas geometricas:");
        System.out.println();

        for (Forma forma : formas) {
            forma.exibirInformacoes();
        }
    }

    public static void exibirFormas(Forma[] formas, int casasDecimais) {
        System.out.println("Informacoes das formas com " + casasDecimais + " casas decimais:");
        System.out.println();

        for (Forma forma : formas) {
            forma.exibirInformacoes(casasDecimais);
        }
    }

    public static void exibirDiametros(FormaArredondada[] formas) {
        System.out.println("Diametros das formas arredondadas:");
        System.out.println();

        for (FormaArredondada forma : formas) {
            System.out.println("Forma geometrica: " + forma.getNome());
            System.out.println("Diametro horizontal: " + String.format("%.2f", forma.getDiametro(true)));
            System.out.println("Diametro vertical: " + String.format("%.2f", forma.getDiametro(false)));
            System.out.println();
        }
    }
}
