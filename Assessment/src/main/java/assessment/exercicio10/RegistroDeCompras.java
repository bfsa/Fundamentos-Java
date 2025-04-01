package assessment.exercicio10;

import java.io.*;
import java.util.Scanner;

public class RegistroDeCompras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            FileWriter fileWriter = new FileWriter("compras.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);

            System.out.println("---- Sistema de Registro de Compras ----");

            for (int i = 1; i <= 3; i++) {
                System.out.println("\nCompra #" + i);

                System.out.print("Nome do produto: ");
                String produto = scanner.nextLine();

                System.out.print("Quantidade: ");
                int quantidade = Integer.parseInt(scanner.nextLine());

                System.out.print("Preço unitário: R$ ");
                double precoUnitario = Double.parseDouble(scanner.nextLine());

                double valorTotal = quantidade * precoUnitario;

                printWriter.println("Produto: " + produto);
                printWriter.println("Quantidade: " + quantidade);
                printWriter.println("Preço unitário: R$ " + precoUnitario);
                printWriter.println("Valor total: R$ " + valorTotal);
                printWriter.println("------------------------");
            }

            printWriter.close();
            System.out.println("\nCompras registradas com sucesso no arquivo 'compras.txt'!");

            System.out.println("\n---- Compras Registradas ----");
            FileReader fileReader = new FileReader("compras.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
            }

            bufferedReader.close();

        } catch (IOException e) {
            System.out.println("Erro de I/O: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Erro: Formato de número inválido. " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}