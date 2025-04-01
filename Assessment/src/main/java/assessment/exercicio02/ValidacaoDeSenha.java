package assessment.exercicio02;

import java.util.Scanner;

public class ValidacaoDeSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        boolean senhaValida = false;
        String senha;

        while (!senhaValida) {
            System.out.print("Digite sua senha: ");
            senha = scanner.nextLine();

            String resultadoValidacao = validarSenha(senha);

            if (resultadoValidacao.equals("Senha válida!")) {
                senhaValida = true;
                System.out.println("Olá, " + nome + "! " + resultadoValidacao);
                System.out.println("Cadastro realizado com sucesso!");
            } else {
                System.out.println("Erro: " + resultadoValidacao);
                System.out.println("Por favor, tente novamente.");
            }
        }

        scanner.close();
    }

    public static String validarSenha(String senha) {
        if (senha.length() < 8) {
            return "A senha deve ter no mínimo 8 caracteres.";
        }

        if (!senha.matches(".*[A-Z].*")) {
            return "A senha deve conter pelo menos uma letra maiúscula.";
        }

        if (!senha.matches(".*[0-9].*")) {
            return "A senha deve conter pelo menos um número.";
        }

        if (!senha.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?].*")) {
            return "A senha deve conter pelo menos um caractere especial (como @, #, $, etc).";
        }

        return "Senha válida!";
    }
}
