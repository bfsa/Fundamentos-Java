package exercicio_11;

import java.util.Scanner;

public class exercicio_11 {
    public void Executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===============================");
        System.out.println("Sequencia Numerica Personalizada");
        System.out.println("===============================");

        System.out.print("Digite um valor inicial: ");
        int valorInicial = scanner.nextInt();

        System.out.print("Digite um valor de incremento: ");
        int valorIncremento = scanner.nextInt();

        System.out.println("===============================");
        System.out.println("Sua sequencia: ");
        System.out.println("===============================");

        boolean primeiroValor = true;

        for (int valorAtual = valorInicial; valorAtual <= 100; valorAtual += valorIncremento) {

            if (primeiroValor) {
                System.out.print(valorAtual);
                primeiroValor = false;
            } else {
                System.out.print(", " + valorAtual);
            }
        }
        System.out.println("\n===============================");

    }
}
