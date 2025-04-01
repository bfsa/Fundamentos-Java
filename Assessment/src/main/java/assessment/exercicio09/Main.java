package assessment.exercicio09;

public class Main {
    public static void main(String[] args) {
        // Criando uma conta bancária
        ContaBancaria conta = new ContaBancaria("Cliente INFNET da Silva");

        System.out.println("---- Saldo Inicial ----");
        conta.exibirTitular();
        conta.exibirSaldo();

        System.out.println("\n---- Realizando Depósito ----");
        conta.depositar(1500.0);
        conta.exibirSaldo();

        System.out.println("\n---- Realizando Saque com Sucesso ----");
        conta.sacar(300.0);
        conta.exibirSaldo();

        System.out.println("\n---- Tentativa de Saque Maior que o Saldo ----");
        conta.sacar(2000.0);
        conta.exibirSaldo();

        System.out.println("\n---- Tentativa de Depósito com Valor Negativo ----");
        conta.depositar(-100.0);
        conta.exibirSaldo();

    }
}