package AtividadeHeranca;

public class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Forma geometrica: Circulo");
        System.out.println("Area: " + String.format("%.2f", calcularArea()));
        System.out.println("Perimetro: " + String.format("%.2f", calcularPerimetro()));
        System.out.println();
    }
}
