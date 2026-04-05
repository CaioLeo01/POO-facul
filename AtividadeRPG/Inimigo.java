package AtividadeRPG;

public class Inimigo extends Personagem {

    public Inimigo(String nome, int vida, int ataque, int defesa) {
        super(nome, vida, ataque, defesa);
    }

    public void atacar(Personagem alvo) {
        int dano = getAtaque();
        System.out.println(getNome() + " atacou " + alvo.getNome() + "!");
        alvo.receberDano(dano);
    }

    public void exibirDesenho() {
        System.out.println(getNome());
    }
}
