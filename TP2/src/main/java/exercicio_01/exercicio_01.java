package exercicio_01;

import java.util.Scanner;

public class exercicio_01 {

    public void Executar(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o nome da sua mãe: ");
        String nomeMae = scanner.nextLine();

        System.out.print("Digite o nome do seu pai: ");
        String nomePai = scanner.nextLine();

        System.out.println("==================");
        System.out.println("Usuário Cadastrado!");
        System.out.println("==================");
        System.out.println("Nome completo: " + nomeCompleto);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Nome da Mãe: " + nomeMae);
        System.out.println("Nome da Pai: " + nomePai);
        System.out.println("==================");

        int nC = nomeCompleto.length();
        int nM = nomeMae.length();
        int nP = nomePai.length();

        if (nC > nM && nC > nP) {
            System.out.println("O seu nome completo tem mais letras que o nome da sua mãe e do seu pai.");
        } else if (nM > nC && nM > nP) {
            System.out.println("O nome da sua mãe tem mais letras que o seu nome completo e o nome do seu pai.");
        } else if (nP > nC && nP > nM) {
            System.out.println("O nome do seu pai tem mais letras que o seu nome completo e o nome da sua mãe.");
        } else if (nC == nM && nC > nP) {
            System.out.println("O seu nome completo e o nome da sua mãe têm a mesma quantidade de letras, ambos mais longos que o nome do seu pai.");
        } else if (nC == nP && nC > nM) {
            System.out.println("O seu nome completo e o nome do seu pai têm a mesma quantidade de letras, ambos mais longos que o nome da sua mãe.");
        } else if (nM == nP && nM > nC) {
            System.out.println("O nome da sua mãe e o nome do seu pai têm a mesma quantidade de letras, ambos mais longos que o seu nome completo.");
        } else {
            System.out.println("Os nomes têm a mesma quantidade de letras.");
        }

        scanner.close();




    }
}
