package exercicio_04;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class exercicio_04 {
    public void Executar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("===============================");
        System.out.println("Digite sua data de nascimento abaixo (em números): ");
        System.out.println("===============================");
        System.out.print("Dia: ");
        int dia = scanner.nextInt();
        System.out.print("Mes: ");
        int mes = scanner.nextInt();
        System.out.print("Ano: ");
        int ano = scanner.nextInt();

        scanner.close();

        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
        LocalDate dataHoje = LocalDate.now();
        long idadeDias = ChronoUnit.DAYS.between(dataNascimento, dataHoje);

        System.out.println("===============================");
        System.out.println("Sua idade em dias: " + idadeDias);
        System.out.println("===============================");
    }
}
