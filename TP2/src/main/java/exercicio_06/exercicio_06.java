package exercicio_06;

import java.util.Scanner;

public class exercicio_06 {
    public void Executar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("===============================");
        System.out.println("Verificador de Anos Bissextos");
        System.out.println("===============================");
        System.out.print("Digite um ano: ");
        int ano = scanner.nextInt();

        scanner.close();

        System.out.println("===============================");
        System.out.println("Resultado:");
        System.out.println("===============================");
        boolean isBissexto = ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0;
        if(isBissexto){
            System.out.println("O ano " + ano + " é bissexto");
        } else {
            System.out.println("O ano " + ano + " não é bissexto");
        }




    }
}
