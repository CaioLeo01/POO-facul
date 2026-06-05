package AtividadeColeçõeseExceções;

public class Paciente {
    private String nome;
    private int idade;

    public Paciente(String nome, int idade) {
        this.nome = validarNome(nome);
        this.idade = validarIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public static String validarNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do paciente nao pode ficar vazio.");
        }

        String nomeTratado = nome.trim();

        if (nomeTratado.length() < 3) {
            throw new IllegalArgumentException("O nome do paciente deve ter pelo menos 3 letras.");
        }

        if (nomeTratado.length() > 100) {
            throw new IllegalArgumentException("O nome do paciente esta grande demais.");
        }

        if (nomeTratado.contains(",")) {
            throw new IllegalArgumentException("O nome do paciente nao pode conter virgula.");
        }

        if (!nomeTratado.matches("[\\p{L}À-ÿ' -]+")) {
            throw new IllegalArgumentException("O nome do paciente contem caracteres invalidos.");
        }

        return nomeTratado;
    }

    public static int validarIdade(int idade) {
        if (idade < 0 || idade > 120) {
            throw new IllegalArgumentException("A idade deve estar entre 0 e 120 anos.");
        }

        return idade;
    }

    public String toCsv() {
        return nome + "," + idade;
    }

    public String exibirDados() {
        return "Nome: " + nome + " - Idade: " + idade + " anos";
    }
}
