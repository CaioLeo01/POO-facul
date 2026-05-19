package AtividadePolimorfismo;

public abstract class Forma {
    private String nome;

    public Forma(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract double getArea();

    public String getArea(int casasDecimais) {
        return String.format("%." + casasDecimais + "f", getArea());
    }

    public abstract double getPerimetro();

    public String getPerimetro(int casasDecimais) {
        return String.format("%." + casasDecimais + "f", getPerimetro());
    }

    public void exibirInformacoes() {
        exibirInformacoes(2);
    }

    public void exibirInformacoes(int casasDecimais) {
        System.out.println("Forma geometrica: " + nome);
        System.out.println("Area: " + getArea(casasDecimais));
        System.out.println("Perimetro: " + getPerimetro(casasDecimais));
        System.out.println();
    }
}
