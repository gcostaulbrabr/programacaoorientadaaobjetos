// Questão 07 - Login

import java.util.Scanner;

public class Login {
    private static final String LOGIN = "java8";
    private static final String SENHA = "java8";
    private static final int TENTATIVAS = 3;
    public static void main(String[] args) {
        boolean logado = false;
        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 1; i <= TENTATIVAS; i++) {
                System.out.println("Digite seu login:");
                String login = scanner.nextLine();

                System.out.println("Digite sua senha:");
                String senha = scanner.nextLine();

                logado = login.equals(LOGIN) && senha.equals(SENHA);
                if (logado) {
                    break;
                }

                if (i < TENTATIVAS) {
                    System.out.printf("Login inválido, tente novamente! Restam %d tentativas...\n", TENTATIVAS - i);
                }
            }
        }

        if (logado) {
            System.out.println("Você está logado!");
        } else {
            System.out.println("Não foi possivel fazer login! Tente novamente mais tarde");
        }
    }
}