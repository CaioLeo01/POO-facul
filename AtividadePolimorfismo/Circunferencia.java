package AtividadePolimorfismo;

public class Circunferencia extends FormaArredondada {
    private double raio;

    public Circunferencia(double raio) {
        super("Circunferencia");
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double getArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public double getDiametroHorizontal() {
        return raio * 2;
    }

    @Override
    public double getDiametroVertical() {
        return raio * 2;
    }
}
