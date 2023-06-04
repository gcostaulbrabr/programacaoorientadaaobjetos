// Questão 06 - Cálculo de resistências de um circuito em série

import java.util.ArrayList;
import java.util.Scanner;

public class Resistencias {
    private static final int QUANTIDADE_RESISTENCIAS = 4;

    private static float lerResistencia(Scanner scanner) {
        System.out.println("Digite o valor da resistencia:");
        return scanner.nextFloat();
    }

    public static void main(String[] args) {
        System.out.println("Cálculo de resistências de circuito em série");
        ArrayList<Float> resistencias = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < QUANTIDADE_RESISTENCIAS; i++) {
                resistencias.add(lerResistencia(scanner));
            }
        }

        float resistenciaEquivalente = resistencias.stream().reduce(0F, Float::sum);
        float menorResistencia = resistencias.stream().min(Float::compare).orElse(0F);
        float maiorResistencia = resistencias.stream().max(Float::compare).orElse(0F);

        System.out.printf("Resistência Equivalente: %.2f\n", resistenciaEquivalente);
        System.out.printf("Menor resistência: %.2f\n", menorResistencia);
        System.out.printf("Maior resistência: %.2f\n", maiorResistencia);
    }
}