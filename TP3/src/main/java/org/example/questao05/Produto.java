package org.example.questao05;

// Explique com suas próprias palavras por que esses métodos (getters e setters)
// podem ser úteis no código, mesmo que não esteja usando modificadores de acesso.

// R: Esses métodos fornecem um meio controlado para acessar ou modificar atributos do objeto.
// Podemos realizar validações ou regras adicionais (para que um valor não seja negativo, por exemplo),
// e é uma forma de manter os princípios de Encapsulamento

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
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
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em Estoque: " + quantidadeEmEstoque);
    }

    public static void main(String[] args) {
        Produto produto = new Produto("Arroz", 5.99, 50);

        System.out.println("Informações Iniciais do Produto:");
        produto.exibirInformacoes();

        produto.setPreco(6.49);
        produto.setQuantidadeEmEstoque(45);

        System.out.println("\nInformações Atualizadas do Produto:");
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: R$ " + produto.getPreco());
        System.out.println("Quantidade em Estoque: " + produto.getQuantidadeEmEstoque());
    }
}
