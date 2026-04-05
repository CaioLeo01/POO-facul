package AtividadeHeranca;

public class Quadrado extends Forma {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Forma geometrica: Quadrado");
        System.out.println("Area: " + String.format("%.2f", calcularArea()));
        System.out.println("Perimetro: " + String.format("%.2f", calcularPerimetro()));
        System.out.println();
    }
}
