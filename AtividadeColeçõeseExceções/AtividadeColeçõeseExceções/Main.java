package AtividadeColeçõeseExceções;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Main extends JFrame {
    private static final String NOME_ARQUIVO = "pacientes.csv";
    private static final String TELA_CADASTRO = "cadastro";
    private static final String TELA_LISTA = "lista";

    private final ArrayList<Paciente> pacientes;
    private final Path caminhoArquivo;
    private final CardLayout layoutTelas;
    private final JPanel painelTelas;
    private final JTextField campoNome;
    private final JTextField campoIdade;
    private final JTextArea areaPacientes;

    public Main() {
        super("Cadastro de Pacientes");

        this.pacientes = new ArrayList<Paciente>();
        this.caminhoArquivo = Paths.get("AtividadeColeçõeseExceções", NOME_ARQUIVO);
        this.layoutTelas = new CardLayout();
        this.painelTelas = new JPanel(layoutTelas);
        this.campoNome = new JTextField(20);
        this.campoIdade = new JTextField(5);
        this.areaPacientes = new JTextArea();

        configurarJanela();
        carregarPacientes();
        atualizarListaPacientes();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new Main().setVisible(true);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Erro inesperado ao iniciar o sistema: " + e.getMessage(),
                        "Erro",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
            }
        });
    }

    private void configurarJanela() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(520, 360));
        setLocationRelativeTo(null);

        painelTelas.add(criarTelaCadastro(), TELA_CADASTRO);
        painelTelas.add(criarTelaLista(), TELA_LISTA);

        add(painelTelas);
        layoutTelas.show(painelTelas, TELA_CADASTRO);
    }

    private JPanel criarTelaCadastro() {
        JPanel painel = new JPanel(new BorderLayout(10, 10));
        painel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        JPanel formulario = new JPanel();
        formulario.setLayout(new BoxLayout(formulario, BoxLayout.Y_AXIS));

        JPanel linhaNome = new JPanel(new FlowLayout(FlowLayout.LEFT));
        linhaNome.add(new JLabel("Nome:"));
        linhaNome.add(campoNome);

        JPanel linhaIdade = new JPanel(new FlowLayout(FlowLayout.LEFT));
        linhaIdade.add(new JLabel("Idade:"));
        linhaIdade.add(campoIdade);

        formulario.add(linhaNome);
        formulario.add(linhaIdade);

        JPanel acoes = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
        JButton botaoSalvar = new JButton("Salvar paciente");
        JButton botaoListar = new JButton("Ver pacientes");

        botaoSalvar.addActionListener(e -> cadastrarPaciente());
        botaoListar.addActionListener(e -> mostrarTelaLista());

        acoes.add(botaoSalvar);
        acoes.add(botaoListar);

        painel.add(new JLabel("Tela de cadastro de pacientes"), BorderLayout.NORTH);
        painel.add(formulario, BorderLayout.CENTER);
        painel.add(acoes, BorderLayout.SOUTH);
        return painel;
    }

    private JPanel criarTelaLista() {
        JPanel painel = new JPanel(new BorderLayout(10, 10));
        painel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        areaPacientes.setEditable(false);
        areaPacientes.setLineWrap(true);
        areaPacientes.setWrapStyleWord(true);

        JButton botaoVoltar = new JButton("Voltar ao cadastro");
        JButton botaoAtualizar = new JButton("Atualizar lista");

        botaoVoltar.addActionListener(e -> layoutTelas.show(painelTelas, TELA_CADASTRO));
        botaoAtualizar.addActionListener(e -> atualizarListaPacientes());

        JPanel acoes = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
        acoes.add(botaoAtualizar);
        acoes.add(botaoVoltar);

        painel.add(new JLabel("Tela de listagem de pacientes"), BorderLayout.NORTH);
        painel.add(new JScrollPane(areaPacientes), BorderLayout.CENTER);
        painel.add(acoes, BorderLayout.SOUTH);
        return painel;
    }

    private void cadastrarPaciente() {
        try {
            String nome = Paciente.validarNome(campoNome.getText());
            int idade = Integer.parseInt(campoIdade.getText().trim());

            Paciente paciente = new Paciente(nome, idade);
            pacientes.add(paciente);
            salvarPacientes();
            limparFormulario();
            atualizarListaPacientes();

            JOptionPane.showMessageDialog(this, "Paciente cadastrado com sucesso.");
        } catch (NumberFormatException e) {
            mostrarErro("A idade deve ser preenchida com numeros inteiros.");
        } catch (IllegalArgumentException e) {
            mostrarErro(e.getMessage());
        } catch (IOException e) {
            mostrarErro("Nao foi possivel salvar os pacientes no arquivo local.");
        } catch (Exception e) {
            mostrarErro("Ocorreu um erro inesperado no cadastro: " + e.getMessage());
        }
    }

    private void mostrarTelaLista() {
        atualizarListaPacientes();
        layoutTelas.show(painelTelas, TELA_LISTA);
    }

    private void atualizarListaPacientes() {
        StringBuilder conteudo = new StringBuilder();

        if (pacientes.isEmpty()) {
            conteudo.append("Nenhum paciente cadastrado.");
        } else {
            for (int i = 0; i < pacientes.size(); i++) {
                conteudo.append(i + 1)
                    .append(" - ")
                    .append(pacientes.get(i).exibirDados())
                    .append(System.lineSeparator());
            }
        }

        areaPacientes.setText(conteudo.toString());
        areaPacientes.setCaretPosition(0);
    }

    private void carregarPacientes() {
        if (!Files.exists(caminhoArquivo)) {
            return;
        }

        try (BufferedReader leitor = Files.newBufferedReader(caminhoArquivo)) {
            String linha = leitor.readLine();
            int numeroLinha = 1;

            while (linha != null) {
                try {
                    Paciente paciente = converterLinhaParaPaciente(linha);
                    pacientes.add(paciente);
                } catch (IllegalArgumentException e) {
                    System.out.println("Linha " + numeroLinha + " ignorada: " + e.getMessage());
                }

                linha = leitor.readLine();
                numeroLinha++;
            }
        } catch (IOException e) {
            mostrarErro("Nao foi possivel carregar os pacientes salvos.");
        } catch (Exception e) {
            mostrarErro("Erro inesperado ao abrir o arquivo de pacientes.");
        }
    }

    private Paciente converterLinhaParaPaciente(String linha) {
        if (linha == null || linha.trim().isEmpty()) {
            throw new IllegalArgumentException("linha vazia.");
        }

        String[] dados = linha.split(",");
        if (dados.length != 2) {
            throw new IllegalArgumentException("formato invalido.");
        }

        String nome = Paciente.validarNome(dados[0]);

        try {
            int idade = Integer.parseInt(dados[1].trim());
            return new Paciente(nome, idade);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("idade invalida.");
        }
    }

    private void salvarPacientes() throws IOException {
        Path pasta = caminhoArquivo.getParent();
        if (pasta != null) {
            Files.createDirectories(pasta);
        }

        try (BufferedWriter escritor = Files.newBufferedWriter(caminhoArquivo)) {
            for (int i = 0; i < pacientes.size(); i++) {
                escritor.write(pacientes.get(i).toCsv());
                escritor.newLine();
            }
        }
    }

    private void limparFormulario() {
        campoNome.setText("");
        campoIdade.setText("");
        campoNome.requestFocus();
    }

    private void mostrarErro(String mensagem) {
        JOptionPane.showMessageDialog(this, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
    }
}
