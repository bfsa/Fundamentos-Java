package assessment.exercicio11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SimulacaoDeLoteria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] sorteados = new int[6];
        for (int i = 0; i < 6; i++) {
            sorteados[i] = random.nextInt(60) + 1;
        }
        Arrays.sort(sorteados);

        int[] apostados = new int[6];
        System.out.println("Digite 6 números entre 1 e 60:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            apostados[i] = scanner.nextInt();
        }
        Arrays.sort(apostados);

        int acertos = 0;
        for (int numApostado : apostados) {
            for (int numSorteado : sorteados) {
                if (numApostado == numSorteado) {
                    acertos++;
                    break;
                }
            }
        }

        System.out.println("\nNúmeros sorteados: " + Arrays.toString(sorteados));
        System.out.println("Seus números: " + Arrays.toString(apostados));
        System.out.println("Total de acertos: " + acertos);

        scanner.close();
    }
}