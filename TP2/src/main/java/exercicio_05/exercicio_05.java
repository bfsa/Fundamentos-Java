package exercicio_05;

import java.util.Scanner;

public class exercicio_05 {
    public void Executar(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("===============================");
        System.out.println("Calculadora de Descontos Progressivos");
        System.out.println("===============================");
        System.out.print("Digite o valor da compra (R$): ");
        double valorCompra = scanner.nextDouble();

        double desconto = 0.0;

        if (valorCompra > 1000){
            desconto = valorCompra * 0.10;
        } else if (valorCompra >= 500){
            desconto = valorCompra * 0.05;
        }

        double valorDescontado = valorCompra - desconto;

        System.out.println("===============================");
        System.out.println("Resumo da compra");
        System.out.println("===============================");

        System.out.printf("Valor original: R$%.2f\n", valorCompra);
        System.out.printf("Desconto: R$%.2f\n", desconto);
        System.out.printf("Valor com desconto: R$%.2f\n", valorDescontado);

        scanner.close();
    }
}
