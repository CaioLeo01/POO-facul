package AtividadePolimorfismo;

public class Pentagono extends Forma {
    private double lado;
    private double apotema;

    public Pentagono(double lado, double apotema) {
        super("Pentagono");
        this.lado = lado;
        this.apotema = apotema;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    @Override
    public double getArea() {
        return (getPerimetro() * apotema) / 2;
    }

    @Override
    public double getPerimetro() {
        return lado * 5;
    }
}
