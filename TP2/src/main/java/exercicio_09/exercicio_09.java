package exercicio_09;

import java.util.Scanner;

public class exercicio_09 {
    public void Executar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("===============================");
        System.out.println("Validador de Senha");
        System.out.println("===============================");
        System.out.print("Cadastre uma senha: ");
        String senhaCadastrada = scanner.nextLine();

        String senhaDigitada;

        System.out.println("Agora, confirme a senha para verificação. ");

        do {
            System.out.print("Digite sua senha: ");
            senhaDigitada = scanner.nextLine();

            if(!senhaDigitada.equals(senhaCadastrada)){
                System.out.println("Senha incorreta, tente novamente.");
            }

        } while (!senhaDigitada.equals(senhaCadastrada));

        System.out.println("===============================");
        System.out.println("        Senha validada  ");
        System.out.println("        Acesso Autorizado   ");
        System.out.println("===============================");

        scanner.close();

    }
}
