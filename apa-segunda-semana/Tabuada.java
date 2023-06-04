// Questão 08 - Tabuada

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        int numero = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("TABUADA! Digite um número:");
            numero = scanner.nextInt();
        }

        System.out.printf("Tabuada do %d:\n\n", numero);
        for (int i = 1; i <= 10; i++) {
            System.out.printf("\t%d\tX\t%d\t=\t%d\n", i, numero, i * numero);
        }
    }
}