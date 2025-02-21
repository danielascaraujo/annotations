public class TesteAnotacao {
    public static void main(String[] args) {
        // Obtém a anotação da classe Cliente
        Tabela tabelaCliente = Cliente.class.getAnnotation(Tabela.class);
        if (tabelaCliente != null) {
            System.out.println("Nome da tabela Cliente: " + tabelaCliente.nome());
        }

        // Obtém a anotação da classe Produto
        Tabela tabelaProduto = Produto.class.getAnnotation(Tabela.class);
        if (tabelaProduto != null) {
            System.out.println("Nome da tabela Produto: " + tabelaProduto.nome());
        }
    }
}
