package assessment.exercicio04;
import java.util.Scanner;

public class SimuladorDeEmprestimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o valor do empréstimo (R$): ");
        double valorEmprestimo = scanner.nextDouble();

        int numeroParcelas = 0;
        boolean parcelasValidas = false;

        while (!parcelasValidas) {
            System.out.print("Em quantas parcelas deseja pagar (mínimo 6, máximo 48): ");
            numeroParcelas = scanner.nextInt();

            if (numeroParcelas >= 6 && numeroParcelas <= 48) {
                parcelasValidas = true;
            } else {
                System.out.println("Número de parcelas inválido. Por favor, escolha entre 6 e 48 parcelas.");
            }
        }

        double taxaJurosMensal = 0.03;
        double valorTotalPago = calcularValorTotalPago(valorEmprestimo, taxaJurosMensal, numeroParcelas);
        double valorParcela = valorTotalPago / numeroParcelas;

        System.out.println("\n---- Simulação de Empréstimo ----");
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Valor do empréstimo: R$" + String.format("%.2f", valorEmprestimo));
        System.out.println("Taxa de juros mensal: " + String.format("%.1f", taxaJurosMensal * 100) + "%");
        System.out.println("Número de parcelas: " + numeroParcelas);
        System.out.println("Valor total a ser pago: R$" + String.format("%.2f", valorTotalPago));
        System.out.println("Valor da parcela mensal: R$" + String.format("%.2f", valorParcela));

        scanner.close();
    }

    public static double calcularValorTotalPago(double valorEmprestimo, double taxaJurosMensal, int numeroParcelas) {

        // Professor, aqui usei a seguinte formula para o calculo de juros compostos:
        // M = P * (1 + i)^n
        // Sendo:
        // M = montante final
        // P = principal (valor inicial)
        // i = taxa de juros
        // n = nº de parcelas

        return valorEmprestimo * Math.pow(1 + taxaJurosMensal, numeroParcelas);
    }
}
