package org.example.questao04;

public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void alterarPreco(double novoPreco) {
        this.preco = novoPreco;
    }

    public void alterarQuantidade(int novaQuantidade) {
        this.quantidadeEmEstoque = novaQuantidade;
    }

    public void exibirInformacoes() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade: " + quantidadeEmEstoque);
    }

    public static void main(String[] args) {
        // Criando um produto "Arroz"
        org.example.questao03.Produto produto = new org.example.questao03.Produto("Arroz", 5.99, 50);

        // Exibindo informações iniciais
        System.out.println("Informações iniciais do Produto:");
        produto.exibirInformacoes();

        // Alterando preço e quantidade
        produto.alterarPreco(6.49);
        produto.alterarQuantidade(45);

        // Exibindo informações atualizadas
        System.out.println("\nInformações atualizadas do Produto:");
        produto.exibirInformacoes();
    }
}
