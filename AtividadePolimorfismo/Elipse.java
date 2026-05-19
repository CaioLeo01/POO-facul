package AtividadePolimorfismo;

public class Elipse extends FormaArredondada {
    private double raioMaior;
    private double raioMenor;

    public Elipse(double raioMaior, double raioMenor) {
        super("Elipse");
        this.raioMaior = raioMaior;
        this.raioMenor = raioMenor;
    }

    public double getRaioMaior() {
        return raioMaior;
    }

    public void setRaioMaior(double raioMaior) {
        this.raioMaior = raioMaior;
    }

    public double getRaioMenor() {
        return raioMenor;
    }

    public void setRaioMenor(double raioMenor) {
        this.raioMenor = raioMenor;
    }

    @Override
    public double getArea() {
        return Math.PI * raioMaior * raioMenor;
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * Math.sqrt((raioMaior * raioMaior + raioMenor * raioMenor) / 2);
    }

    @Override
    public double getDiametroHorizontal() {
        return raioMaior * 2;
    }

    @Override
    public double getDiametroVertical() {
        return raioMenor * 2;
    }
}
