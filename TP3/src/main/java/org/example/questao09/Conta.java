package org.example.questao09;

public class Conta {

    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private String dataAbertura;

    public Conta(String titular, int numero, String agencia, double saldo, String dataAbertura) {
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
    }

    public void saca(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso! Novo saldo: R$" + this.saldo);
        } else {
            System.out.println("Valor inválido ou insuficiente");
        }
    }

    public void deposita(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Valor depositado com sucesso! Novo saldo: R$" + this.saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public double calculaRendimento() {
        return this.saldo * 0.1;
    }

    public void exibirInformacoes() {
        System.out.println("=============================");
        System.out.println("Titular: " + titular);
        System.out.println("Número da Conta: " + numero);
        System.out.println("Agência: " + agencia);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("Data de Abertura: " + dataAbertura);
        System.out.println("=============================");

    }



}
