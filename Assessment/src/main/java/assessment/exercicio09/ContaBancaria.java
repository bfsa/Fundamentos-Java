package assessment.exercicio09;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor > 0.0) {
            this.saldo += valor;
            System.out.println("Depósito de R$" + String.format("%.2f", valor) + " realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido");
        }
    }

    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + String.format("%.2f", valor) +  " realizado com sucesso!");
            return true;
        } else if (valor <= 0.0) {
            System.out.println("Valor de saque inválido");
            return false;
        } else {
            System.out.println("Saque de R$" + String.format("%.2f", valor) + " recusado. Motivo: Saldo insuficiente");
            return false;
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo: R$" + String.format("%.2f", saldo));
    }

    public void exibirTitular() {
        System.out.println("Titular: " + titular);
    }
}
