package exercicio_10;

import java.util.Random;
import java.util.Scanner;

public class exercicio_10 {
    public void Executar() {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1;
        int tentativas = 0;
        int palpite = 0;

        System.out.println("===============================");
        System.out.println("O jogo de adivinhação!");
        System.out.println("===============================");
        System.out.println("Tente acertar o número aleatório entre 1 e 100");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroAleatorio) {
                System.out.println("O número aleatório é maior que " + palpite + ". Tente novamente!");
            } else if (palpite > numeroAleatorio) {
                System.out.println("O número aleatório é menor que " + palpite + ". Tente novamente!");
            } else {
                System.out.println("===============================");
                System.out.println("Parabéns, VOCÊ ACERTOU!");
                System.out.println("Número aleatório: " + numeroAleatorio);
                System.out.println("Tentativas: " + tentativas);
                System.out.println("===============================");

            }

        } while (palpite != numeroAleatorio);

        scanner.close();
    }
}
