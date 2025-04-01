package assessment.exercicio07;

import java.util.Scanner;

public class Aluno {
    private String nome;
    private String matricula;
    private double nota1;
    private double nota2;
    private double nota3;

    public Aluno(String nome, String matricula, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3.0;
    }

    public void verificarAprovacao() {
        double media = calcularMedia();
        System.out.println("Média: " + String.format("%.2f", media));

        if (media >= 7.0) {
            System.out.println("Situação: APROVADO");
        } else {
            System.out.println("Situação: REPROVADO");
        }
    }

    public void exibirDados() {
        System.out.println("---- Dados do Aluno ----");
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota 1: " + String.format("%.1f", nota1));
        System.out.println("Nota 2: " + String.format("%.1f", nota2));
        System.out.println("Nota 3: " + String.format("%.1f", nota3));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---- Cadastro de Aluno ----");

        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Matrícula: ");
        String matricula = scanner.nextLine();

        double nota1 = obterNotaValida(scanner, "Nota 1");
        double nota2 = obterNotaValida(scanner, "Nota 2");
        double nota3 = obterNotaValida(scanner, "Nota 3");

        Aluno aluno = new Aluno(nome, matricula, nota1, nota2, nota3);

        System.out.println("\n---- Resultado Final ----");
        aluno.exibirDados();
        aluno.verificarAprovacao();

        scanner.close();
    }

    private static double obterNotaValida(Scanner scanner, String descricao) {
        double nota = -1;
        boolean notaValida = false;

        while (!notaValida) {
            System.out.print(descricao + " (0-10): ");

            if (scanner.hasNextDouble()) {
                nota = scanner.nextDouble();

                if (nota >= 0 && nota <= 10) {
                    notaValida = true;
                } else {
                    System.out.println("Erro: A nota deve estar entre 0 e 10.");
                }
            } else {
                System.out.println("Erro: Digite um valor numérico válido, entre 0 e 10.");
                scanner.next();
            }
        }

        return nota;
    }
}