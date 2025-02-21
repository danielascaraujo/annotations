@Tabela(nome = "Produtos")
public class Produto {
    private int id;
    private String nome;
    private double preco;

    // Construtor
    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método para exibir informações do produto
    public void exibirInfo() {
        System.out.println("Produto [id=" + id + ", nome=" + nome + ", preco=" + preco + "]");
    }
}