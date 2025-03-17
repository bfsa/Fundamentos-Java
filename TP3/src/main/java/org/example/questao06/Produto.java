package org.example.questao06;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    // Já havia utilizado o método construtor nos primeiros exercícios para poder instanciar rapidamente uma classe;

    // Questao 06 enunciado: Explique por que usar um construtor facilita a criação de objetos em relação a atribuir valores por vários métodos “set” ou chamadas separadas.

    // R: O método construtor reduz a quantidade de chamadas de método (set) já que os valores são definidos diretamente e
    //  garante que os atributos obrigatórios sejam sempre preenchidos;


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
