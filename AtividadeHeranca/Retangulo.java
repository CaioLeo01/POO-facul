package AtividadeHeranca;

public class Retangulo extends Forma {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Forma geometrica: Retangulo");
        System.out.println("Area: " + String.format("%.2f", calcularArea()));
        System.out.println("Perimetro: " + String.format("%.2f", calcularPerimetro()));
        System.out.println();
    }
}
