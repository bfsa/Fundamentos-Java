package exercicio_07;

import java.util.Scanner;

public class exercicio_07 {
    public void Executar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("===============================");
        System.out.println("Calculadora de Imposto de Renda");
        System.out.println("===============================");

        System.out.print("Digite seu salário bruto anual (R$): ");
        double salarioAnual = scanner.nextDouble();

        double imposto = 0;

        if (salarioAnual <= 22000.00) {
            imposto = 0;
        } else if (salarioAnual <= 33000.00) {
            imposto = salarioAnual * 0.075;
        } else if (salarioAnual <= 44000.00) {
            imposto = salarioAnual * 0.15;
        } else if (salarioAnual <= 55000.00) {
            imposto = salarioAnual * 0.225;
        } else {
            imposto = salarioAnual * 0.325;
        }

        double salarioLiquido = salarioAnual + imposto;

        System.out.println("===============================");
        System.out.println("Resultado do Imposto de Renda:");
        System.out.println("===============================");
        System.out.printf("Salário Bruto Anual: R$%.2f\n", salarioAnual);
        System.out.printf("Imposto descontado: R$%.2f\n", imposto);
        System.out.printf("Salário Líquido Anual: R$%.2f\n", salarioLiquido);
        System.out.println("===============================");

        scanner.close();
    }

}

