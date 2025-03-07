package exercicio_03;

import java.util.Scanner;

public class exercicio_03 {
    public void Executar() {

        final double CAMBIO_DOLAR = 5.77;
        final double CAMBIO_EURO = 6.22;
        final double CAMBIO_LIBRA = 7.43;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor em reais (R$): ");
        double valorReais = scanner.nextDouble();

        System.out.println("Digite a moeda para conversão (dolar, euro ou libra): ");
        String moedaConversao = scanner.next().toLowerCase();

        double valorConvertido = 0.0;

        switch (moedaConversao) {
            case "dolar":
                valorConvertido = valorReais / CAMBIO_DOLAR;
                moedaConversao = "USD";
                break;
            case "euro":
                valorConvertido = valorReais / CAMBIO_EURO;
                moedaConversao = "EUR";
                break;
            case "libra":
                valorConvertido = valorReais / CAMBIO_LIBRA;
                moedaConversao = "GBP";
                break;
            default:
                System.out.println("Moeda inválida! Utilize dolar, euro ou libra");
                scanner.close();
                return;
        }

        System.out.printf("O valor convertido é: %.2f %s\n", valorConvertido, moedaConversao);
        scanner.close();
    }
}
