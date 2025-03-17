package org.example.questao09;

public class TestaConta {
    public static void main(String[] args) {

        Conta conta = new Conta("Bruno", 12345, "001", 1000, "01/01/1900");

        conta.exibirInformacoes();
        conta.saca(500);
        conta.exibirInformacoes();
        conta.deposita(1500);
        conta.exibirInformacoes();
        System.out.println("Rendimento mensal da conta: R$" + conta.calculaRendimento());

    }
}
