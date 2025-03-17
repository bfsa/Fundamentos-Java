package org.example.questao08;

public class Conta {

    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private String dataAbertura;

    public void saca(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Valor inválido ou insuficiente");
        }
    }

    public void deposita(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public double calculaRendimento() {
        return this.saldo * 0.1;
    }



}
