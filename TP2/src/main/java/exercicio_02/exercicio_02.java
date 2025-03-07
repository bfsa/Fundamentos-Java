package exercicio_02;

import java.util.Scanner;

public class exercicio_02 {

    public void Executar(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("## Digite o valor de 4 notas bimestrais abaixo: ");
        System.out.print("Nota 1: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Nota 2: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Nota 3: ");
        double nota3 = scanner.nextDouble();
        System.out.print("Nota 4: ");
        double nota4 = scanner.nextDouble();
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7) {
            System.out.println("Aluno aprovado! Média: " + media);
        } else if (media >= 5) {
            System.out.println("Aluno de Recuperação! Média: " + media);
        } else if (media < 5) {
            System.out.println("Aluno reprovadoo! Média: " + media);
        } else {
            System.out.println("Notas inválidas");
        }


    }
}
