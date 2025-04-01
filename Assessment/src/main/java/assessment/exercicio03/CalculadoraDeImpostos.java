package assessment.exercicio03;

import java.util.Scanner;


public class CalculadoraDeImpostos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu salário mensal (R$): ");
        double salarioMensal = scanner.nextDouble();

        double salarioAnual = salarioMensal * 12;
        double valorImposto = calcularImposto(salarioAnual);
        double salarioLiquidoAnual = salarioAnual - valorImposto;
        double salarioLiquidoMensal = salarioLiquidoAnual / 12;

        System.out.println("\n=== Resultado do cálculo de imposto ===");
        System.out.println("Nome: " + nome);
        System.out.println("Salário mensal: R$" + String.format("%.2f", salarioMensal));
        System.out.println("Salário anual: R$" + String.format("%.2f", salarioAnual));

        String faixaImposto = determinarFaixaImposto(salarioAnual);
        System.out.println("Faixa de imposto: " + faixaImposto);

        System.out.println("Valor total do imposto anual: R$" + String.format("%.2f", valorImposto));
        System.out.println("Salário líquido anual: R$" + String.format("%.2f", salarioLiquidoAnual));
        System.out.println("Salário líquido mensal: R$" + String.format("%.2f", salarioLiquidoMensal));

        scanner.close();
    }


    public static double calcularImposto(double salarioAnual) {
        double valorImposto = 0;

        if (salarioAnual <= 22847.76) {
            valorImposto = 0;
        } else if (salarioAnual <= 33919.80) {
            valorImposto = salarioAnual * 0.075;
        } else if (salarioAnual <= 45012.60) {
            valorImposto = salarioAnual * 0.15;
        } else {
            valorImposto = salarioAnual * 0.275;
        }

        return valorImposto;
    }

    public static String determinarFaixaImposto(double salarioAnual) {
        if (salarioAnual <= 22847.76) {
            return "Isento (0%)";
        } else if (salarioAnual <= 33919.80) {
            return "7,5%";
        } else if (salarioAnual <= 45012.60) {
            return "15%";
        } else {
            return "27,5%";
        }
    }
}