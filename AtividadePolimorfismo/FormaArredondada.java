package AtividadePolimorfismo;

public abstract class FormaArredondada extends Forma {
    public FormaArredondada(String nome) {
        super(nome);
    }

    public abstract double getDiametroHorizontal();

    public abstract double getDiametroVertical();

    public double getDiametro() {
        return getDiametroHorizontal();
    }

    public double getDiametro(boolean horizontal) {
        if (horizontal) {
            return getDiametroHorizontal();
        }

        return getDiametroVertical();
    }
}
