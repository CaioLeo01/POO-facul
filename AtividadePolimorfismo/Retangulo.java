package AtividadePolimorfismo;

public class Retangulo extends Forma {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        super("Retangulo");
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
    public double getArea() {
        return base * altura;
    }

    @Override
    public double getPerimetro() {
        return 2 * (base + altura);
    }
}
